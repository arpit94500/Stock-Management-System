package com.arpit.model;
import java.util.*;
public class Item {
    private int itemCode;
    private String itemName;
    private String unit;
    private int beginingInventory;
    private int quantityOnHand;
    private double pricePerUnit;
    private Date dateOfManufacture;
    private Date dateOfExpiry;
    private String location;
    private String itemCategory;
    
    public Item()
    {
    	
    }

	public Item(int itemCode, String itemName, String unit, int beginingInventory, int quantityOnHand,
			double pricePerUnit, Date dateOfManufacture, Date dateOfExpiry, String location, String itemCategory) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unit = unit;
		this.beginingInventory = beginingInventory;
		this.quantityOnHand = quantityOnHand;
		this.pricePerUnit = pricePerUnit;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.location = location;
		this.itemCategory = itemCategory;
	}

	public Item(String itemName, String unit, int beginingInventory, int quantityOnHand, double pricePerUnit,
			Date dateOfManufacture, Date dateOfExpiry, String location, String itemCategory) {
		super();
		this.itemName = itemName;
		this.unit = unit;
		this.beginingInventory = beginingInventory;
		this.quantityOnHand = quantityOnHand;
		this.pricePerUnit = pricePerUnit;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.location = location;
		this.itemCategory = itemCategory;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getBeginingInventory() {
		return beginingInventory;
	}

	public void setBeginingInventory(int beginingInventory) {
		this.beginingInventory = beginingInventory;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", unit=" + unit + ", beginingInventory="
				+ beginingInventory + ", quantityOnHand=" + quantityOnHand + ", pricePerUnit=" + pricePerUnit
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", location="
				+ location + ", itemCategory=" + itemCategory + "]";
	}
    
}
