import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

public class FilterForm implements Filter {
    private FilterConfig config = null;
    private boolean active = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        String act = config.getInitParameter("active");
        if (act != null) active = (act.toUpperCase().equals("TRUE"));



    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(active);
        if(active){
            ArrayList<String> ParamList = new ArrayList();
            Enumeration param = servletRequest.getParameterNames();
            while (param.hasMoreElements()){
                ParamList.add((String)param.nextElement());
            }
            PrintWriter out = servletResponse.getWriter();
            out.println("<html><head><title>Name</title></head>");
            out.println("<body><h1>ДанныеФильтра</h1><br>");
            for(int i =  0; i < ParamList.size();i++){
                if(servletRequest.getParameter(ParamList.get(i)) != ""){
                    String[] value = new String[ParamList.size()];
                    value[i] = servletRequest.getParameter(ParamList.get(i));
                } else {
                    servletRequest.getRequestDispatcher("/trs.jsp").forward(servletRequest, servletResponse);
                }

            }
        }

    }

    @Override
    public void destroy() {
        config = null;
    }
}
