package bai2;

public class KyThuat extends NhanVien{
    public String Chuyennganh;
    public KyThuat(String manhanvien, String hoten, String namsinh, String diachi, String chuyennganh) {
        super(manhanvien, hoten, namsinh, diachi);
        this.Chuyennganh = chuyennganh;
    }
    public  KyThuat(){}
    @Override
    public String toString() {
        return "NhanVien{" +
                "Manhanvien="+ super.getManhanvien()+
                "Hoten="+super.getHoten()+
                "Diachi="+super.getDiachi()+
                "Chuyennganh='" + Chuyennganh + '\'' +
                '}';
    }

    @Override
    public String motacongviec() {
        return null;
    }
}
