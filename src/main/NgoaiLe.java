package main;

public class NgoaiLe extends Exception {
	public String mess;
	public NgoaiLe(String mess) {
		super();
		this.mess = mess;
	}
	public String toString() {
		return "Ngoai le" + this.mess;
	}
	public static void checkAge(int age) throws NgoaiLe{
		if(age > 150) throw new NgoaiLe("Số tuổi lớn hơn 150");
	}
	public static void checkPhone(int phoneNumber) throws NgoaiLe{
		String phone = String.valueOf(phoneNumber);
		int n = phone.length();
		if(n < 9 || n > 9) throw new NgoaiLe("Số điện thoại phải là 10 số");
	}
}
