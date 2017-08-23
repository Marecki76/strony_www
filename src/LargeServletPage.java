

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LargeServletPage
 */
@WebServlet("/LargeServletPage")
public class LargeServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LargeServletPage() {
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
	       
	      String Line = "To jest tekst demo.";
	      out.println("<!Doctype HTML>");
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Demo</title>");
	      out.println("<head>");
	      out.println("<body>");
	     
	        
	      for (int i = 0; i < 10000; i++) {
	    		//String headerName = headerNames.nextElement();
	    		out.println(Line + "</br>");
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
