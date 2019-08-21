# JDBC_MultipleDatabaseConnection_Threads_JSP
This is an example code shows multiple database connection with commited data to website.

This website application allows you to create and read data from multiple databases with using single SQL query. In this example I used the same three urls in "CarReadServlet". Read site should show data from all databases. If you want to check how it works, please create the following query in your localhost database:

CREATE TABLE car (
  `id` INT NOT NULL auto_increment,
  `branch` VARCHAR(45) NULL,
  `model` VARCHAR(45) NULL,
PRIMARY KEY (`id`));

After that please change String objects included in the DbConfig.java file such as urls, login and password in accordance with yours. Additionally just create some data in the table called "car" by using following example query below in order to create some substances to read by servlet. You can create your own car by using web app as well if you configured points of access to your databases:

INSERT INTO `car` (`branch`, `model`) VALUES ('Fiat', 'Multipla'); ;-)

I created CarThreadTest java file incldues main method in order to fullfill my curiosity. This program shows results in the terminal only. It can be treated as excluded functionality from whole web app.


