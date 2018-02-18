package ma.exercice1;

import java.util.Scanner;



public class MainClass 
{
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		double somme = 0.0, sommeCarree = 0.0, variance = 0.0, ecartType = 0.0, moyenne = 0.0;
		
		System.out.println("Entrer le nombre de terms : ");
		int n = input.nextInt();
		
		double[] tab = new double[n]; 
		
		for(int i = 0; i < n; i++)
		{
			tab[i] = Math.random();
			somme += tab[i];
			sommeCarree += Math.pow(tab[i], 2);
		}
		
		moyenne = somme/n ;
		
		variance = sommeCarree/n + Math.pow(moyenne, 2) ;
		
	    ecartType = Math.sqrt(variance);
	    
	    System.out.println("la moyenne de "+n+" nombre recuperes par Math.random() est : "+moyenne);
	    System.out.println("leurs ecart type est "+ecartType);

	}

}
