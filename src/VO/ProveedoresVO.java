package VO;

public class ProveedoresVO {

    String cuit;
    String nombre;
    String telefono;
    String direccion;

    public ProveedoresVO() {
    }

    public String getCuit() {
        return cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
