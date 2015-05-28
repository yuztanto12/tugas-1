/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;
import java.util.Scanner;
/**
 *
 * @author riizkurn
 */
public class hitung {
    
	static int alas;
	static int tinggi;
	static double luas;
	static Scanner s;
	
	public static void main(String[] args)
	{
		s= new Scanner(System.in);
		
		System.out.print("Masukan Alas : ");
		alas=s.nextInt();
		
		System.out.print("Masukan Tinggi : ");
		tinggi=s.nextInt();
		
		luas=(alas*tinggi) / 2;
		
		System.out.print("(" + alas + " * " + tinggi + ") / 2 = " + luas);
	}
}
    
