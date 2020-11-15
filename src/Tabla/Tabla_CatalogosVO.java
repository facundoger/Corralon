package Tabla;

import DAO.CatalogosDAO;
import VO.CatalogosVO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_CatalogosVO {

    CatalogosDAO dao = null;


    public void visualizar_CatalogosVO(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codmatc");
        dt.addColumn("descripcion");
        dt.addColumn("tipo");
        dt.addColumn("precio");

        dao = new CatalogosDAO();
        CatalogosVO vo = new CatalogosVO();
        ArrayList<CatalogosVO> list = dao.Listar_CatalogosVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getCodmatc();
                fila[1] = vo.getDescripcion();
                fila[2] = vo.getTipo();
                fila[3] = vo.getPrecio();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


