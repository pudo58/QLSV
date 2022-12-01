package com.hubt.reypham.dao;

import com.hubt.reypham.model.DmNganh;
import com.hubt.reypham.utils.ConnectSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tho.lv
 */
public class DmNganhDAO {

    public static DmNganhDAO getInstance() {
        return new DmNganhDAO();
    }

    public int create(DmNganh nganh) throws SQLException {
        String query = "INSERT INTO dmnganh values(?,?,?)";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, nganh.getMaNganh());
        pre.setString(2, nganh.getTenNganh());
        pre.setString(3, nganh.getMaKhoa());
        return pre.executeUpdate();
    }

    public int updateByMa(String ma, String tenNganh) throws SQLException {
        String query = "UPDATE dmnganh set tennganh = ? where manganh = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, tenNganh);
        pre.setString(2, ma);
        return pre.executeUpdate();
    }
    public int deleteByMa(String ma) throws SQLException{
        String query ="DELETE FROM dmnganh where manganh = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, ma);
        return pre.executeUpdate();
    }
    public DmNganh findByMa(String ma) throws SQLException{
        String query = "SELECT * FROM dmnganh where manganh = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, ma);
        ResultSet rs = pre.executeQuery();
        while(rs.next())
            return new DmNganh(
                    rs.getString(1), 
                    rs.getString(2), 
                    rs.getString(3)
            );
        throw new RuntimeException("Not found " +ma);
    }
}
