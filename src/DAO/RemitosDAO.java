package DAO;

import Conexion.Conectar;
import VO.RemitosVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class RemitosDAO{

    public ArrayList<RemitosVO> Listar_RemitosVO(){
        ArrayList<RemitosVO> list = new ArrayList<RemitosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                RemitosVO vo = new RemitosVO();
                vo.setNumremito(rs.getInt(1));
                vo.setMonto(rs.getFloat(2));
                vo.setFecha(rs.getObject(3));
                vo.setHora(rs.getObject(4));
                vo.setCodpedprov(rs.getInt(5));
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
    public void Agregar_RemitosVO(RemitosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getNumremito());
            ps.setFloat(2, vo.getMonto());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setInt(5, vo.getCodpedprov());
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
    public void Modificar_RemitosVO(RemitosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getNumremito());
            ps.setFloat(2, vo.getMonto());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setInt(5, vo.getCodpedprov());
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
    public void Eliminar_RemitosVO(RemitosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getNumremito());
            ps.setFloat(2, vo.getMonto());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setInt(5, vo.getCodpedprov());
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
