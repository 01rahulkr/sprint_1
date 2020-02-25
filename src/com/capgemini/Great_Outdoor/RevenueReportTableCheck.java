package com.capgemini.Great_Outdoor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.service.RevenueReportTable;

class RevenueReportTableCheck {
	@Test
	void test1()
	{
		int a;
		RevenueReportTable rrTable = new RevenueReportTable();
		a = rrTable.yearlyGrowthReport();
		assertEquals(0,a);
	}
}	
