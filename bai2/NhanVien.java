package bai2;

public abstract class NhanVien {
    private String Manhanvien;
    private String Hoten;
    private String Namsinh;
    private String Diachi;

    public NhanVien() {
    }

    public NhanVien(String manhanvien, String hoten, String namsinh, String diachi) {
        this.Manhanvien = manhanvien;
        this.Hoten = hoten;
        this.Namsinh = namsinh;
        this.Diachi = diachi;
    }

    public String getManhanvien() {
        return Manhanvien;
    }
    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }

    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.Namsinh = namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        this.Diachi = diachi;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "Manhanvien='" + Manhanvien + '\'' +
                ", Hoten='" + Hoten + '\'' +
                ", Namsinh='" + Namsinh + '\'' +
                ", Diachi='" + Diachi + '\'' +
                '}';
    }
    public abstract String motacongviec();
}
