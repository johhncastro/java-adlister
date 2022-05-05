import java.io.Serializable;

public class Author implements Serializable {
    private long id;
    private String authors_name;

    public Author(){}

    public Author(long id, String authors_name) {
        this.id = id;
        this.authors_name = authors_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return authors_name;
    }

    public void setAuthor_name(String authors_name) {
        this.authors_name = authors_name;
    }
}
