package servlets;

import config.DbConfig;
import model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="CarReadServlet", urlPatterns = "/read")
public class CarReadServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Car> cars = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    DbConfig.INSTANCE.getUrl(),
                    DbConfig.INSTANCE.getLogin(),
                    DbConfig.INSTANCE.getPassword());

            Connection connection2 = DriverManager.getConnection(
                    DbConfig.INSTANCE.getUrl2(),
                    DbConfig.INSTANCE.getLogin(),
                    DbConfig.INSTANCE.getPassword());

            Connection connection3 = DriverManager.getConnection(
                    DbConfig.INSTANCE.getUrl3(),
                    DbConfig.INSTANCE.getLogin(),
                    DbConfig.INSTANCE.getPassword());

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM car");
            PreparedStatement statement2 = connection2.prepareStatement("SELECT * FROM car");
            PreparedStatement statement3 = connection3.prepareStatement("SELECT * FROM car");

            ResultSet resultSet = statement.executeQuery();
            ResultSet resultSet2 = statement2.executeQuery();
            ResultSet resultSet3 = statement3.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String branch = resultSet.getString("branch");
                String model = resultSet.getString("model");
                cars.add(new Car(id, branch, model));
            }

            while (resultSet2.next()) {

                int id = resultSet2.getInt("id");
                String branch = resultSet2.getString("branch");
                String model = resultSet2.getString("model");
                cars.add(new Car(id, branch, model));
            }

            while (resultSet3.next()) {

                int id = resultSet3.getInt("id");
                String branch = resultSet3.getString("branch");
                String model = resultSet3.getString("model");
                cars.add(new Car(id, branch, model));
            }

            req.setAttribute("cars", cars);
            req.getRequestDispatcher("read.jsp").forward(req, resp);

                statement.close();
                resultSet.close();
                connection.close();

                statement2.close();
                resultSet2.close();
                connection2.close();

                statement3.close();
                resultSet3.close();
                connection3.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }

    }
}
