


import java.util.List;

public class Persona {
    
     private Boolean active;
    private int id;
    private int age;
    private String eyeColor;
    private String nombre;
    private String genero;
    private String registered;
    private Float latitude;
    private Float longitude;
    private List<String> tags;
    private List<Book> libros;

    public Persona() {
    }

    public Persona(Boolean active, int id, int age, String eyeColor, String nombre, String genero, String registered, Float latitude, Float longitude, List<String> tags, List<Book> libros) {
        this.active = active;
        this.id = id;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nombre = nombre;
        this.genero = genero;
        this.registered = registered;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
        this.libros = libros;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Book> getLibros() {
        return libros;
    }

    public void setLibros(List<Book> libros) {
        this.libros = libros;
    }
    
      
    
    
}
    
    

