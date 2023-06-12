import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginControllerServlet() {
        super();
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		System.out.println(uname);
		System.out.println(pwd);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root",""
                               );
			PreparedStatement pst = null;
			String sql = "select uname,pwd from user_t where uname=? and pwd=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("email",uname);
				response.sendRedirect("index.jsp?uname="+uname);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	            out.println("<font color=red>Password is wrong.</font>");
	            rd.include(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}