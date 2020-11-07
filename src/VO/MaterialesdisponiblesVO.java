package VO;

public class MaterialesdisponiblesVO {

/*Todo los atributos*/
    int codmaterial;
    String descripcion;
    String tipo;
    int stock;
    double precioventa;
    int codmatc;

public MaterialesdisponiblesVO(){}

/*Todo los codigos get*/
    public int getCodmaterial(){
        return codmaterial;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getTipo(){
        return tipo;
    }
    public int getStock(){
        return stock;
    }
    public double getPrecioventa(){
        return precioventa;
    }
    public int getCodmatc(){
        return codmatc;
    }


/*Todo los codigos set*/
    public void setCodmaterial(int codmaterial){
        this.codmaterial = codmaterial;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setPrecioventa(double precioventa){
        this.precioventa = precioventa;
    }
    public void setCodmatc(int codmatc){
        this.codmatc = codmatc;
    }

}
