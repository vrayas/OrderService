package com.test.junits;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.test.OrderHelper;
import com.test.OrderItem;

public class TestOrderHelper {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReadOrderData() {
		 List<OrderItem> items = OrderHelper.readOrderData();
		  Assert.assertEquals(9, items.size());
	}

	@Test
	public void testExecuteOrders() {
		
	}

}
