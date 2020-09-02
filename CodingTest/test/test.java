package test;

public class test {

	public static void main(String[] args) {
		
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		tresure(5,arr1,arr2);
		
		System.out.println("---------------");
		
		int[] arr3 = {46, 33, 33 ,22, 31, 50};
		int[] arr4 = {27 ,56, 19, 14, 14, 10};
		tresure(6, arr3, arr4);

	}
	
	public static void tresure(int n, int[] arr1, int[] arr2) {
		
//		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			
			String a = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			System.out.println(a.replaceAll("1", "# ").replaceAll("0", "  "));
			
//			arr[i] = a.replaceAll("1", "# ").replaceAll("0", "  ");
			
		}
		
		
	}

}
