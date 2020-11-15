package DAO;

import Conexion.Conectar;
import VO.PedidosclientesVO;

import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class PedidosclientesDAO {

    public ArrayList<PedidosclientesVO> Listar_PedidosclientesVO() {
        ArrayList<PedidosclientesVO> list = new ArrayList<PedidosclientesVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PedidosclientesVO vo = new PedidosclientesVO();
                vo.setCodpedcliente(rs.getInt(1));
                vo.setMontototal(rs.getFloat(2));
                vo.setFecha(rs.getObject(3));
                vo.setHora(rs.getObject(4));
                vo.setModopedido(rs.getString(5));
                vo.setFormapago(rs.getString(6));
                vo.setEstado(rs.getBoolean(7));
                vo.setDnicliente(rs.getString(8));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }


    /*Metodo agregar*/
    public void Agregar_PedidosclientesVO(PedidosclientesVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpedcliente());
            ps.setFloat(2, vo.getMontototal());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setString(5, vo.getModopedido());
            ps.setString(6, vo.getFormapago());
            ps.setBoolean(7, vo.getEstado());
            ps.setString(8, vo.getDnicliente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_PedidosclientesVO(PedidosclientesVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpedcliente());
            ps.setFloat(2, vo.getMontototal());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setString(5, vo.getModopedido());
            ps.setString(6, vo.getFormapago());
            ps.setBoolean(7, vo.getEstado());
            ps.setString(8, vo.getDnicliente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Eliminar*/
    public void Eliminar_PedidosclientesVO(PedidosclientesVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpedcliente());
            ps.setFloat(2, vo.getMontototal());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setString(5, vo.getModopedido());
            ps.setString(6, vo.getFormapago());
            ps.setBoolean(7, vo.getEstado());
            ps.setString(8, vo.getDnicliente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


}
