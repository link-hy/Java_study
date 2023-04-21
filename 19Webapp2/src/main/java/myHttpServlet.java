import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 原始servlet接口实现
 */

public class myHttpServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //根据请求不同分别处理
        HttpServletRequest request=(HttpServletRequest) req;

         String method= request.getMethod();

         if("GET".equals(method)){
             //get
             doGet(req,res);
         }else{
             //post
             doPost(req,res);
         }

    }

    protected void doPost(ServletRequest req, ServletResponse res) {
    }

    protected void doGet(ServletRequest req, ServletResponse res) {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
