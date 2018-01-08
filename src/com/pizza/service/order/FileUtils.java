package com.pizza.service.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils implements ReadOrWrite{

	public FileUtils() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Helper to read orders from File
	 * @return
	 */
	  public List<OrderItem> readOrder() {
		  PropertiesReaderHelper proHelp=PropertiesReaderHelper.getInstance();
		  String file=proHelp.getInputFileName();
	      List<OrderItem> orderItemList = new ArrayList<OrderItem>();
	        try {
	        	//TODO: read it from properties file if i can.
	            Scanner input = new Scanner(new File(file)).useDelimiter("\\s+");
	            while (input.hasNextLine()) {
	                String item = input.next();
	                Long time = input.nextLong();
	                orderItemList.add(new OrderItem(item,time));
	                input.nextLine();
	            }
	            input.close();
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	            } 
	        return orderItemList;
	    }
	  
	  /**
		 * Helper to write orders from File
		 * @return
		 */
		  public void writeOrder(List<OrderItem> pOrderLst) {
			  String outPutFileLoc=PropertiesReaderHelper.getInstance().getOutputFileName();
			  File newTextFile = new File(outPutFileLoc+"\\OrderResults.txt");
			  FileWriter fw=null;
			try {
				fw = new FileWriter(newTextFile);
				 fw.write("Order"+"      "+"Time"+"\n");
				 fw.write("____________________________________________"+"\n");
		        for(OrderItem item:pOrderLst){
		            fw.write(item.getItemName()+"   "+item.getTime()+"\n");
		        }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				 try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		       
		    }
	  
}

