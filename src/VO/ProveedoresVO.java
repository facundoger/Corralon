package VO;

public class ProveedoresVO {

/*Todo los atributos*/
    String cuit;
    String nombre;
    String telefono;
    String direccion;

public ProveedoresVO(){}

/*Todo los codigos get*/
    public String getCuit(){
        return cuit;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }


/*Todo los codigos set*/
    public void setCuit(String cuit){
        this.cuit = cuit;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}
