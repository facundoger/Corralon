package DAO;

import Conexion.Conectar;
import VO.MaterialesdisponiblesVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class MaterialesdisponiblesDAO{

    public ArrayList<MaterialesdisponiblesVO> Listar_MaterialesdisponiblesVO(){
        ArrayList<MaterialesdisponiblesVO> list = new ArrayList<MaterialesdisponiblesVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                MaterialesdisponiblesVO vo = new MaterialesdisponiblesVO();
                vo.setCodmaterial(rs.getInt(1));
                vo.setDescripcion(rs.getString(2));
                vo.setTipo(rs.getString(3));
                vo.setStock(rs.getInt(4));
                vo.setPrecioventa(rs.getFloat(5));
                vo.setCodmatc(rs.getInt(6));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_MaterialesdisponiblesVO(MaterialesdisponiblesVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmaterial());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getTipo());
            ps.setInt(4, vo.getStock());
            ps.setFloat(5, vo.getPrecioventa());
            ps.setInt(6, vo.getCodmatc());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_MaterialesdisponiblesVO(MaterialesdisponiblesVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmaterial());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getTipo());
            ps.setInt(4, vo.getStock());
            ps.setFloat(5, vo.getPrecioventa());
            ps.setInt(6, vo.getCodmatc());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_MaterialesdisponiblesVO(MaterialesdisponiblesVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmaterial());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getTipo());
            ps.setInt(4, vo.getStock());
            ps.setFloat(5, vo.getPrecioventa());
            ps.setInt(6, vo.getCodmatc());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
