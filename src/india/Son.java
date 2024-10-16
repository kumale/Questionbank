package india;

public class Son extends Father {
	public void fan() {
		Father f=new Father();
		System.out.println(f.name);
		System.out.println(f.age);
		
	}
	public static void main(String args[]) {
		Son s =new Son();
		s.name="Ravi";
		System.out.println(s.name);
		s.pno="Ajsp";
		System.out.println(s.pno);
		
		
		
	}
	

}
