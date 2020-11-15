package Tabla;

import DAO.ClientesDAO;
import VO.ClientesVO;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ClientesVO {

    ClientesDAO dao = null;


    public void visualizar_ClientesVO(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("dnicliente");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("telefono");
        dt.addColumn("domicilio");
        dt.addColumn("alias");
        dt.addColumn("referencia");

        dao = new ClientesDAO();
        ClientesVO vo = new ClientesVO();
        ArrayList<ClientesVO> list = dao.Listar_ClientesVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getDnicliente();
                fila[1] = vo.getNombre();
                fila[2] = vo.getApellido();
                fila[3] = vo.getTelefono();
                fila[4] = vo.getDomicilio();
                fila[5] = vo.getAlias();
                fila[6] = vo.getReferencia();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


