package VO;

public class PedidosprovVO {

/*Todo los atributos*/
    int codpedprov;
    int cantidad;
    double preciototal;
    Object fecha;
    Object hora;
    Object estado;
    String cuit;
    int codmatc;

public PedidosprovVO(){}

/*Todo los codigos get*/
    public int getCodpedprov(){
        return codpedprov;
    }
    public int getCantidad(){
        return cantidad;
    }
    public double getPreciototal(){
        return preciototal;
    }
    public Object getFecha(){
        return fecha;
    }
    public Object getHora(){
        return hora;
    }
    public Object getEstado(){
        return estado;
    }
    public String getCuit(){
        return cuit;
    }
    public int getCodmatc(){
        return codmatc;
    }


/*Todo los codigos set*/
    public void setCodpedprov(int codpedprov){
        this.codpedprov = codpedprov;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setPreciototal(double preciototal){
        this.preciototal = preciototal;
    }
    public void setFecha(Object fecha){
        this.fecha = fecha;
    }
    public void setHora(Object hora){
        this.hora = hora;
    }
    public void setEstado(Object estado){
        this.estado = estado;
    }
    public void setCuit(String cuit){
        this.cuit = cuit;
    }
    public void setCodmatc(int codmatc){
        this.codmatc = codmatc;
    }

}
