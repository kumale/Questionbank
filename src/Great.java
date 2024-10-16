import java.util.Scanner;

public class Great {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st no");
		i=sc.nextInt();
		
		j=sc.nextInt();
		k=sc.nextInt();
		if(i>j && i>k  ) {
			System.out.println("Greatest number is "+i);
		}
		else if(j>k && j>i)
		{
			System.out.println("Greatest number is "+j);
		}
		else 
			System.out.println(k+" is greater");
		if(i<j && i<k) {
			System.out.println("Lowest number is "+i);
		}
		else if(j<k && j<i) {
			System.out.println("lowest number is "+j);
			
		}
		else
			System.out.println("Lowest number is "+k);

	}

}
