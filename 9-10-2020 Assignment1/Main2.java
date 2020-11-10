package com.basic;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st list : ");
		int size = sc.nextInt();
		
		LinkedHashSet<Integer> list1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>();
		for(int i=0; i<size; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("Enter the size of 1st list : ");
		size = sc.nextInt();
		for(int i=0; i<size; i++) {
			list2.add(sc.nextInt());
		}
		
		LinkedHashSet<Integer> list3 = new LinkedHashSet<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}

}
