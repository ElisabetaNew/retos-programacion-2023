package reto2023Semana20;

import java.util.Scanner;

public class Trifuerza {

	public static void main(String[] args) {
		
		int nivel = pedirDato();		
		dibujarTrifuerza(nivel);
	}
	
	public static int pedirDato() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Que nivel quieres par a tu Trifuerza");
		int nivel = sc.nextInt();
		sc.close();
		System.out.println();
		return nivel;
	}
	
	public static void dibujarTrifuerza(int nivel) {
		
		int altura;
		int espacio;
		int asterisco;
		
		for(altura = 1; altura <= (nivel*2); altura ++) {
			if(altura<=nivel) {
				for(espacio=1; espacio<=(nivel*2)-altura; espacio++) {
					System.out.print(" ");
				}
				for(asterisco=1; asterisco<=(altura*2)-1; asterisco++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(espacio =1; espacio <= (nivel*2)-altura; espacio++) {
					System.out.print(" ");
				}
				for(asterisco=1; asterisco<=((altura-nivel)*2)-1; asterisco++) {
					System.out.print("*");
				}
				for(espacio=1; espacio<=(nivel*2)-(((altura-nivel)*2)-1); espacio++) {
					System.out.print(" ");
				}
				for(asterisco=1; asterisco<=((altura-nivel)*2)-1; asterisco++) {
					System.out.print("*");
				} 
				System.out.println();
			}
		}
	}
}
