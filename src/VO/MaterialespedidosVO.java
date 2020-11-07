package VO;

public class MaterialespedidosVO {

/*Todo los atributos*/
    int codmaterial;
    int codpedcliente;
    int cantidad;

public MaterialespedidosVO(){}

/*Todo los codigos get*/
    public int getCodmaterial(){
        return codmaterial;
    }
    public int getCodpedcliente(){
        return codpedcliente;
    }
    public int getCantidad(){
        return cantidad;
    }


/*Todo los codigos set*/
    public void setCodmaterial(int codmaterial){
        this.codmaterial = codmaterial;
    }
    public void setCodpedcliente(int codpedcliente){
        this.codpedcliente = codpedcliente;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

}
