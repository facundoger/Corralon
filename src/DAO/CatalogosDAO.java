package DAO;

import Conexion.Conectar;
import VO.CatalogosVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class CatalogosDAO{

    public ArrayList<CatalogosVO> Listar_CatalogosVO(){
        ArrayList<CatalogosVO> list = new ArrayList<CatalogosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                CatalogosVO vo = new CatalogosVO();
                vo.setCodmatc(rs.getInt(1));
                vo.setDescripcion(rs.getString(2));
                vo.setTipo(rs.getString(3));
                vo.setPrecio(rs.getDouble(4));
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
    public void Agregar_CatalogosVO(CatalogosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmatc());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getTipo());
            ps.setDouble(4, vo.getPrecio());
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
    public void Modificar_CatalogosVO(CatalogosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmatc());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getTipo());
            ps.setDouble(4, vo.getPrecio());
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
    public void Eliminar_CatalogosVO(CatalogosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmatc());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getTipo());
            ps.setDouble(4, vo.getPrecio());
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
