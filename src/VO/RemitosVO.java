package VO;

public class RemitosVO {

    int numremito;
    float monto;
    Object fecha;
    Object hora;
    int codpedprov;

    public RemitosVO() {
    }

    public int getNumremito() {
        return numremito;
    }

    public float getMonto() {
        return monto;
    }

    public Object getFecha() {
        return fecha;
    }

    public Object getHora() {
        return hora;
    }

    public int getCodpedprov() {
        return codpedprov;
    }

    public void setNumremito(int numremito) {
        this.numremito = numremito;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setFecha(Object fecha) {
        this.fecha = fecha;
    }

    public void setHora(Object hora) {
        this.hora = hora;
    }

    public void setCodpedprov(int codpedprov) {
        this.codpedprov = codpedprov;
    }

}
