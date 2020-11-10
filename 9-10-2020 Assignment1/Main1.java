package com.basic;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		ArrayList<Integer> M[] = new ArrayList[size];
		
		for(int i=0; i<size; i++) {
			M[i] = new ArrayList();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.println("Enter element : "+(i+1)+(j+1)+" : ");
				M[i].add(sc.nextInt());
			}
		}
		
		HashSet<Integer> h = new HashSet<Integer>(M[0]);
		
		for(int i=1; i<size; i++) {
			h.retainAll(M[i]);
		}
		
	
		
		System.out.println(h.size());
		System.out.println(h);
		
	}

}
