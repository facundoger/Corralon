package DAO;

import Conexion.Conectar;
import VO.PresupuestosVO;

import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class PresupuestosDAO {

    public ArrayList<PresupuestosVO> Listar_PresupuestosVO() {
        ArrayList<PresupuestosVO> list = new ArrayList<PresupuestosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PresupuestosVO vo = new PresupuestosVO();
                vo.setCodpresup(rs.getInt(1));
                vo.setMontototal(rs.getFloat(2));
                vo.setFecha(rs.getObject(3));
                vo.setHora(rs.getObject(4));
                vo.setDnicliente(rs.getString(5));
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
    public void Agregar_PresupuestosVO(PresupuestosVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpresup());
            ps.setFloat(2, vo.getMontototal());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setString(5, vo.getDnicliente());
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
    public void Modificar_PresupuestosVO(PresupuestosVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpresup());
            ps.setFloat(2, vo.getMontototal());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setString(5, vo.getDnicliente());
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
    public void Eliminar_PresupuestosVO(PresupuestosVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpresup());
            ps.setFloat(2, vo.getMontototal());
            ps.setObject(3, vo.getFecha());
            ps.setObject(4, vo.getHora());
            ps.setString(5, vo.getDnicliente());
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
