package nhanvien;

import java.util.Scanner;

public class NVphache extends NhanVien{
	 public int tongTienLuong;
	 public int bonus;

	 public NVphache() {
		super();
	}
	public void nhapNhanvien() {
		 super.nhapNhanVien();
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Nhập số tiền bonus:");
		 this.bonus = Integer.parseInt(scanner.nextLine());
		 this.tinhLuong();
	 }
	 public void tinhLuong() {
		 this.tongTienLuong = (this.tienLuong * this.soNgayLam) + this.bonus;
	 }
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + this.tongTienLuong;
	}
}
