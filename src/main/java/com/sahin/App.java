package com.sahin;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );
        Tomcat tomcat  = new Tomcat();
        tomcat.start();
        tomcat.getServer().await();
    }
}
