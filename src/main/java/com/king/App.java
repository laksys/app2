package com.king;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )  {
    	System.out.println("-----------begin------------");

    	LOG.info("Running main method...");

    	if( args.length > 0 )
    		LOG.info("List of arguments: {}", Arrays.toString(args));

    	for(int i=0; i<5; i++)
	        LOG.info( "Hello World!" );

        System.out.println("-----------ends-------------");
    }
}
