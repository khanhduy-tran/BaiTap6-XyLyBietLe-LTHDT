package main;

import java.util.ArrayList;
import java.util.Scanner;

import nhanvien.NVphache;
import nhanvien.NVphucvu;
import nhanvien.NhanVien;

public class NhanVienManager {
	static boolean flag = true;
	public static ArrayList<NhanVien> array;
	public static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		array = new ArrayList<NhanVien>();
		while(flag) {
			System.out.println("Chọn loại nhân viên muốn thêm:");
			System.out.println("1. Pha chế");
			System.out.println("2. Phục vụ");
			System.out.println("0. Thoát");
			System.out.print("Mời nhập lựa chọn:");
			int luachon = key.nextInt();
			switch(luachon) {
			case 1:
				System.out.print("Nhập vào số lượng nhân viên:");
				 n = key.nextInt();
				for(int i = 0 ; i<n ;i++) {
					NVphache nv = new NVphache();
					nv.nhapNhanvien();
					array.add(nv);	
				}
				 System.out.println("Tên nhân viên\t"+"Tuổi Nhân Viên\t"+"Số điện thoại\t"+"Địa chỉ\t"+"\tTổng Lương");
				for(int j = 0 ; j < array.size() ;j++) {
					System.out.println(array.get(j).toString());
				}
				break;
			case 2:
				System.out.print("Nhập vào số lượng nhân viên:");
				 n = key.nextInt();
				for(int i = 0 ; i<n ;i++) {
					NVphucvu nv = new NVphucvu();
					nv.nhapNhanvien();
					array.add(nv);	
				}
				 System.out.println("Tên nhân viên\t"+"Tuổi Nhân Viên\t"+"Số điện thoại\t"+"Địa chỉ\t"+"Tổng Lương");
				for(int j = 0 ; j < array.size() ;j++) {
					System.out.println(array.get(j).toString());
				}
				break;
			case 0:
				flag = false;
				break;
			}
		}
	}

}
