package hou.duogwas.onthigplxa1.Class; /*
 ** Created by duogwas on 27/10/2021
 **/

public class BienBao {
    public String TenBien;
    public String Hinh;

    public String getTenBien() {
        return TenBien;
    }

    public void setTenBien(String tenBien) {
        TenBien = tenBien;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String hinh) {
        Hinh = hinh;
    }

    public BienBao(String tenBien, String hinh) {
        TenBien = tenBien;
        Hinh = hinh;
    }
}
