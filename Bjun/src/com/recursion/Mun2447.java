package com.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Mun2447 {
	static public void make(char star[][],int N,int x,int y) {
		if(N==1) {
			star[x][y]='*';
			return;
		}
		
		int div = N/3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1 && j==1) {
					continue;
				}
				make(star,div, x+div*i, y+div*j);
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char star[][] = new char[N][N];
		for (int i = 0; i < N; i++) {
            Arrays.fill(star[i], ' ');
        }
		make(star,N, 0, 0);
		
		for(int i=0;i<N;i++) {
			System.out.println(star[i]);
		}
	}

}
