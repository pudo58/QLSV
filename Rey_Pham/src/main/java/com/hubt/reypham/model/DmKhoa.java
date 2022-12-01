package com.hubt.reypham.model;

import java.util.Objects;

/**
 *
 * @author tho.lv
 */
public class DmKhoa {
    private String maKhoa,tenKhoa;

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public DmKhoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.maKhoa);
        hash = 53 * hash + Objects.hashCode(this.tenKhoa);
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
        final DmKhoa other = (DmKhoa) obj;
        if (!Objects.equals(this.maKhoa, other.maKhoa)) {
            return false;
        }
        return Objects.equals(this.tenKhoa, other.tenKhoa);
    }
    
}
