package DAO;

import Conexion.Conectar;
import VO.ClientesVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class ClientesDAO{

    public ArrayList<ClientesVO> Listar_ClientesVO(){
        ArrayList<ClientesVO> list = new ArrayList<ClientesVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ClientesVO vo = new ClientesVO();
                vo.setDnicliente(rs.getString(1));
                vo.setNombre(rs.getString(2));
                vo.setApellido(rs.getString(3));
                vo.setTelefono(rs.getString(4));
                vo.setDomicilio(rs.getString(5));
                vo.setAlias(rs.getString(6));
                vo.setReferencia(rs.getString(7));
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
    public void Agregar_ClientesVO(ClientesVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getDnicliente());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getApellido());
            ps.setString(4, vo.getTelefono());
            ps.setString(5, vo.getDomicilio());
            ps.setString(6, vo.getAlias());
            ps.setString(7, vo.getReferencia());
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
    public void Modificar_ClientesVO(ClientesVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getDnicliente());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getApellido());
            ps.setString(4, vo.getTelefono());
            ps.setString(5, vo.getDomicilio());
            ps.setString(6, vo.getAlias());
            ps.setString(7, vo.getReferencia());
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
    public void Eliminar_ClientesVO(ClientesVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getDnicliente());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getApellido());
            ps.setString(4, vo.getTelefono());
            ps.setString(5, vo.getDomicilio());
            ps.setString(6, vo.getAlias());
            ps.setString(7, vo.getReferencia());
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
