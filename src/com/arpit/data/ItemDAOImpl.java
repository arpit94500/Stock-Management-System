package com.arpit.data;

import java.util.*;
import java.util.Date;
import java.sql.*;
import com.arpit.model.Item;

public class ItemDAOImpl implements ItemDAO{

	@Override
	public List<Item> getItems() throws Exception {
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Item> items = new ArrayList<Item>();
		try
		{
			con=ConnectionFactory.getCon();
			ps = con.prepareStatement("Select * from item");
			rs = ps.executeQuery();
			while(rs.next())
			{
				int itemCode = rs.getInt(1);
			    String itemName = rs.getString(2);
			    String unit = rs.getString(3);
			    int beginingInventory = rs.getInt(4);
			    int quantityOnHand = rs.getInt(5);;
			    double pricePerUnit = rs.getDouble(6);;
			    Date dateOfManufacture = rs.getDate(7);;
			    Date dateOfExpiry = rs.getDate(8);;
			    String location = rs.getString(9);
			    String itemCategory = rs.getString(10);
			    Item item = new Item(itemCode, itemName, unit, beginingInventory, quantityOnHand, pricePerUnit, dateOfManufacture, dateOfExpiry, location, itemCategory);
			    items.add(item);
			    
			}
		}
		finally
		{
			
		}
		return items;
	}

	@Override
	public void addItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
