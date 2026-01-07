package com.javastudy;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the order N of the matrices:");
		int n =sc.nextInt();
		int[][] matrix1= new int[n][n];
		int[][] matrix2= new int[n][n];
		int[][] result= new int[n][n];
		
		System.out.println("Enter the elements of matrix 1:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Element ["+i+"]["+j+"]:");
				matrix1[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Enter the elements of matrix 2:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Element ["+i+"]["+j+"]:");
				matrix2[i][j]=sc.nextInt();	
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("\n Resultant Matrix after addition:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
