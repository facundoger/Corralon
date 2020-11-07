package Tabla;

import DAO.ProveedoresDAO;
import VO.ProveedoresVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ProveedoresVO{

   ProveedoresDAO dao = null;


    public void visualizar_ProveedoresVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("cuit");
        dt.addColumn("nombre");
        dt.addColumn("telefono");
        dt.addColumn("direccion");

        dao = new ProveedoresDAO();
        ProveedoresVO vo = new ProveedoresVO();
        ArrayList<ProveedoresVO> list = dao.Listar_ProveedoresVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getCuit();
                fila[1] = vo.getNombre();
                fila[2] = vo.getTelefono();
                fila[3] = vo.getDireccion();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


