package exoMaven;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.soprasteria.exoMaven.Saisie;

class TestSaisie {
	
	Scanner scanner = new Scanner(System.in);

	@Test
	void testGetNom() {
		assertNotEquals(Saisie.getNom(scanner).length(), 3);
		
	}

}
