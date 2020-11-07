package VO;

public class CatalogosVO {

/*Todo los atributos*/
    int codmatc;
    String descripcion;
    String tipo;
    double precio;

public CatalogosVO(){}

/*Todo los codigos get*/
    public int getCodmatc(){
        return codmatc;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getTipo(){
        return tipo;
    }
    public double getPrecio(){
        return precio;
    }


/*Todo los codigos set*/
    public void setCodmatc(int codmatc){
        this.codmatc = codmatc;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

}
