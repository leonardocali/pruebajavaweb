package modelo;

public class Usuario {

    private int id;
    private String nombre;
    private String clave;

    public Usuario(){
    
    }
    
    public Usuario(int id, String nom, String pass){
        this.id = id;
        this.nombre=nom;
        this.clave = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
