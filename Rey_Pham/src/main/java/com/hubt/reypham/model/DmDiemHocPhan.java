package com.hubt.reypham.model;

import java.util.Objects;

/**
 *
 * @author tho.lv
 */
public class DmDiemHocPhan {
    private String maSv,maHp;
    private double diemHp;

    public DmDiemHocPhan(String maSv, String maHp, double diemHp) {
        this.maSv = maSv;
        this.maHp = maHp;
        this.diemHp = diemHp;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getMaHp() {
        return maHp;
    }

    public void setMaHp(String maHp) {
        this.maHp = maHp;
    }

    public double getDiemHp() {
        return diemHp;
    }

    public void setDiemHp(double diemHp) {
        this.diemHp = diemHp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.maSv);
        hash = 59 * hash + Objects.hashCode(this.maHp);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.diemHp) ^ (Double.doubleToLongBits(this.diemHp) >>> 32));
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
        final DmDiemHocPhan other = (DmDiemHocPhan) obj;
        if (Double.doubleToLongBits(this.diemHp) != Double.doubleToLongBits(other.diemHp)) {
            return false;
        }
        if (!Objects.equals(this.maSv, other.maSv)) {
            return false;
        }
        return Objects.equals(this.maHp, other.maHp);
    }
    
}
