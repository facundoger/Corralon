package DAO;

import Conexion.Conectar;
import VO.ProveedoresVO;

import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class ProveedoresDAO {

    public ArrayList<ProveedoresVO> Listar_ProveedoresVO() {
        ArrayList<ProveedoresVO> list = new ArrayList<ProveedoresVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProveedoresVO vo = new ProveedoresVO();
                vo.setCuit(rs.getString(1));
                vo.setNombre(rs.getString(2));
                vo.setTelefono(rs.getString(3));
                vo.setDireccion(rs.getString(4));
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
    public void Agregar_ProveedoresVO(ProveedoresVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCuit());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getTelefono());
            ps.setString(4, vo.getDireccion());
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
    public void Modificar_ProveedoresVO(ProveedoresVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCuit());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getTelefono());
            ps.setString(4, vo.getDireccion());
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
    public void Eliminar_ProveedoresVO(ProveedoresVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getCuit());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getTelefono());
            ps.setString(4, vo.getDireccion());
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
