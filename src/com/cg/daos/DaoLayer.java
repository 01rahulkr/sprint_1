package com.cg.daos;

import com.cg.repositories.OrderProductMap;
import com.cg.repositories.OrderTable;
import com.cg.repositories.ProductTable;
import com.cg.service.RevenueReportTable;

public class DaoLayer {
	static RevenueReportTable rrTable = new RevenueReportTable();
	static ProductTable pTable = new ProductTable();
	static OrderProductMap opMap = new OrderProductMap();
	static OrderTable oTable = new OrderTable();
	public static void showRevenueReportTable()
	{
		rrTable.revenueReportTable();
		rrTable.ShowRevenueReportTable();
	}
	public static void showProductTable()
	{
		pTable.productTable();
	}
	public static void showOrderTable()
	{
		oTable.orderTable();
	}
	public static void showOrderProductMap()
	{
		opMap.orderProductMap();
	}
	
	
}
