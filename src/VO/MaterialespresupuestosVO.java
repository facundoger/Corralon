package VO;

public class MaterialespresupuestosVO {

    /*Todo los atributos*/
    int codmaterial;
    int codpresup;
    int cantidad;

    public MaterialespresupuestosVO() {
    }

    /*Todo los codigos get*/
    public int getCodmaterial() {
        return codmaterial;
    }

    public int getCodpresup() {
        return codpresup;
    }

    public int getCantidad() {
        return cantidad;
    }


    /*Todo los codigos set*/
    public void setCodmaterial(int codmaterial) {
        this.codmaterial = codmaterial;
    }

    public void setCodpresup(int codpresup) {
        this.codpresup = codpresup;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
