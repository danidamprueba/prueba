import java.util.Scanner;
//import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// Ejercicio 1: Programa para transformar grados far a celsius
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca los grados Farenheit: \n");
		float far = scan.nextFloat();
		float cel = ((far - 32)*5)/9;
		System.out.println("El valor en grados Celsius es: " + cel + "ºC.");
		scan.close();
		*/

		
		//Ejercicio 2
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el valor del radio: ");
		float r = scan.nextFloat();
		final float PI = 3.14f;
		float area = 4 * PI * r * r;
		System.out.println("El área es: " + area);
		System.out.println("El volumen es: " + ((area * r)/3));
		scan.close();
		*/
		
		//Ejercicio 3
		/*
		Scanner scan = new Scanner(System.in);
		int nota = 0;
		do {
			System.out.println("Introduzca una nota (entre 0 y 10): ");
			nota = scan.nextInt();
		} while( !(nota >= 0 && nota <= 10) );
		if( nota < 5 ) {
			System.out.println("SUSPÈNSO");
		} else if( nota < 7 ){
			System.out.println("APROBADO");
		} else if ( nota < 9 ) {
			System.out.println("NOTABLE");
		} else {
			System.out.println("SOBRESALIENTE!");
		}
		scan.close();
		*/
		// Ejercicio 4
		/*
		Scanner scan = new Scanner(System.in);
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		String entrada = "hola";
		
		for( int x = 0; x < 20; x++) {
			System.out.println("Introduzca un caracter: ");
			entrada = scan.nextLine();
			switch(entrada) {
			 	case "a":
			 		a++;
			 		break;
			 	case "e":
			 		e++;
			 		break;
			 	case "i":
			 		i++;
			 		break;
			 	case "o":
			 		o++;
			 		break;
			 	case "u":
			 		u++;
			 		break;
			 	default:
			 		break;
			}
		}
		System.out.println("Número de a: " + a + "\n"
				+ "Número de e: " + e + "\n"
				+ "Número de i: " + i + "\n"
				+ "Número de o: " + o + "\n"
				+ "Número de u: " + u + "\n");
		scan.close();
		*/
		/*
		//Ejercicio 5
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		String ch = "";
		while(!ch.equals("0")) { // ch != "0"
			System.out.println("Introduzca el primer número: ");
			n1 = scan.nextInt(); 
			System.out.println("Introduzca el segundo número: ");
			n2 = scan.nextInt(); 
			System.out.println("Seleccione una operación (+,-,^,/,%):\n"
					+ "Pulse 0 para salir. ");
			ch = scan.next();
			switch (ch) {
				case "+":
					System.out.println("El resultado es: " + (n1 + n2));
					break;
				case "-":
					System.out.println("El resultado es: " + (n1 - n2));
					break;
				case "*":
					System.out.println("El resultado es: " + (n1 * n2));
					break;
				case "/":
					System.out.println("El resultado es: " + (n1 / n2));
					break;
				case "%":
					System.out.println("El resultado es: " + (n1 % n2));
					break;
				case "0":
					System.out.println("Fin del programa.");
					break;
				default:
					System.out.println("ERROR: Operando incorrecto.");
					break;
					
			} // Fin switch
			
		}//fin while
		scan.close();
		*/
		/*
		//Ejercicio 6
		Scanner scan = new Scanner(System.in);
		float num, sum = 0;
		for(int i = 0; i < 20; i++) {
			System.out.println("Introduzca un valor: ");
			num = scan.nextFloat();
			sum += num; //Esto es lo mismo que: sum = sum + num;
		}
		scan.close();
		System.out.println("La media es: " + (sum/20));
		*/
		
		//Ejercicio 7
		/*
		Scanner scan = new Scanner(System.in);
		int n, fac = 1;
		System.out.println("Introduzca un número: \n");
		n = scan.nextInt();
		if(n!=0) {
			for(int i = 1; i <= n; i++){
				fac = fac * i; //fac *= i;
			}
		} else {
			fac = 0;
		}
		System.out.println("El factorial de " + n + " es: " + fac);
		scan.close();
		*/
		
		//Ejercicio 8
		/*
		Scanner scan = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("Introduzca el número de impares: ");
		n = scan.nextInt();
		n = n*2;
		for(int i = 1; i < n; i++) {
			sum = sum + i; //sum += i
			i++;
		}
		scan.close();
		System.out.println("El resultado es: " + sum);
		*/
		
		//Ejercicio 9
		/*
		int res = 0;
		for(int i = 0; i <= 500; i++) if((i%5) == 0 && (i%7) == 0) res += i;
		System.out.println("El resultado es: " + res);
		*/
		
		//Ejercicio 10
		/*
		String tuit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el tuit a evaluar");
		tuit = scan.nextLine();
		if(tuit.length() <= 280) {
			System.out.println("Tuiteable");
		} else {
			System.out.println("No tuiteable");
		}
		scan.close();
		*/ 
		//Ejercicio 11
		/*
		Scanner scan = new Scanner(System.in);
		int min, d, h;
		System.out.println("Introduzca los minutos totales: ");
		min = scan.nextInt();
		d = ( min / 60 ) / 24;
		h = min / 60;
		h = h - ( d * 24 );
		min = min - ( h * 60 ) - ( d * 24 * 60 );
		System.out.println(d + " días, " + h + " horas y " + min + " minutos.");
		scan.close();
		*/
		
		
		//Ejercicio 12
		/*
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Introduzca el primer número: ");
		n1 = scan.nextInt();
		System.out.println("Introduzca el segundo número: ");
		n2 = scan.nextInt();
		System.out.println("Introduzca el tercero número: ");
		n3 = scan.nextInt();
		if(( n1 % 2 == 0 && n2 % 2 == 0) || 
				( n2 % 2 == 0 && n3 % 2 == 0) || 
				( n1 % 2 == 0 && n3 % 2 == 0) ) {
			System.out.println("Al menos dos de los núneros son pares");
		} else {
			System.out.println("No hay dos o más números pares");
		}
		scan.close();
		*/
		
		//Ejercicio 13
		/*
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca el primer número: ");
		n1 = scan.nextInt();
		System.out.println("Introduzca el segundo número: ");
		n2 = scan.nextInt();
		if(n1 == 0 || n2 == 0) {
			System.out.println("El producto es nulo");
		} else if((n1 < 0 && n2 < 0) || (n1 > 0 && n2 > 0)) {
			System.out.println("El producto es positivo");
		} else {
			System.out.println("El producto es negativo");
		}
		scan.close();
		*/
		
		// Ejercicio 14
		/*
		Scanner scan = new Scanner(System.in);
		int x, y, res = 1;
		System.out.println("Introduzca el número: ");
		x = scan.nextInt();
		System.out.println("Introduzca la potencia: ");
		y = scan.nextInt();
		if(x >= 0 && y >= 0) {
			for(int i = 0; i < y; i++) {
				res *= x; // res = res * x;
			}
			//System.out.println(Math.pow(x, y));
			System.out.println(x + " elevado a " + y + " es " + res);
		} else {
			System.out.println("Los números deben ser naturales");
		}
		scan.close();
		*/
		// Ejercicio 15
		/*
		Scanner scan = new Scanner(System.in);
		float max, min, entrada;
		System.out.println("Introduzca el 1 valor: ");
		min = max = entrada = scan.nextFloat();
		for(int i = 1; i < 20; i++) {
			System.out.println("Introduzca el " + (i+1) + 
					" valor: ");
			entrada = scan.nextFloat();
			if(entrada > max) {
				max = entrada;
			}else if (entrada < min) {
				min = entrada;
			}
		}
		System.out.println("El máximo es " + max + " y el mínimo"
				+ " es " + min);
		scan.close();
		*/
		
		//Ejercicio 16
		/*
		Scanner scan = new Scanner(System.in);
		int x;
		do {
			System.out.println("Introduzca el un valor"
					+ "entre 1 y 9: ");
			x = scan.nextInt();
			if(x <= 0 || x >= 10) System.out.println("ERROR"
					+ " número incorrecto.");
		} while(x <= 0 || x >= 10);
		if( x == 4 || x == 6 || x >= 8) {
			System.out.println(x + " no es un número primo.");
		} else {
			System.out.println(x + " es un número primo.");
		}
		scan.close();
		*/
		
		//Ejercicio 17
		/*
		Scanner scan = new Scanner(System.in);
		int x, anterior = 0;
		do {
			System.out.println("Introduzca un valor positivo: \n"
					+ "Pulse 0 para salir.");
			x = scan.nextInt();
			if(x == 0) break;
		} while( x < 1);
		
		 while(x != 0) {
			if(x > anterior) {
				anterior = x;
			} else if(x < 0) {
				System.out.println("El número debe ser "
						+ "positivo.");
		 	} else {
				System.out.println("El número debe ser "
						+ "mayor que el anterior.");
			}
			System.out.println("Introduzca un valor "
					+ "mayor que el anterior: \n"
					+ "Pulse 0 para salir.");
			x = scan.nextInt();
		}
		System.out.println("Bye!");
		scan.close();
		*/
		/*
		Scanner scan = new Scanner(System.in);
		int x = -1, max = 0;
		do {
			do {
				System.out.println("Escribe un número positivo: \nPulse 0 para salir.");
				x = scan.nextInt();
			} while(x < 0);
			
			if(x > 0){
				if(x > max) {
					System.out.println(x + " es mayor que el anterior");
					max = x;
				} else {
					System.out.println(x + " no es mayor que el anterior");
					max = x;
				}
			}
		} while( x!= 0);
		System.out.println("Bye!");
		scan.close();
		*/
		
		//Ejercicio 18
		/*
		Scanner scan = new Scanner(System.in);
		int n, sumPares = 0, sumImpar = 0, nImpar = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduzca el " + (i+1)+ 
					" valor.");
			n = scan.nextInt();
			if(n % 2 == 0) {
				sumPares += n; // sumPares = sumPares + n;
			} else {
				sumImpar += n; // sumImpar = sumImpar + n;
				nImpar++;
			}
		}
		System.out.println("La suma de los pares es " + sumPares);
		System.out.println("EL total pares es " + (10 - nImpar));
		System.out.println("La media de los impares es " + (sumImpar/nImpar));
		scan.close();
		*/

		//Ejercicio 19
		/*
		  int valor [] = new int[10];
		  int sumatoria = 0;
		  float media = 0;
		  double varianza = 0.0;
		  double desviacion= 0.0; 
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Introduzca números el valor de 10 numeros"
		                                     +" como muestra");
		  for (int i = 0; i < 10; i++ ){
		   System.out.print("Ingrese el valor " + (i + 1) + ":");
		   valor[i] = scan.nextInt();
		   sumatoria += valor[i];
		  }
		  scan.close();
		  media = sumatoria / 10; 
		  for(int i = 0 ; i < 10; i++){
		   double rango;
		   rango = Math.pow(valor[i] - media, 2f); // (valor[i] - media)^2
		   varianza = varianza + rango;
		  }
		  varianza = varianza / 10f;
		  desviacion = Math.sqrt(varianza);
		  System.out.println("Media: " + media);
		  System.out.println("Varianza: " + varianza);
		  System.out.println("Desvianción Típica: " + desviacion);
		 
		*/
		//Ejercicio 20
		/*
		Scanner scan = new Scanner(System.in);
		int n, sumPares = 0, resto;
		System.out.println("Introduzca el valor.");
		n = scan.nextInt();
		while(n != 0) {
			resto = n % 10;
			if(resto % 2 == 0) {
				sumPares += resto; // sumPares = sumPares + resto;
			}
			n = n / 10; //n /= 10;
			System.out.println(resto);
		}
		System.out.println("La suma de los pares es " + sumPares);
		scan.close();
		*/
	}
}
