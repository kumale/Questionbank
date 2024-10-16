package Akola;

public class MethodOverloading {
	 public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);

	}
	public static void main(String args[]) {
		MethodOverloading m=new MethodOverloading();
		m.sum(20,10);
		m.sum(20,30,40);
	}
}