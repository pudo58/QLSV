package com.hubt.reypham.dao;

import com.hubt.reypham.model.DmDiemHocPhan;
import com.hubt.reypham.utils.ConnectSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tho.lv
 */
public class DmDiemHocPhanDAO {
    public static DmDiemHocPhanDAO getInstance(){
        return new DmDiemHocPhanDAO();
    }
    public int create(DmDiemHocPhan dmDiemHocPhan) throws SQLException{
        String query = "INSERT INTO DiemHP VALUES(?,?,?)";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, dmDiemHocPhan.getMaSv());
        pre.setString(2, dmDiemHocPhan.getMaHp());
        pre.setString(3, dmDiemHocPhan.getDiemHp()+"");
        return pre.executeUpdate();
    }
    public int updateDiemHocPhan(String maHocPhan,double diem) throws SQLException{
        String query = "UPDATE DiemHP SET DiemHP = ? where MaHp = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, diem+"");
        pre.setString(2, maHocPhan);
        return pre.executeUpdate();
    }
    public int deleteByMa(String maHocPhan) throws SQLException{
        String query = "DELETE FROM DiemHP where MaHp = ?";
         PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         pre.setString(1, maHocPhan);
         return pre.executeUpdate();
    }
    public DmDiemHocPhan findByMa(String maHocPhan) throws SQLException{
        String query =  "SELECT * FROM DiemHp where MaHp = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1,maHocPhan);
        ResultSet rs = pre.executeQuery();
        while(rs.next())
            return new DmDiemHocPhan(rs.getString(1), rs.getString(2), rs.getDouble(3));
        throw new RuntimeException("ma hoc phan khong co");
    }
}
