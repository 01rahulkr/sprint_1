package com.cg.repositories;
import java.util.*;
public class ProductTable{
	public static void productTable()
	{
		
		Map<String, List<Object>> ptMap = new HashMap<String, List<Object>>();
		List<Object> data1 = new ArrayList<Object>();
		List<Object> data2 = new ArrayList<Object>();
		List<Object> data3 = new ArrayList<Object>();
		
		data1.add(100);
		data1.add("red");
		data1.add("10*17*14");
		data1.add("15");
		data1.add("Nylon");
		data1.add("T-shirts");
		data1.add("abc.cotton.ltd");
		data1.add("Clothes");
		ptMap.put("PrdtId1",data1);
		
		
		
		data2.add(300);
		data2.add("Silver");
		data2.add("21*22*24");
		data2.add("16");
		data2.add("Steel");
		data2.add("SteelProduct");
		data2.add("steel.pvt.ltd");
		data2.add("LunchBox");
		ptMap.put("PrdtId2",data2);
		
		
		data3.add(400);
		data3.add("Violet");
		data3.add("12*18*21");
		data3.add("17");
		data3.add("BallPoint");
		data3.add("StudyMaterialt");
		data3.add("link.pvt.ltd");
		data3.add("Pen");
		ptMap.put("PrdtId3",data3);
		
		for (HashMap.Entry<String,List<Object>> entry : ptMap.entrySet())  
            System.out.println(entry.getKey() +  entry.getValue()); 
		
		

	}
}
