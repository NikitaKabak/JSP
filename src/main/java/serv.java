

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;


public class serv extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/trs.jsp").forward(request, response);
    }
    private int i = 0;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Map<String,String> ParamList = new HashMap<String, String>();
        Enumeration param = request.getParameterNames();
     /*   System.out.println(nameparam);
        ParamList.put(nameparam,request.getParameter(nameparam));*/


        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Name</title></head>");
        out.println("<body><h1>Данные</h1><br>");

        while (param.hasMoreElements()){
            String nameparam = (String)param.nextElement();
            System.out.println(nameparam);
            System.out.println(nameparam);
            System.out.println(request.getParameter(nameparam));
            ParamList.put(nameparam,request.getParameter(nameparam))                 ;
        }
        for( Map.Entry<String, String> entry :ParamList.entrySet() ){
            if(entry.getValue() != ""){
                System.out.println( entry.getKey() + " " + entry.getValue() );
                out.println(entry.getKey() + " = " + entry.getValue() +"<br>");
            } else {
                for(Map.Entry<String, String> entry1 :ParamList.entrySet()){
                    request.getSession().setAttribute( "list",ParamList);
                }
                request.getRequestDispatcher("/test.jsp").forward(request, response);
            }

        }

        out.println("</body></html>");

    }

}
