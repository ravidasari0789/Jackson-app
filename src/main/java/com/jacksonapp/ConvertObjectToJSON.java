package com.jacksonapp;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJSON {

	                public static void main(String[] args) throws Exception{
						
	                	    Customer customer=new Customer(100, "ravi", "blr");
	                	    
	                	    ObjectMapper obj=new ObjectMapper();
	                	    
	                	    obj.writeValue(new File("customer.json"), customer);
	                	    System.out.println("completed");
					}
}
