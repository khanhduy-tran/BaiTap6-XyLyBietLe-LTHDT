package nhanvien;

import java.util.Scanner;

public class NVphucvu extends NhanVien {
 
 public int tongTienLuong;
 public int tangCa;

 public void nhapNhanvien() {
	 super.nhapNhanVien();
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Nhập tiền tăng ca:");
	 this.tangCa = Integer.parseInt(scanner.nextLine());
	 this.tinhLuong();
 }
 public void tinhLuong() {
	 this.tongTienLuong = (this.tienLuong * this.soNgayLam) + this.tangCa;
 }
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + this.tongTienLuong;
	}
}
