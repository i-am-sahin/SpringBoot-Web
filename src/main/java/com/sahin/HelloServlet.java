package com.sahin;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException {
        System.out.println("In Servlet");


//        res.getWriter().println("Hello World");
//                    Or
        res.setContentType("text/HTML"); //Telling the Browser we're sending html tags
        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World!</b></h2>");
    }

}
