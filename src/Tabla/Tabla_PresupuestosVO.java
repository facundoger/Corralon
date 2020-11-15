package Tabla;

import DAO.PresupuestosDAO;
import VO.PresupuestosVO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_PresupuestosVO {

    PresupuestosDAO dao = null;


    public void visualizar_PresupuestosVO(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codpresup");
        dt.addColumn("montototal");
        dt.addColumn("fecha");
        dt.addColumn("hora");
        dt.addColumn("dnicliente");

        dao = new PresupuestosDAO();
        PresupuestosVO vo = new PresupuestosVO();
        ArrayList<PresupuestosVO> list = dao.Listar_PresupuestosVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[5];
                vo = list.get(i);
                fila[0] = vo.getCodpresup();
                fila[1] = vo.getMontototal();
                fila[2] = vo.getFecha();
                fila[3] = vo.getHora();
                fila[4] = vo.getDnicliente();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


