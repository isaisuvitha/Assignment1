package com.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<n;i++) {
			//printing I
			for(int j=0;j<n;j++) {
				if(i==0||j==n/2||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//printing N
			for(int j=0;j<n;j++) {
				if(j==0||j==i||j==n-1	)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//printing E
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||i==n/2&&j!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//printing U
			for(int j=0;j<n;j++) {
				if(j==0&&i!=n-1||j==n-1&&i!=n-1||i==n-1&&j!=n-1&&j!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//printing R
			for(int j=0;j<n;j++) {
				if(j==0||j==n/2&&i==n/2||i==0&&j<n||i==(3*n)/4&&j==(3*n)/4||
						j==n-1&&i==n-1||j==n-1&&i<(3*n)/4)
					System.out.print("*"	);
				else
					System.out.print(" ");
			}
			//printing space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//printing O
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==0||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//printing space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}	
			//printing N
			for(int j=0;j<n;j++) {
				if(j==0||j==i||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
