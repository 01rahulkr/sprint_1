package com.cg.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class RevenueReportTable {
	List<Object> data1 = new ArrayList<Object>();
	List<Object> data2 = new ArrayList<Object>();
	List<Object> data3 = new ArrayList<Object>();
	List<Object> data4 = new ArrayList<Object>();
	List<Object> data5 = new ArrayList<Object>();
	List<Object> data6 = new ArrayList<Object>();
	List<Object> data = new ArrayList<Object>();
	
	public  int yearlyGrowthReport()
	{
		 int sum =0;
		 int i=0;
		 Iterator<Object> iterator = data.iterator();
			while(iterator.hasNext()) {
				
					@SuppressWarnings("unchecked")
					List<Object> list2 = (List<Object>) data.get(i);
					List<Object> list = list2;
					sum = sum + (Integer)list.get(5);
					iterator.next();
					i= i+1;
	}		
		System.out.println("Yearly Growth Report is : = " + sum);
		return sum;	
	}
	public void ShowRevenueReportTable()
	{
		Iterator<Object> iterator = data.iterator();
		while(iterator.hasNext()) {
				
		         System.out.print("\n"+ iterator.next());}
	}
	
	void monthlyGrowthReport()
	{
		 int [] months = new int[12];
		 int i =0 ;
		 Iterator<Object> it = data.iterator();
		 while(it.hasNext())
		 {
			 @SuppressWarnings("unchecked")
			List<Object> list2 =(List<Object>) data.get(i);
			 List<Object> list = list2;
			 if(list.get(1) == "January(2019)")
			 {
				 months[0] = months[0] + (Integer)list.get(5);
			 }
			 else if(list.get(1) == "February(2019)")
			 {
				 months[1] = months[1] + (Integer)list.get(5);
			 }
			 else if(list.get(1) == "March(2019)")
				 months[2] = months[2] + (Integer)list.get(5);
			 else if(list.get(1) == "April(2019)")
			 {
				 months[3] = months[3] + (Integer)list.get(5);
			 }
			 else if(list.get(1) == "May(2019)")
			 {
				 months[4] = months[4] + (Integer)list.get(5);
			 }
			 it.next();
			 i+=1;
		 }
		 System.out.println("January  :  " + months[0]);
		 System.out.println("February :  " + months[1]);
		 System.out.println("March    :  " + months[2]);
		 System.out.println("April    :  " + months[3]);
		 System.out.println("May      :  " + months[4]);
	}
	
	public void revenueReportTable()
	{
			
	data.add(data1);
	data.add(data2);
	data.add(data3);
	data.add(data4);
	data.add(data5);
	data.add(data6);
	
	
	data1.add("UsrId1");
	data1.add("January(2019)");
	data1.add("OrdrId1");
	data1.add("PrdtId1");
	data1.add("Clothes");
	data1.add(200);
	
	
	data2.add("UsrId2");
	data2.add("February(2019)");
	data2.add("OrdrId2");
	data2.add("PrdtId2");
	data2.add("LunchBox");
	data2.add(550);
	
	data3.add("UsrId3");
	data3.add("March(2019)");
	data3.add("OrdrId3");
	data3.add("PrdtId3");
	data3.add("Golf Equipment");
	data3.add(650);
	

	data4.add("UsrId4");
	data4.add("April(2019)");
	data4.add("OrdrId4");
	data4.add("PrdtId2");
	data4.add("Pen");
	data4.add(400);
	

	data5.add("UsrId5");
	data5.add("May(2019)");
	data5.add("OrdrId5");
	data5.add("PrdtId4");
	data5.add("Shirts");
	data5.add(250);
	

	data6.add("UsrId6");
	data6.add("June(2019)");
	data6.add("OrdrId6");
	data6.add("PrdtId3");
	data6.add("T-shirts");
	data6.add(500);	
}
}