package Tabla;

import DAO.MaterialesdisponiblesDAO;
import VO.MaterialesdisponiblesVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_MaterialesdisponiblesVO{

   MaterialesdisponiblesDAO dao = null;


    public void visualizar_MaterialesdisponiblesVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codmaterial");
        dt.addColumn("descripcion");
        dt.addColumn("tipo");
        dt.addColumn("stock");
        dt.addColumn("precioventa");
        dt.addColumn("codmatc");

        dao = new MaterialesdisponiblesDAO();
        MaterialesdisponiblesVO vo = new MaterialesdisponiblesVO();
        ArrayList<MaterialesdisponiblesVO> list = dao.Listar_MaterialesdisponiblesVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getCodmaterial();
                fila[1] = vo.getDescripcion();
                fila[2] = vo.getTipo();
                fila[3] = vo.getStock();
                fila[4] = vo.getPrecioventa();
                fila[5] = vo.getCodmatc();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


