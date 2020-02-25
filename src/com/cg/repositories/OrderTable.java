package com.cg.repositories;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class OrderTable {

	public static void orderTable()
	{
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> data1 = new ArrayList<String>();
		List<String> data2 = new ArrayList<String>();
		List<String> data3 = new ArrayList<String>();
		
		
		data1.add("Order Dispatched");
		data1.add("UsrId1");
		data1.add("AdsId1");
		data1.add("January(2019)");
		map.put("OrdrId1",data1);
		
		
		data2.add("Order Not Dispatched");
		data2.add("UsrId2");
		data2.add("AdsId2");
		data2.add("February(2019)");
		map.put("OrdrId2",data2);
		
		
		data3.add("Order Dispatched");
		data3.add("UsrId3");
		data3.add("AdsId3");
		data3.add("March(2019)");
		map.put("OrdrId3",data3);
		
		for (HashMap.Entry<String,List<String>> entry : map.entrySet())  
            System.out.println(entry.getKey() + entry.getValue()); 
		
	}
}
