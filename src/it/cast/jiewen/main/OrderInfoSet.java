package it.cast.jiewen.main;

import java.util.HashMap;
import java.util.Map;

/************* ��������� ************/
public class OrderInfoSet {
	Map<Integer, OrderInfo> hashmap = new HashMap<Integer, OrderInfo>();

	public Map<Integer, OrderInfo> getHashmap() {
		return hashmap;
	}

	public void setHashmap(Map<Integer, OrderInfo> hashmap) {
		this.hashmap = hashmap;
	}

}
