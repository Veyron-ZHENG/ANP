package web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Horoscope extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException {
	String name = request.getParameter("name");
	String gender = request.getParameter("sex");
	String zodiac = request.getParameter("zodiac");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
 	out.println("<html>");
 	out.println("<head>");
 	out.println("<title>Hello!</title>");
 	out.println("<script>");
 	out.println("function displayHoroscope(sex,sign){");
 	out.println("if(sex==\"male\"&&sign<=6) document.writeln(\"you will have a long life\");");
 	out.println("if(sex==\"male\"&&sign>6) document.writeln(\"you will have a rich life\");");
 	out.println("if(sex==\"female\"&&sign<=6) document.writeln(\"you will find a tall handsome stranger\");");
 	out.println("if(sex==\"female\"&&sign>6) document.writeln(\"you will have six children\");");
 	out.println("}");
 	out.println("</script>");
 	out.println("</head>");
 	out.println("<body onload=displayHoroscope(\""+gender+"\",\""+zodiac+"\""+")>");
 	out.println("</body>");
 	out.println("</html>");
 	out.close();
 }
} 
