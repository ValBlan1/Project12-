package jdbcdemo;
import java.sql.*;

;import static java.sql.DriverManager.getConnection;


public class ConnectToMySqlDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/employees";
    private static final String USER = "root";
    private static final String PASSWORD = "Isaac2020!";

    public static void main(String[] args) {
        try {

            Connection myConn = getConnection(URL, USER, PASSWORD);

            Statement myStmt = myConn.createStatement();

            String sql = "insert into employee(employeeId, employeeName, employeeDOB)"+
                     "values (4, 'Tatiana Blankinship','07-02-1983')";

            sql = "insert into employee(employeeId, employeeName, employeeDOB)" +
                    "values (5, 'Isaac Blankinship','03-02-2020')";

            sql = "insert into employee(employeeId, employeeName, employeeDOB)" +
                    "values (6, 'Jon jr Blankinship','11-02-2020')";

            myStmt.executeUpdate(sql);

            System.out.println("Insertion Complete.");

            //ResultSet myRs = myStmt.executeQuery("SELECT * FROM employee");

            //while(myRs.next()){
               // System.out.println("ID #"+ myRs.getString("employeeId")+" "+ myRs.getString
                //        ("employeeName")+ " " +myRs.getString("employeeDOB"));
           // }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }



    }

}
