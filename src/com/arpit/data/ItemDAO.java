package com.arpit.data;
import com.arpit.model.*;
import java.util.*;
public interface ItemDAO {
	public List<Item> getItems() throws Exception;
	public void addItem(Item item) throws Exception;
	}
