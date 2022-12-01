package com.hubt.reypham.dao;

import com.hubt.reypham.model.DmLop;
import com.hubt.reypham.utils.ConnectSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tho.lv
 */
public class DmLopDAO {
    public static DmLopDAO getInstance(){
        return new DmLopDAO();
    }
    public int create(DmLop lop) throws SQLException{
        String query = "INSERT INTO dmlop values(?,?,?,?,?,?)";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, lop.getMaLop());
        pre.setString(1, lop.getTenLop());
        pre.setString(1, lop.getMaNganh());
        pre.setString(1, lop.getKhoaHoc());
        pre.setString(1, lop.getHeDaoTao());
        pre.setString(1, lop.getNamNhapHoc());
         return pre.executeUpdate();
    }
    public int updateByMa(String ma,DmLop lop) throws SQLException{
        String query = "UPDATE dmlop set tenlop = ?,manganh= ? ,khoahoc = ?,hedaotao = ?,namnhaphoc=? where malop =? ";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, lop.getTenLop());
        pre.setString(2, lop.getMaNganh());
        pre.setString(3, lop.getKhoaHoc());
        pre.setString(4, lop.getHeDaoTao());
        pre.setString(5, lop.getNamNhapHoc());
        pre.setString(6, lop.getMaLop());
        return pre.executeUpdate();
    }
    public int deleteByma(String ma) throws SQLException{
        String query = "DELETE FROM dmlop where malop = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, ma);
        return pre.executeUpdate();
    }
    public DmLop findByMa(String ma) throws SQLException{
        String query = "SELECT * FROM dmlop where malop =?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
          ResultSet rs = pre.executeQuery();
        while(rs.next())
            return new DmLop(
                    rs.getString(1), 
                    rs.getString(2),
                    rs.getString(3), 
                    rs.getString(4), 
                    rs.getString(5), 
                    rs.getString(6)
            );
        throw new RuntimeException("not found : "+ ma);
    }
}
