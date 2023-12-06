package com.soprasteria.exoMaven;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Saisie {

	public static String getNom(Scanner scanner) {

		System.out.println("Donner un nom");
		String nom = scanner.next();
		return nom;
	}

	public static int getAge(Scanner scanner) {
		int res = -1;
		System.out.println("Donner un age");
		String age = scanner.next();
		if (StringUtils.isNumeric(age)) {
			res = Integer.parseInt(age);
		}

		return res;
	}

}
