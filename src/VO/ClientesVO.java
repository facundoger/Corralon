package VO;

public class ClientesVO {

    /*Todo los atributos*/
    String dnicliente;
    String nombre;
    String apellido;
    String telefono;
    String domicilio;
    String alias;
    String referencia;

    public ClientesVO() {
    }

    /*Todo los codigos get*/
    public String getDnicliente() {
        return dnicliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getAlias() {
        return alias;
    }

    public String getReferencia() {
        return referencia;
    }


    /*Todo los codigos set*/
    public void setDnicliente(String dnicliente) {
        this.dnicliente = dnicliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
