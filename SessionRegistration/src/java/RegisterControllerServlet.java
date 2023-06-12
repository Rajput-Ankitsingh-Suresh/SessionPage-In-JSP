
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterControllerServlet")
public class RegisterControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterControllerServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
			PreparedStatement pst = null;
			String name = request.getParameter("name");
			String uname = request.getParameter("uname");
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			String sql = "insert into user_t(name,uname,email,pwd) " + "values(?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, uname);
			pst.setString(3, email);
			pst.setString(4, pwd);
			int i = pst.executeUpdate();
			if(i > 0) {
				out.println("Successfully registered");
				response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}