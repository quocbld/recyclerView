package com.example.rcview_lebaquoc;

public class Mode {
    private String ten;
    private int gia,hinh;

    public Mode(String asus_tuf_gaming_f15, int i, int hinh) {
        this.hinh = hinh;
    }

    public Mode(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
