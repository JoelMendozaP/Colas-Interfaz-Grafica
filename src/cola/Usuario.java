package cola;
/**
 *
 * @author joelm
 */
public class Usuario {
    private String nombre;
    private int edad;
    
    public Usuario(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Usuario(Usuario us){
        this.nombre=us.getNombre();
        this.edad=us.getEdad();
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}