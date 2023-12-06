package com.soprasteria.exoMaven;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
	  try(Scanner scanner = new Scanner(System.in))
	  {
		  
		  String nom = Saisie.getNom(scanner);
		  int age= Saisie.getAge(scanner);
		  
		  System.out.print("Nom = "+nom);
		  if(age!=-1)
			  System.out.print("  , Age = "+age);
		  else
			  System.out.println("  , Age saisie est invalide");

	  }

	}

}
