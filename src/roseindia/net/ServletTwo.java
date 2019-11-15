package roseindia.net;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	
	private static final long serialVersionUID = -5836604690833953048L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Object name = request.getAttribute("name");
		out.println("<html><head><title>request.setAttribute</title></head><body>");
		out.println("<h2>request.setAttribute() Example</h2>");
		out.println("Attribute Value : " +name);
		out.println("</body></html>");
	}

}
