package com.lei.lei01.service;

import java.util.List;

import com.lei.lei01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
	
	
}
