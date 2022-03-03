package com;


public class  SelectionSort{
	public static void CustomSortingExample(int num[],int size) {
		for(int  i=0; i<size; i++) {
			int  min=i;
			for(int j=1; j<size; j++) {
				if(num[j]>num[min]) {
					min=j;
				}
			}
			int temp=num[i];
			num[i]=num[min];
			num[min]=temp;
		}
	}
	public static void bubbleSort(int num[],int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]<num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {3,4,10,2,6,8,4};
		System.out.println("Before Sort");
		for (int n:num) {
			System.out.println(n+"");
		}
		SelectionSort.CustomSortingExample(num, num.length);
		
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.println(n+"");

	}
	}
}
	
	

