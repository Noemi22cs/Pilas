package pilas;
/**
 *
 * @author Noemi
 */
public class Vecinos {
    private String nombre;
    private String colonia;
    
    public Vecinos(){
        this.nombre="";
        this.colonia="";
    }
    public Vecinos (String nombre, String colonia){
        this.nombre=nombre;
        this.colonia=colonia;
    }
    public String getNombre(){
        return nombre;
    }
    public String getColonia(){
        return colonia;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setColonia(String colonia){
        this.colonia=colonia;
    }
}
