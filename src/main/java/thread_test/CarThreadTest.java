package thread_test;

import java.sql.*;
import config.DbConfig;

public class CarThreadTest extends Thread {

    private static int THREADS = 10;

    int myId;

    static int nextId = 1;

    synchronized static int getNextId() {
        return nextId++;
    }

    public static void main (String args[]) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            if (args.length > 1) {
                System.out.println("Invalid Syntax.");
                System.exit(0);
            }
            else if (args.length == 1)

                THREADS = Integer.parseInt(args[0]);

            Thread[] threadList = new Thread[THREADS];

            for (int i = 0; i < THREADS; i++)
            {
                threadList[i] = new CarThreadTest();
                threadList[i].start();
            }

            for (int i = 0; i < THREADS; i++)
            {
                threadList[i].join();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public CarThreadTest() {

        super();
        myId = getNextId();
    }

    public void run() {

        try {

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

            Statement statement = connection.createStatement();
            Statement statement2 = connection2.createStatement();
            Statement statement3 = connection3.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM car");
            ResultSet resultSet2 = statement2.executeQuery("SELECT * FROM car");
            ResultSet resultSet3 = statement3.executeQuery("SELECT * FROM car");

            while (resultSet.next()) {

                System.out.println("Thread from Database " + myId +
                        " Car Id : " + resultSet.getInt(1) +
                        " Branch : " + resultSet.getString(2) +
                        " Model : " + resultSet.getString(3));
            }

            while (resultSet2.next()) {

                System.out.println("Thread from Database2 " + myId +
                        " Car Id : " + resultSet2.getInt(1) +
                        " Branch : " + resultSet2.getString(2) +
                        " Model : " + resultSet2.getString(3));
            }

            while (resultSet3.next()) {

                System.out.println("Thread from Database3 " + myId +
                        " Car Id : " + resultSet3.getInt(1) +
                        " Branch : " + resultSet3.getString(2) +
                        " Model : " + resultSet3.getString(3));
            }

            statement.close();
            resultSet.close();
            statement2.close();
            resultSet2.close();
            statement3.close();
            resultSet3.close();

            if (connection != null)
                connection.close();

            System.out.println("Thread " + myId +  " is finished. ");
        }

        catch (Exception e) {

            System.out.println("Thread " + myId + " got Exception: " + e);
            e.printStackTrace();
            return;
        }
    }

}

