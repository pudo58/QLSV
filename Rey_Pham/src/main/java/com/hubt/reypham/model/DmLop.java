package com.hubt.reypham.model;

import java.util.Objects;

/**
 *
 * @author tho.lv
 */
public class DmLop {
    private String maLop,tenLop,maNganh,khoaHoc,heDaoTao,namNhapHoc;

    public DmLop(String maLop, String tenLop, String maNganh, String khoaHoc, String heDaoTao, String namNhapHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maNganh = maNganh;
        this.khoaHoc = khoaHoc;
        this.heDaoTao = heDaoTao;
        this.namNhapHoc = namNhapHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getHeDaoTao() {
        return heDaoTao;
    }

    public void setHeDaoTao(String heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    public String getNamNhapHoc() {
        return namNhapHoc;
    }

    public void setNamNhapHoc(String namNhapHoc) {
        this.namNhapHoc = namNhapHoc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maLop);
        hash = 79 * hash + Objects.hashCode(this.tenLop);
        hash = 79 * hash + Objects.hashCode(this.maNganh);
        hash = 79 * hash + Objects.hashCode(this.khoaHoc);
        hash = 79 * hash + Objects.hashCode(this.heDaoTao);
        hash = 79 * hash + Objects.hashCode(this.namNhapHoc);
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
        final DmLop other = (DmLop) obj;
        if (!Objects.equals(this.maLop, other.maLop)) {
            return false;
        }
        if (!Objects.equals(this.tenLop, other.tenLop)) {
            return false;
        }
        if (!Objects.equals(this.maNganh, other.maNganh)) {
            return false;
        }
        if (!Objects.equals(this.khoaHoc, other.khoaHoc)) {
            return false;
        }
        if (!Objects.equals(this.heDaoTao, other.heDaoTao)) {
            return false;
        }
        return Objects.equals(this.namNhapHoc, other.namNhapHoc);
    }
    
}
