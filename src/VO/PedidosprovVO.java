package VO;

public class PedidosprovVO {

    int codpedprov;
    int cantidad;
    float preciototal;
    Object fecha;
    Object hora;
    boolean estado;
    String cuit;
    int codmatc;

    public PedidosprovVO() {
    }

    public int getCodpedprov() {
        return codpedprov;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPreciototal() {
        return preciototal;
    }

    public Object getFecha() {
        return fecha;
    }

    public Object getHora() {
        return hora;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getCuit() {
        return cuit;
    }

    public int getCodmatc() {
        return codmatc;
    }

    public void setCodpedprov(int codpedprov) {
        this.codpedprov = codpedprov;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPreciototal(float preciototal) {
        this.preciototal = preciototal;
    }

    public void setFecha(Object fecha) {
        this.fecha = fecha;
    }

    public void setHora(Object hora) {
        this.hora = hora;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setCodmatc(int codmatc) {
        this.codmatc = codmatc;
    }

}
