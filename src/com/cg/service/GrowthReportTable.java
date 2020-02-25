package com.cg.service;


import java.util.Scanner;

import com.cg.daos.DaoLayer;

public class GrowthReportTable 
{	
	
	static RevenueReportTable rrTable = new RevenueReportTable();
	static DaoLayer dl = new DaoLayer();
	static void growthReportTable()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Any Choice : " + "\n" + "1. MONTHLY" + "\n" + "2. YEARLY");
		int ch = input.nextInt();
		switch(ch)
		{
		case 1: rrTable.monthlyGrowthReport(); break;
		case 2: rrTable.yearlyGrowthReport(); break;
		}
		input.close();
	}

	public static void main(String[] args)
	{
		rrTable.revenueReportTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( " Hii Enter your choice:" + "\n" + "1. Product Table"+ "\n" + "2. Order Table" + "\n" + "3. Order Product Map" + "\n" 
		        + "4. Revenue Report Table"
				+ "\n" + "5. Growth Report Table "+"\n"+ "Choice : ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: dl.showProductTable(); 
				break;
		case 2: dl.showOrderTable(); 
				break;
		case 3: dl.showOrderProductMap(); 
				break;
		case 4: dl.showRevenueReportTable(); 
				break;
		case 5: growthReportTable(); 
				break;
		default: System.out.println("Enter the valid key !"); 
				break;	
		}
		sc.close();	
   }
}
