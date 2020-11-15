package Tabla;

import DAO.MaterialespedidosDAO;
import VO.MaterialespedidosVO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_MaterialespedidosVO {

    MaterialespedidosDAO dao = null;


    public void visualizar_MaterialespedidosVO(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codmaterial");
        dt.addColumn("codpedcliente");
        dt.addColumn("cantidad");

        dao = new MaterialespedidosDAO();
        MaterialespedidosVO vo = new MaterialespedidosVO();
        ArrayList<MaterialespedidosVO> list = dao.Listar_MaterialespedidosVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getCodmaterial();
                fila[1] = vo.getCodpedcliente();
                fila[2] = vo.getCantidad();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


