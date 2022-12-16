/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hubt.reypham.dao;

import com.hubt.reypham.model.DmHocPhan;
import com.hubt.reypham.model.DmKhoa;
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
public class DmKhoaDAO {
    public static DmKhoaDAO getInstance(){
        return new DmKhoaDAO();
    }
    public int create(DmKhoa khoa) throws SQLException{
        String query = "INSERT INTO DmKhoa values(?,?)";
         PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         pre.setString(1, khoa.getMaKhoa());
         pre.setString(2, khoa.getTenKhoa());
         return pre.executeUpdate();
    }
    public int updateByMa(String makhoa,String tenKhoa) throws SQLException{
        String query = "UPDATE DmKhoa SET tenKhoa = ? where MaKhoa = ?";
         PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         pre.setString(1, tenKhoa);
         pre.setString(2, makhoa);
         return pre.executeUpdate();
    }
    public int deleteByMa(String makhoa) throws SQLException{
        String query = "DELETE FROm DmKhoa where MaKhoa = ?";
         PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         pre.setString(1, makhoa);
         return pre.executeUpdate();
    }
    public DmKhoa findByMaKhoa(String ma) throws SQLException{
        String query = "DSEELCT * FROM  DmKhoa where MaKhoa = ?";
         PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        ResultSet rs = pre.executeQuery();
        while(rs.next())
            return new  DmKhoa(rs.getString(1), rs.getString(2));
        throw new RuntimeException("Not found");
    }
   public List<DmKhoa> findAll() throws SQLException{
        List<DmKhoa> list = new LinkedList<>();
         String query = "SELECT * FROM DMKHOA ";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
         ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            list.add(
                    new DmKhoa(
                            rs.getString(1),
                            rs.getString(2))
            );
        }
        return list;
    }
}
