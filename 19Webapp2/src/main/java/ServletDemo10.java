import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


/**
 *响应 字符数据
 */
@WebServlet("/demo10")
public class ServletDemo10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先编码再打流才不会乱码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //设置响应的数据格式及数据的编码
      //  response.setContentType("text/html;charset=utf-8");
        response.setHeader("content-type","text/html");
        writer.write("<h1>你好</h1>");
        writer.write("aaa");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

