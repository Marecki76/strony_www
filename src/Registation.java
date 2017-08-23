

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registation
 */
@WebServlet("/Registation")
public class Registation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//PrintWriter out = response.getWriter();

//String firstName = request.getParameter("firstName");
//String lastName = request.getParameter("lastName");

//out.println("<h3>Reading QueryString data using 'String getParameter (String name)' method : </h3>");
//out.println("<div>");
//out.println("<p>Imie : " + firstName + "</p>");
//out.println("<p>Nazwisko : " + lastName + "</p>");
//out.println("</div>");

//out.println("<h3>Reading QueryString data using 'Enumeration getParameterNames ()' method : </h3>");
//Enumeration<String> paramNames = request.getParameterNames();
//out.println("<div>");
//while (paramNames.hasMoreElements()) {
	//String paramName = paramNames.nextElement();
	//String paramValue = request.getParameter(paramName);
	//out.println("<p>" + paramName + " : " + paramValue + "</p>");
//}
//out.println("</div>");
	
String username = request.getParameter("userName");
String passwd = request.getParameter("passwd");
String gender = request.getParameter("gender");
String kraj = request.getParameter("kraj");
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<div>");
out.println("<p>Imie i Nazwisko : " + username + "</p>");
out.println("<p>Haslo : " + passwd + "</p>");
out.println("<p>Plec : " + gender + "</p>");
out.println("<p>Kraj : " + kraj + "</p>");

out.println("</div>");	




}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
