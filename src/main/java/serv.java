

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;


public class serv extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/trs.jsp").forward(request, response);
    }
    private int i = 0;
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        ArrayList<String> ParamList = new ArrayList();
        Enumeration param = req.getParameterNames();

        while (param.hasMoreElements()){
            ParamList.add((String)param.nextElement());
        }

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Name</title></head>");
        out.println("<body><h1>Данные</h1><br>");

        for(int i =  0; i < ParamList.size();i++){

            String value = req.getParameter(ParamList.get(i));
            out.println(ParamList.get(i) + " = " + value +"<br>");
        }
        out.println("</body></html>");

    }

}
