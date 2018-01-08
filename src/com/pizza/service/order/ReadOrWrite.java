package com.pizza.service.order;

import java.util.List;

public interface ReadOrWrite {
	 public List<OrderItem> readOrder();
	 public void writeOrder(List<OrderItem> pSortedOrdersLst);
}
