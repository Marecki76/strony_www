

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowRequestHeaders
 */
@WebServlet("/ShowRequestHeaders")
public class ShowRequestHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowRequestHeaders() {
        super();
        // TODO Auto-generated constructor stub
        
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	       
	      
	      out.println("<!Doctype HTML>");
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Showing all Request</title>");
	      out.println("<head>");
	      out.println("<body>");
	      out.println("<h1>All Request</h1>");
	      out.println("<p><b>Request Method : </b>" + request.getMethod());
	      out.println("<p><b>Request URI : </b>" + request.getRequestURI());
	      out.println("<p><b>Request Protocol : </b>" + request.getProtocol());
	      
	      Enumeration<String> headerNames = request.getHeaderNames();
	      
	      while (headerNames.hasMoreElements()) {
	    		String headerName = headerNames.nextElement();
	    		out.println("<p>" + headerName + " : " + request.getHeader(headerName) + "</p>");
	    	//}
	    	//out.println("</div>");
	      }
	      
	      //out.println("</head>");
	      out.println("</body>");
	      out.println("</head>");
	      out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
