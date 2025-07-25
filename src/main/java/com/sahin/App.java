package com.sahin;

import org.apache.catalina.Context;
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
        tomcat.setPort(8080);

        //Servlet Mapping


        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");


        tomcat.start();
        tomcat.getServer().await();
    }
}
