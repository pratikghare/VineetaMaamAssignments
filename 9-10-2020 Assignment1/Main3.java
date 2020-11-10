package com.basic;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char seq[] = {'!', '#', '$', '%', '&', '*', '@', '^', '~'};
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		char nuts[] = new char[size];
		char bolts[] = new char[size];
		
		
		System.out.println("For Nuts");
		for(int i=0; i<size; i++) {
			nuts[i] =  sc.next().charAt(0);
		}
		
		System.out.println("For Bolts");
		for(int i=0; i<size; i++) {
			bolts[i] =  sc.next().charAt(0);
		}
		
		StringBuffer n = new StringBuffer(size);
		StringBuffer b = new StringBuffer(size);
		
		
		
		for(int i=0; i<seq.length; i++) {
			for(int j=0; j<size; j++) {
				if(nuts[j] == seq[i])
					n.append(nuts[j]+" ");
				if(bolts[j] == seq[i])
					b.append(bolts[j]+" ");
			}
		}
		
		System.out.println(n);
		System.out.println(b);
	}

}
