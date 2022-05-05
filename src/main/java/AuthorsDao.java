import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors {
    private Connection connection;

    public AuthorsDao(){
        try {
            // Get the driver into our app
            DriverManager.registerDriver(new Driver());
            // Create the Connection object
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup-1"
            );
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.authors");
            while (rs.next()){
                Author author = new Author(
                        rs.getLong("id"),
                        rs.getString("authors_name")
                );
                authors.add(author);
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
        return authors;
    }

    @Override
    public void insert(Author author) {

    }
}