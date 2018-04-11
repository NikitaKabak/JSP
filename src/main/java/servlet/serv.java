package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class serv extends HttpServlet  {
    private static int count = 0;


   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
       resp.setContentType("text/html;charset=uft-8");

       PrintWriter out = resp.getWriter();
       out.println("<html><head><title>FirstServlet</title></head>");
       out.println("<body>" + "<Font color = red>" + "<h1>FirstServlet</h1>" + "</font>" + "</body>" + "</html>");
}
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
       super.doPost(req,resp);
       doGet(req,resp);
}
}
