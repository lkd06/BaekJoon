package com.bruteForce;

import java.util.Scanner;

public class Mun7568 {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int weight[]= new int[N];
		int tall[] = new int[N];
		int order[] = new int[N];
		for(int i=0;i<N;i++) {
			weight[i]=sc.nextInt();
			tall[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(weight[i]<weight[j] && tall[i]<tall[j]) order[i]++;
			}
		}
		for(int i=0;i<N;i++)
			System.out.print((order[i]+1)+" ");
		System.out.println();
	}
}
