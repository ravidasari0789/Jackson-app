package com.jacksonapp;

import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJSONToObject {

	             public static void main(String[] args) throws Exception{
					
	            	      
	            	      ObjectMapper obj=new ObjectMapper();
	            	      
	            	      Customer customer=   obj.readValue(new FileReader("customer.json"), Customer.class);
	            	      
	            	      System.out.println(customer);
				}
}
