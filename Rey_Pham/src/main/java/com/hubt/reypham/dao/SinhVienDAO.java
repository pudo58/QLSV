/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hubt.reypham.dao;

import com.hubt.reypham.model.SinhVien;
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
public class SinhVienDAO {

    public static SinhVienDAO getInstance() {
        return new SinhVienDAO();
    }

    public int create(SinhVien sinhVien) throws SQLException {
        String query = " INSERT INTO SINHVIEN values(?,?,?,?,?,?)";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, sinhVien.getMaSv());
        pre.setString(2, sinhVien.getHoTen());
        pre.setString(3, sinhVien.getMaLop());
        pre.setString(4, sinhVien.getGioiTinh());
        pre.setString(5, sinhVien.getNgaySinh());
        pre.setString(6, sinhVien.getDiaChi());
        return pre.executeUpdate();
    }

    public int updateByMa(String masv, SinhVien sinhVien) throws SQLException {
        String query = "UPDATE SINHVIEN sethoten = ?,malop=?,gioitinh=?,ngaysinh = ?,diachi=? where masv= ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, sinhVien.getHoTen());
        pre.setString(2, sinhVien.getMaLop());
        pre.setString(3, sinhVien.getGioiTinh());
        pre.setString(4, sinhVien.getNgaySinh());
        pre.setString(5, sinhVien.getDiaChi());
        pre.setString(6, sinhVien.getMaSv());
        return pre.executeUpdate();
    }

    public int deleteByMa(String masv) throws SQLException {
        String query = "DELETE FROM SINHVIEN where masv = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, masv);
        return pre.executeUpdate();
    }

    public SinhVien findByMa(String ma) throws SQLException {
        String query = "SELECT * FROM SINHVIEN WHERE masv = ?";
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        pre.setString(1, ma);
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            return new SinhVien(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
            );
        }
        throw new RuntimeException("not found " + ma);
    }

    public List<SinhVien> findAll() throws SQLException {
        String query = "SELECT * FROM sinhvien";
        List<SinhVien> list = new LinkedList<>();
        PreparedStatement pre = ConnectSQL.conn.prepareStatement(query);
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            list.add(new SinhVien(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
            ));
        }
        return list;
    }
}
