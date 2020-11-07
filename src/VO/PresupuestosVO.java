package VO;

public class PresupuestosVO {

/*Todo los atributos*/
    int codpresup;
    double montototal;
    Object fecha;
    Object hora;
    String dnicliente;

public PresupuestosVO(){}

/*Todo los codigos get*/
    public int getCodpresup(){
        return codpresup;
    }
    public double getMontototal(){
        return montototal;
    }
    public Object getFecha(){
        return fecha;
    }
    public Object getHora(){
        return hora;
    }
    public String getDnicliente(){
        return dnicliente;
    }


/*Todo los codigos set*/
    public void setCodpresup(int codpresup){
        this.codpresup = codpresup;
    }
    public void setMontototal(double montototal){
        this.montototal = montototal;
    }
    public void setFecha(Object fecha){
        this.fecha = fecha;
    }
    public void setHora(Object hora){
        this.hora = hora;
    }
    public void setDnicliente(String dnicliente){
        this.dnicliente = dnicliente;
    }

}
