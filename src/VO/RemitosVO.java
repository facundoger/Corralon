package VO;

public class RemitosVO {

/*Todo los atributos*/
    int numremito;
    double monto;
    Object fecha;
    Object hora;
    int codpedprov;

public RemitosVO(){}

/*Todo los codigos get*/
    public int getNumremito(){
        return numremito;
    }
    public double getMonto(){
        return monto;
    }
    public Object getFecha(){
        return fecha;
    }
    public Object getHora(){
        return hora;
    }
    public int getCodpedprov(){
        return codpedprov;
    }


/*Todo los codigos set*/
    public void setNumremito(int numremito){
        this.numremito = numremito;
    }
    public void setMonto(double monto){
        this.monto = monto;
    }
    public void setFecha(Object fecha){
        this.fecha = fecha;
    }
    public void setHora(Object hora){
        this.hora = hora;
    }
    public void setCodpedprov(int codpedprov){
        this.codpedprov = codpedprov;
    }

}
