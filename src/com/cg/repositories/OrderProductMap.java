package com.cg.repositories;

import java.util.*;


public class OrderProductMap {
	public static void orderProductMap()
	{

		Map<String, List<String>> pMap = new HashMap<String, List<String>>();
		List<String> data1 = new ArrayList<String>();
		List<String> data2 = new ArrayList<String>();
		List<String> data3 = new ArrayList<String>();
		
	
		data1.add("PrdtId1");
		data1.add("PrdtUin1");
		data1.add("1");
		data1.add("0");
		pMap.put("OrdrId1",data1);


		data2.add("PrdtId2");
		data2.add("PrdtUin2");
		data2.add("0");
		data2.add("0");
		pMap.put("OrdrId2",data2);
		

		data3.add("PrdtId3");
		data3.add("PrdtUin3");
		data3.add("0");
		data3.add("1");
		pMap.put("OrdrId3",data3);
		
		for (HashMap.Entry<String,List<String>> entry : pMap.entrySet())  
            System.out.println(entry.getKey() + entry.getValue()); 
		
	}
}
