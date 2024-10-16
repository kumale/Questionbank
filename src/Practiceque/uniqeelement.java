package Practiceque;

public class uniqeelement {

	public static void main(String[] args) {
		int[] array= {4,5,6,7,4,8,9,5,10,11};
		UniqueElement(array);
	}
	public static void UniqueElement(int[] array) {
		System.out.println("unique elements is array");
		for(int i=0;i<array.length;i++) {
			boolean isunique=true;
			for(int j=0;j<array.length;j++) {
				if(i!=j && array[i]==array[j]) {
					isunique=false;break;
				}
			}
			if(isunique) {
				System.out.println(array[i]+" ");
			}
		}
	}

}
