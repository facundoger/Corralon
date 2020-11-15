package VO;

public class PresupuestosVO {

    int codpresup;
    float montototal;
    Object fecha;
    Object hora;
    String dnicliente;

    public PresupuestosVO() {
    }

    public int getCodpresup() {
        return codpresup;
    }

    public float getMontototal() {
        return montototal;
    }

    public Object getFecha() {
        return fecha;
    }

    public Object getHora() {
        return hora;
    }

    public String getDnicliente() {
        return dnicliente;
    }

    public void setCodpresup(int codpresup) {
        this.codpresup = codpresup;
    }

    public void setMontototal(float montototal) {
        this.montototal = montototal;
    }

    public void setFecha(Object fecha) {
        this.fecha = fecha;
    }

    public void setHora(Object hora) {
        this.hora = hora;
    }

    public void setDnicliente(String dnicliente) {
        this.dnicliente = dnicliente;
    }

}
