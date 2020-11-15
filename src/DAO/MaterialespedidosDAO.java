package DAO;

import Conexion.Conectar;
import VO.MaterialespedidosVO;

import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class MaterialespedidosDAO {

    public ArrayList<MaterialespedidosVO> Listar_MaterialespedidosVO() {
        ArrayList<MaterialespedidosVO> list = new ArrayList<MaterialespedidosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MaterialespedidosVO vo = new MaterialespedidosVO();
                vo.setCodmaterial(rs.getInt(1));
                vo.setCodpedcliente(rs.getInt(2));
                vo.setCantidad(rs.getInt(3));
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
    public void Agregar_MaterialespedidosVO(MaterialespedidosVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmaterial());
            ps.setInt(2, vo.getCodpedcliente());
            ps.setInt(3, vo.getCantidad());
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
    public void Modificar_MaterialespedidosVO(MaterialespedidosVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmaterial());
            ps.setInt(2, vo.getCodpedcliente());
            ps.setInt(3, vo.getCantidad());
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
    public void Eliminar_MaterialespedidosVO(MaterialespedidosVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodmaterial());
            ps.setInt(2, vo.getCodpedcliente());
            ps.setInt(3, vo.getCantidad());
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
