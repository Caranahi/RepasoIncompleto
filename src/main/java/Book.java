



public class Book {
    
     private int ISBN;
    private String nombreAutor;

    public Book(int ISBN, String nombreAutor) {
        this.ISBN = ISBN;
        this.nombreAutor = nombreAutor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    
}
    
}
