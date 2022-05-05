import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes{
    Connection connection
    public QuotesDao(){
        try {
            // Get the driver into our app
            DriverManager.registerDriver(new Driver());
            // Create the Connection object
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup-1"
            );
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
    @Override
    public List<Quote> all() {
        List<Quote> quotes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while (rs.next()) {
                Quote quote =new Quote(bf ekwf);wflw
            }

        };
    };

    @Override
    public void insert(Quote quote) {

    }
}
