package com.generation;

import java.util.Scanner; //se importo el scanner

public class Codigo5 {

	    Scanner s = new Scanner(System.in);//se agrego el system.in entre paréntesis
	    System.out.print("Introduzca un número:");//corección de las comillas
	    int ni = s.nextLine();//debe ser dato de tipo int
	    int c = ni;

	    int afo = 0;
	    int noAfo = 0;

	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;

		  ni /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.prinln("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }

	  }

	}public class Codigo5 {

	    Scanner s = new Scanner();
	    System.out.print("Introduzca un número: ");//cerrar comillas con el mismo tipo
	    String ni = s.nextLine();
	    int c = ni;

	    int afo = 0;
	    int noAfo = 0;

	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;

		  ni /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.prinln("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }

	  }

	}}}//añadir llaves faltantes