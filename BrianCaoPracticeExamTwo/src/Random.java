
public class Random {

	public static void main(String[] args) {
		int[] arr1 =  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int[] arr2 = arr1;
	       
	       for (int i = 0; i < (arr2.length/2); i++)
	       {
	           int temp = arr1[i];
	           arr2[i] = arr1[arr1.length - i - 1];
	           arr2[arr1.length - i - 1] = temp;
	          
	       }
	       
	       for (int reverse : arr2)
	       {
	    	   System.out.print(reverse + " ");
	       }

	}

}
