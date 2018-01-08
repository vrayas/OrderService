package com.pizza.service.order;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class OrderHelper {
	
	public static List<OrderItem> readOrderData(){
		PropertiesReaderHelper proHelp=PropertiesReaderHelper.getInstance();
		ReadOrWrite util=null;
		if(proHelp.isSourceFile()){
			util=new FileUtils();
		}else{
			//TODO: need to read from DB
			util=new DataBaseUtils();
		}
		return util.readOrder();
	}
	
	/**
	 * Helper to Execute the Order sort Process
	 */
	
	public static void executeOrders(){
		 List<OrderItem> result=readOrderData();
	     result.sort((e1,e2) -> (e1.getTime()).compareTo((e2.getTime())));
		 new FileUtils().writeOrder(result);
	}
	
}

