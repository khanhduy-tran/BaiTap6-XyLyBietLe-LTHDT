package nhanvien;

import java.util.Scanner;

import main.NgoaiLe;

public class NhanVien {
	public String tenNhanvien;
	public int tuoiNhanVien;
	public int soDienThoai;
	public String diaChi;
	public int tienLuong;
	 public int soNgayLam;
	
	public NhanVien() {
		super();
	}
	public NhanVien(String tenNhanvien, int tuoiNhanVien, int soDienThoai, String diaChi) {
		super();
		this.tenNhanvien = tenNhanvien;
		this.tuoiNhanVien = tuoiNhanVien;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}
	public void nhapNhanVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên nhân viên:");
		this.tenNhanvien = scanner.nextLine();
		System.out.print("Nhập tuổi nhân viên:");
		this.tuoiNhanVien = Integer.parseInt(scanner.nextLine());
			try {
				NgoaiLe.checkAge(this.tuoiNhanVien);
			} catch (NgoaiLe e) {	
				System.err.println(e.mess);
				System.out.println("Nhập lại tuổi nhân viên:");
				this.tuoiNhanVien = Integer.parseInt(scanner.nextLine());
			}
		
		System.out.print("Nhập số điện thoại:");
		this.soDienThoai = Integer.parseInt(scanner.nextLine());
		try {
			NgoaiLe.checkPhone(this.soDienThoai);
		} catch (NgoaiLe e) {
			// TODO Auto-generated catch block
			System.err.println(e.mess);
			System.out.print("Nhập lại số điện thoại:");
			this.soDienThoai = Integer.parseInt(scanner.nextLine());
		}
		System.out.print("Nhập địa chỉ:");
		this.diaChi = scanner.nextLine();
		System.out.print("Nhập tiền lương:");
		 this.tienLuong = Integer.parseInt(scanner.nextLine());
		 System.out.print("Nhập số ngày làm:");
		 this.soNgayLam = Integer.parseInt(scanner.nextLine());
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenNhanvien + "\t\t" + this.tuoiNhanVien + "\t\t" +this.soDienThoai +"\t" + this.diaChi;
	}
	
}

