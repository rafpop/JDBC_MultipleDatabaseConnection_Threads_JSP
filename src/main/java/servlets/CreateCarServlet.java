package servlets;

import config.DbConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name="CreateCarServlet", urlPatterns = "/create")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    DbConfig.INSTANCE.getUrl(),
                    DbConfig.INSTANCE.getLogin(),
                    DbConfig.INSTANCE.getPassword());

            PreparedStatement statement = connection.prepareStatement("INSERT INTO car(branch, model) VALUES(?, ?)");

            statement.setString(1, req.getParameter("branch"));
            statement.setString(2, req.getParameter("model"));

            statement.executeUpdate();
            statement.close();
            connection.close();

            resp.sendRedirect("read");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }
}
