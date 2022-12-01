package com.hubt.reypham.model;

import java.util.Objects;

/**
 *
 * @author tho.lv
 */
public class SinhVien {
    private String maSv,hoTen,maLop,gioiTinh,ngaySinh,diaChi;

    public SinhVien(String maSv, String hoTen, String maLop, String gioiTinh, String ngaySinh, String diaChi) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.maSv);
        hash = 23 * hash + Objects.hashCode(this.hoTen);
        hash = 23 * hash + Objects.hashCode(this.maLop);
        hash = 23 * hash + Objects.hashCode(this.gioiTinh);
        hash = 23 * hash + Objects.hashCode(this.ngaySinh);
        hash = 23 * hash + Objects.hashCode(this.diaChi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.maSv, other.maSv)) {
            return false;
        }
        if (!Objects.equals(this.hoTen, other.hoTen)) {
            return false;
        }
        if (!Objects.equals(this.maLop, other.maLop)) {
            return false;
        }
        if (!Objects.equals(this.gioiTinh, other.gioiTinh)) {
            return false;
        }
        if (!Objects.equals(this.ngaySinh, other.ngaySinh)) {
            return false;
        }
        return Objects.equals(this.diaChi, other.diaChi);
    }
    
}
