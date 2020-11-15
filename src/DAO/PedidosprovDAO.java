package DAO;

import Conexion.Conectar;
import VO.PedidosprovVO;

import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class PedidosprovDAO {

    public ArrayList<PedidosprovVO> Listar_PedidosprovVO() {
        ArrayList<PedidosprovVO> list = new ArrayList<PedidosprovVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PedidosprovVO vo = new PedidosprovVO();
                vo.setCodpedprov(rs.getInt(1));
                vo.setCantidad(rs.getInt(2));
                vo.setPreciototal(rs.getFloat(3));
                vo.setFecha(rs.getObject(4));
                vo.setHora(rs.getObject(5));
                vo.setEstado(rs.getBoolean(6));
                vo.setCuit(rs.getString(7));
                vo.setCodmatc(rs.getInt(8));
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
    public void Agregar_PedidosprovVO(PedidosprovVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpedprov());
            ps.setInt(2, vo.getCantidad());
            ps.setFloat(3, vo.getPreciototal());
            ps.setObject(4, vo.getFecha());
            ps.setObject(5, vo.getHora());
            ps.setBoolean(6, vo.getEstado());
            ps.setString(7, vo.getCuit());
            ps.setInt(8, vo.getCodmatc());
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
    public void Modificar_PedidosprovVO(PedidosprovVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpedprov());
            ps.setInt(2, vo.getCantidad());
            ps.setFloat(3, vo.getPreciototal());
            ps.setObject(4, vo.getFecha());
            ps.setObject(5, vo.getHora());
            ps.setBoolean(6, vo.getEstado());
            ps.setString(7, vo.getCuit());
            ps.setInt(8, vo.getCodmatc());
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
    public void Eliminar_PedidosprovVO(PedidosprovVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodpedprov());
            ps.setInt(2, vo.getCantidad());
            ps.setFloat(3, vo.getPreciototal());
            ps.setObject(4, vo.getFecha());
            ps.setObject(5, vo.getHora());
            ps.setBoolean(6, vo.getEstado());
            ps.setString(7, vo.getCuit());
            ps.setInt(8, vo.getCodmatc());
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
