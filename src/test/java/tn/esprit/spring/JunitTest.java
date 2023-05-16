package tn.esprit.spring;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	
		Calcul calcul = new Calcul();
		@Test
		public void testCalculerSom() {
		assertEquals(25, calcul.calculerSom(10, 15));
		}
		@Test
		public void testCalculerDiff() {
		assertEquals(30, calcul.calculerDiff(40, 10));
		}
	
}
