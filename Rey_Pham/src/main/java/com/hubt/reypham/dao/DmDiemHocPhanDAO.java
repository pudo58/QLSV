package com.hubt.reypham.dao;
import com.hubt.reypham.model.DmDiemHocPhan;
import com.hubt.reypham.utils.ConnectSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tho.lv
 */
public class DmDiemHocPhanDAO {
    public static DmDiemHocPhanDAO getInstance(){
        return new DmDiemHocPhanDAO();
    }
    public int create(DmDiemHocPhan dmDiemHocPhan) throws SQLException{
        String query = "INSERT INTO diemhp VALUES(?,?,?)";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, dmDiemHocPhan.getMaSv());
        pre.setString(2, dmDiemHocPhan.getMaHp());
        pre.setDouble(3, dmDiemHocPhan.getDiemHp());
        return pre.executeUpdate();
    }
    public int updateDiemHocPhan(String maHocPhan,String masv,double diem) throws SQLException{
        String query = "UPDATE diemhp SET diem = ? where mahp = ? and masv = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setDouble(1, diem);
        pre.setString(2, maHocPhan);
        pre.setString(3, masv);
        return pre.executeUpdate();
    }
    public int deleteByMa(String maHocPhan,String masv) throws SQLException{
        String query = "DELETE FROM diemhp where mahp = ? and masv = ?";
         PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         pre.setString(1, maHocPhan);
         pre.setString(2, masv);
         return pre.executeUpdate();
    }
    public DmDiemHocPhan findByMa(String maHocPhan) throws SQLException{
        String query =  "SELECT * FROM diemhp where MaHp = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1,maHocPhan);
        ResultSet rs = pre.executeQuery();
        while(rs.next())
            return new DmDiemHocPhan(rs.getString(1), rs.getString(2), rs.getDouble(3));
        throw new RuntimeException("ma hoc phan khong co");
    }
    public List<DmDiemHocPhan> findAll() throws SQLException{
        List<DmDiemHocPhan> list = new LinkedList<>();
        String query =  "SELECT * FROM diemhp";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         ResultSet rs = pre.executeQuery();
        while(rs.next())
            list.add(
                  new DmDiemHocPhan(
                          rs.getString(1),
                          rs.getString(2), 
                          rs.getDouble(3))  
            );
        return list;
    }
}
