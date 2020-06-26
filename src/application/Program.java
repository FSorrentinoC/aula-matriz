package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello Word" );
		System.out.println("Enter column and row numbers: ");
		
		int m = sc.nextInt();
		int n = sc.nextInt();		
		int [][] mat = new int [m][n];
		
		System.out.println("Enter number of Matriz: ");
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();				
			}
		}	
		
		System.out.println("Enter a number that belongs to the Matriz: ");	

		int x = sc.nextInt();		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Number left: " + mat[i][j-1]);
					}
					
					if (i > 0 ) {
						System.out.println("Number Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length-1) {
						System.out.println("Number Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length-1) {
						System.out.println("Number Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

		}
	}



