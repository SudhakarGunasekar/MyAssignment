package week1.day2;

public class ClassCalculator {
	public int AddTwoNumber(int num1, int num2) {
	return num1+num2;
	}
	
	public float Mul(float num1,int num2) {
		return num1*num2;
		
	}
	public void sub() {
		int a=20;
		int b=5;
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		ClassCalculator cc = new ClassCalculator();
		System.out.println(cc.AddTwoNumber(2, 5));
		System.out.println(cc.Mul(2.3f, 5));
		cc.sub();
		
		
	}
	
	
}
