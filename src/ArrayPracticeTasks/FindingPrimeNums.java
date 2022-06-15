package ArrayPracticeTasks;

import java.util.ArrayList;

public class FindingPrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 23;
//		int[] arr = {3,4,6,2,7,8,9};
//		boolean flag = false;
//		
//		for(int i=2; i<=num/2; i++) {
//			if(num % i == 0) {
//				flag = true;
//			}
//		}
//		if(flag == true) {
//			System.out.println(num+" is not a prime number");
//		}else {
//			System.out.println(num+" is a prime number");
//		}
		
		
//		for(int i =0; i<arr.length;i++) {
//			  for(int j = 2; j<=arr[i]/2; j++) {
//				  if(arr[i] % j == 0) {
//					  flag = true;
//				  }
//			  }
//			  if(flag == true) {
//					System.out.println(arr[i]+" is not a prime number");
//				}else {
//					System.out.println(arr[i]+" is a prime number");
//				}
//			  flag = false;
//		}
//		
	/////////////////////////
		//Fibonacci
		
//		int[] array = new int[10];
//		array[0] = 1;
//		array[1] = 1;
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		for(int i = 2; i<array.length; i++) {
//			array[i] = array[i-2] + array[i-1];
//			System.out.println(array[i]);
//		}
		
		
		//arraylist
		
//		ArrayList<Integer> arraylist = new ArrayList<Integer>();
//		arraylist.add(1);
//		arraylist.add(1);
//		for(int i = 2; i<15; i++ ) {
//			arraylist.add( arraylist.get(i-2) + arraylist.get(i-1));
//			System.out.println(arraylist.get(i));
//		}
//		
		//////////////////////////////////////////
		//Maximum and minimum
		
		int[] array2 = {2,5,8,11,50,7,1};
		int max = array2[0];
		int min = array2[0];
		for(int i =0; i<array2.length; i++) {
			if(max < array2[i]) {
				max = array2[i];
			}
			if(min> array2[i]) {
				min = array2[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
//		////////////////////////////
//		
		
		String[] name = {"seyar","wali","noor","noor","seyar", "john", "wali"};
		for(int i = 0; i<name.length; i++) {
		       for(int j = i+1; j<name.length;j++) {
		    	   if(name[i].equalsIgnoreCase(name[j])) {
		    		   System.out.println(name[i]);
		    		   break;
		    	   }
		       }
		}
	}

}
