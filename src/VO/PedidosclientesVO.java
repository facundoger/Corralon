package VO;

public class PedidosclientesVO {

/*Todo los atributos*/
    int codpedcliente;
    float montototal;
    Object fecha;
    Object hora;
    String modopedido;
    String formapago;
    boolean estado;
    String dnicliente;

public PedidosclientesVO(){}

/*Todo los codigos get*/
    public int getCodpedcliente(){
        return codpedcliente;
    }
    public float getMontototal(){
        return montototal;
    }
    public Object getFecha(){
        return fecha;
    }
    public Object getHora(){
        return hora;
    }
    public String getModopedido(){
        return modopedido;
    }
    public String getFormapago(){
        return formapago;
    }
    public boolean getEstado(){
        return estado;
    }
    public String getDnicliente(){
        return dnicliente;
    }


/*Todo los codigos set*/
    public void setCodpedcliente(int codpedcliente){
        this.codpedcliente = codpedcliente;
    }
    public void setMontototal(float montototal){
        this.montototal = montototal;
    }
    public void setFecha(Object fecha){
        this.fecha = fecha;
    }
    public void setHora(Object hora){
        this.hora = hora;
    }
    public void setModopedido(String modopedido){
        this.modopedido = modopedido;
    }
    public void setFormapago(String formapago){
        this.formapago = formapago;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public void setDnicliente(String dnicliente){
        this.dnicliente = dnicliente;
    }

}
