package Tabla;

import DAO.MaterialespresupuestosDAO;
import VO.MaterialespresupuestosVO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_MaterialespresupuestosVO {

    MaterialespresupuestosDAO dao = null;


    public void visualizar_MaterialespresupuestosVO(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codmaterial");
        dt.addColumn("codpresup");
        dt.addColumn("cantidad");

        dao = new MaterialespresupuestosDAO();
        MaterialespresupuestosVO vo = new MaterialespresupuestosVO();
        ArrayList<MaterialespresupuestosVO> list = dao.Listar_MaterialespresupuestosVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getCodmaterial();
                fila[1] = vo.getCodpresup();
                fila[2] = vo.getCantidad();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


