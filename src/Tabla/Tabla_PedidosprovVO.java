package Tabla;

import DAO.PedidosprovDAO;
import VO.PedidosprovVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_PedidosprovVO{

   PedidosprovDAO dao = null;


    public void visualizar_PedidosprovVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codpedprov");
        dt.addColumn("cantidad");
        dt.addColumn("preciototal");
        dt.addColumn("fecha");
        dt.addColumn("hora");
        dt.addColumn("estado");
        dt.addColumn("cuit");
        dt.addColumn("codmatc");

        dao = new PedidosprovDAO();
        PedidosprovVO vo = new PedidosprovVO();
        ArrayList<PedidosprovVO> list = dao.Listar_PedidosprovVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getCodpedprov();
                fila[1] = vo.getCantidad();
                fila[2] = vo.getPreciototal();
                fila[3] = vo.getFecha();
                fila[4] = vo.getHora();
                fila[5] = vo.getEstado();
                fila[6] = vo.getCuit();
                fila[7] = vo.getCodmatc();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


