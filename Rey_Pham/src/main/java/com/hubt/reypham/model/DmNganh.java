package com.hubt.reypham.model;

import java.util.Objects;

/**
 *
 * @author tho.lv
 */
public class DmNganh {
    private String maNganh,tenNganh,maKhoa;

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public DmNganh(String maNganh, String tenNganh, String maKhoa) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
        this.maKhoa = maKhoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.maNganh);
        hash = 17 * hash + Objects.hashCode(this.tenNganh);
        hash = 17 * hash + Objects.hashCode(this.maKhoa);
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
        final DmNganh other = (DmNganh) obj;
        if (!Objects.equals(this.maNganh, other.maNganh)) {
            return false;
        }
        if (!Objects.equals(this.tenNganh, other.tenNganh)) {
            return false;
        }
        return Objects.equals(this.maKhoa, other.maKhoa);
    }
    
}
