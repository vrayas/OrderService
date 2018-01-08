package com.test;

import java.util.List;

public interface ReadOrWrite {
	 public List<OrderItem> readOrder();
	 public void writeOrder(List<OrderItem> pSortedOrdersLst);
}
