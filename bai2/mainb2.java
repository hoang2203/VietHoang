package bai2;

import java.util.Scanner;

public class mainb2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        NhanVien nv = new KyThuat("SS123","Viet Hoang","22/03/2000","Ha Noi","it");
        System.out.println("Nhap mnv: ");
        String mnv = nhap.nextLine();
        System.out.println("Nhap ten");
        String hs = nhap.nextLine();
        System.out.println("Nhap ns: ");
        String ns = nhap.nextLine();
        System.out.println("Nhap dc: ");
        String dc= nhap.nextLine();
        System.out.println("nhap chuyen nganh: ");
        String cn = nhap.nextLine();
        KyThuat kt = new KyThuat(mnv,hs,ns,dc,cn);
        System.out.println(nv.toString());
        System.out.println(kt.toString());
    }
}
