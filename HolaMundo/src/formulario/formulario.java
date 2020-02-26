package formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formulario
 */
@WebServlet("/formulario")
public class formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /* HOLA COMENTARIO*/
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		final String DOC="<!DOCTYPE html>";
		final String EMPIECE="<head><title></title></head>";

		
		out.println(DOC+EMPIECE+"<body>\n"+ "Nombre: "+request.getParameter("nombre")
		+ "Apellidos: "+request.getParameter("ape")+ "</body></html>");
		

		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
