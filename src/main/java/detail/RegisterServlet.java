package detail;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import Model.User;
import Dao.UserDao;
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao = new UserDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String address = request.getParameter("address");
	    String password = request.getParameter("password");
	    
	    User user= new User();
	    user.setUsername(username);
	    user.setAddress(address);
	    user.setPassword(password);
	    
	    try {
	    	userDao.registerUser(user);
	    }catch(ClassNotFoundException e) {
	    	e.printStackTrace();
	    }
	    
	    RequestDispatcher req = request.getRequestDispatcher("ViewDetail.jsp");
		req.forward(request, response);
	    
//	    if(username.isEmpty()|| address.isEmpty() || password.isEmpty()) {
//	    	RequestDispatcher req = request.getRequestDispatcher("Rigister.jsp");
//			req.include(request, response);
//	    }else
//		{
//			RequestDispatcher req = request.getRequestDispatcher("index.html");
//			req.forward(request, response);
//		}
	}

}
