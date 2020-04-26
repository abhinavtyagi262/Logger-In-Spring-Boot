package com.abhinav.Logger_In_Spring_Boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
	private static Logger log = LoggerFactory.getLogger(App.class);
    
	public static void main( String[] args )
    {
    	log.info("Inside main method");
        System.out.println( "Hello World!" );
        log.info("End of main method");
    }
}
