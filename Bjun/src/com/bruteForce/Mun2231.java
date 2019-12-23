package com.bruteForce;

import java.util.Scanner;

public class Mun2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result=0;
		int sum=0;
		for(int i=1;i<=N;i++) {
			int n=i;
			sum+=i;
			while(true) {
				if(i<10 || n==0) break;
				sum+=n%10;
				n/=10;
			}
			if(sum==N) {
				result=i;
				break;
			}
			sum=0;
		}
		System.out.println(result);
	}

}
