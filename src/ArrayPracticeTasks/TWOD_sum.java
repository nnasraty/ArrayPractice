package ArrayPracticeTasks;

public class TWOD_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]arr = {
		{4, 6, 7, 12 },
		{23, 7, 9, 10,5,7,9},
		{4, 6, 21}};
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {	
			sum+=arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		
		
//		};
		/*
		int sum=0;
		int [] value = {4, 7, 8 ,9};
		for(int i =0; i<value.length; i++) {
		sum = sum + value[i];
	}
		System.out.println(sum);
		*/
		
		////////////////////////////////////////////////////////
		
		//Even and Odd
//		int [][]arr = {
//				{4, 6, 7, 12 },
//				{23, 7, 9, 10,5,7,9},
//				{4, 6, 21}};
//		for(int i =0 ; i<arr.length; i++) {
//			for(int j =0; j<arr[i].length; j++) {
//				if(arr[i][j] % 2 != 0) {
//					System.out.println(arr[i][j]);
//				}
//			}
//		}
		
 ///////////////////////////////
//		int even =0;
//		int odd = 0;
//		int [][]arr = {
//				{4, 6, 7, 12 },
//				{23, 7, 9, 10,5,7,9},
//				{4, 6, 21,1,2}};
//		for(int i =0 ; i<arr.length; i++) {
//			for(int j =0; j<arr[i].length; j++) {
//				if(arr[i][j] % 2 == 0) {
//					even+=arr[i][j];
//				}else {
//					odd+=arr[i][j];
//				}
//			}
//		}
//		System.out.println("sum of even numbers = "+even);
//		System.out.println("sum of odd numbers = "+odd);
	}

}
