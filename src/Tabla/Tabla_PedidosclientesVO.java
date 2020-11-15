package Tabla;

import DAO.PedidosclientesDAO;
import VO.PedidosclientesVO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_PedidosclientesVO {

    PedidosclientesDAO dao = null;


    public void visualizar_PedidosclientesVO(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codpedcliente");
        dt.addColumn("montototal");
        dt.addColumn("fecha");
        dt.addColumn("hora");
        dt.addColumn("modopedido");
        dt.addColumn("formapago");
        dt.addColumn("estado");
        dt.addColumn("dnicliente");

        dao = new PedidosclientesDAO();
        PedidosclientesVO vo = new PedidosclientesVO();
        ArrayList<PedidosclientesVO> list = dao.Listar_PedidosclientesVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getCodpedcliente();
                fila[1] = vo.getMontototal();
                fila[2] = vo.getFecha();
                fila[3] = vo.getHora();
                fila[4] = vo.getModopedido();
                fila[5] = vo.getFormapago();
                fila[6] = vo.getEstado();
                fila[7] = vo.getDnicliente();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


