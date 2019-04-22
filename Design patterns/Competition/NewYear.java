package com.neighbours.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		
		
		Next n = new Next();
	}

}
public class Next {
		 
     List<List<Integer>> arr = new ArrayList<>();
     List<Integer> nar;
     Scanner scanner = new Scanner(System.in);
     int num, num1 =0, greater, save, num2, num3;
     String word;

	 public void addarr(ArrayList<Integer> arra){
		 arr.add(arra);	 
     }
	 
	 public List<Integer> createList(int h){
		List<Integer> ar = new ArrayList<Integer>(h);
		return ar;
	 }
	 
public Next(){
	System.out.println("enter number of number of tests;");
	
	int testc = scanner.nextInt();

	for(int i = 1; i<= testc; i ++){
		System.out.println("enter "+i+" st of number of houses;");
		int noOfHouses = scanner.nextInt();
		List<Integer> ar=createList(noOfHouses);
		
		System.out.println("enter neighboring houes;");
		for(int j = 1; j <= noOfHouses; j++){
			ar.add(scanner.nextInt());
		}
		addarr((ArrayList<Integer>) ar);
   }
	action();
	
  }

public void action() {
	 for( int k = 0 ; k <= arr.size() - 1; k++){
		 nar = arr.get(k);

		 int val = nar.size(); 
		 for(int i = 0; i <= val-1; i++ ){
			 if(val ==1){
				 System.out.println( nar.get(0));
			 }
			 else if(val == 2){
				 if(nar.get(0) > nar.get(1)){
					System.out.println(nar.get(0));
				 }
				 else{
					 System.out.println(nar.get(1));
				 }
			 }
			 else if(val == 3){
				num2 = nar.get(0);
				num3 = nar.get(2);
				num = num + num1;
				num1 = nar.get(1);
				if (num > num1){
					
				}
			 }
			 for(int j = 2; j <= val-1; j++){
				 num = nar.get(i);
				 if(val-1 < j){
					 
				 }
				 else if(j<val-1){
					 num1 = nar.get(j);
				 } 
				 save = num + num1;
				 if(save > greater){
					 greater = save;
					 num2 = num;
					 num3 = num1*10; 
					 
				 }
			 }
		 }
		 System.out.println(num3+""+num2);
	 }
}
}
