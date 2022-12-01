/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hubt.reypham.model;

import java.util.Objects;

/**
 *
 * @author tho.lv
 */
public class DmHocPhan {
    private String maHp,tenHp,soDvhp,maNganh,hocKy;

    public String getMaHp() {
        return maHp;
    }

    public void setMaHp(String maHp) {
        this.maHp = maHp;
    }

    public String getTenHp() {
        return tenHp;
    }

    public void setTenHp(String tenHp) {
        this.tenHp = tenHp;
    }

    public String getSoDvhp() {
        return soDvhp;
    }

    public void setSoDvhp(String soDvhp) {
        this.soDvhp = soDvhp;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maHp);
        hash = 97 * hash + Objects.hashCode(this.tenHp);
        hash = 97 * hash + Objects.hashCode(this.soDvhp);
        hash = 97 * hash + Objects.hashCode(this.maNganh);
        hash = 97 * hash + Objects.hashCode(this.hocKy);
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
        final DmHocPhan other = (DmHocPhan) obj;
        if (!Objects.equals(this.maHp, other.maHp)) {
            return false;
        }
        if (!Objects.equals(this.tenHp, other.tenHp)) {
            return false;
        }
        if (!Objects.equals(this.soDvhp, other.soDvhp)) {
            return false;
        }
        if (!Objects.equals(this.maNganh, other.maNganh)) {
            return false;
        }
        return Objects.equals(this.hocKy, other.hocKy);
    }

    public DmHocPhan(String maHp, String tenHp, String soDvhp, String maNganh, String hocKy) {
        this.maHp = maHp;
        this.tenHp = tenHp;
        this.soDvhp = soDvhp;
        this.maNganh = maNganh;
        this.hocKy = hocKy;
    }
    
}
