package Tabla;

import DAO.RemitosDAO;
import VO.RemitosVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_RemitosVO{

   RemitosDAO dao = null;


    public void visualizar_RemitosVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("numremito");
        dt.addColumn("monto");
        dt.addColumn("fecha");
        dt.addColumn("hora");
        dt.addColumn("codpedprov");

        dao = new RemitosDAO();
        RemitosVO vo = new RemitosVO();
        ArrayList<RemitosVO> list = dao.Listar_RemitosVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5];
                vo = list.get(i);
                fila[0] = vo.getNumremito();
                fila[1] = vo.getMonto();
                fila[2] = vo.getFecha();
                fila[3] = vo.getHora();
                fila[4] = vo.getCodpedprov();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


