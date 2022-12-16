package com.hubt.reypham.dao;

import com.hubt.reypham.model.DmHocPhan;
import com.hubt.reypham.utils.ConnectSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DmHocPhanDAO {

    public static DmHocPhanDAO getInstance() {
        return new DmHocPhanDAO();
    }

    public int create(DmHocPhan dmHocPhan) throws SQLException {
        String query = "INSERT INTO DMHOCPHAN values(?,?,?,?,?)";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, dmHocPhan.getMaHp());
        pre.setString(2, dmHocPhan.getTenHp());
        pre.setString(3, dmHocPhan.getSoDvhp());
        pre.setString(4, dmHocPhan.getMaNganh());
        pre.setString(5, dmHocPhan.getHocKy());
        return pre.executeUpdate();
    }

    public int updateByMa(String ma, DmHocPhan dmHocPhan) throws SQLException {
        String query = "UPDATE DMHOCPHAN SET TenHp = ?,sodvht = ?,Hocky = ? WHERE MaHp = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, dmHocPhan.getTenHp());
        pre.setString(2, dmHocPhan.getSoDvhp());
        pre.setString(3, dmHocPhan.getHocKy());
        pre.setString(4, ma);
        return pre.executeUpdate();
    }

    public int deleteByMa(String ma) throws SQLException {
        String query = "DELETE FROM DMHOCPHAN where MaHp =?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, ma);
        return pre.executeUpdate();
    }

    public DmHocPhan findByma(String ma) throws SQLException {
        String query = "SELECT * FROM DMHOCPHAN where MaHp = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            return new DmHocPhan(
                    rs.getString(1),
                   rs.getString(2),
                  rs.getString(3),
                  rs.getString(4),
                   rs.getString(5));
        }
        throw new RuntimeException("not found");
    }
    public List<DmHocPhan> findAll() throws SQLException{
        List<DmHocPhan> list = new LinkedList<>();
         String query = "SELECT * FROM DMHOCPHAN ";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            list.add(new DmHocPhan(
                    rs.getString(1),
                   rs.getString(2),
                  rs.getString(3),
                  rs.getString(4),
                   rs.getString(5)));
        }
        return list;
    }
}
