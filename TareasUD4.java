package tasques;

public class tasca1 {

	public static void main(String[] args) {
		
		System.out.println("-----------TAREA 1---------------");
		
		double numero1 = 5;
		
		double numero2 = 20;
		
		int suma =(int) (numero1 + numero2);
		
		int resta =(int) (numero1 - numero2);
		
		int multiplicacion =(int) (numero1 * numero2);
		
		double division = (numero1 / numero2);
		
		int resto=(int) (numero1%numero2);
		
		System.out.println("La suma es :" + suma);
		
		System.out.println("La resta es: " + resta);
		
		System.out.println("El producto es: " + multiplicacion);
		
		System.out.println("La división es: " + division);
		
		System.out.println("El resto de la division es: " + resto);
		
		System.out.println("-----------TAREA 2---------------");
		
		int N= 5;
		
		double A= 4.56;
		
		char C= 'a' ;
		
		System.out.println("Las tres variables son: C( " + C + "), A (" + A + ") y N (" + N + ")");
		
		double suma2 =(double) (N+A);
		
		System.out.println("La suma de N y A es: " + suma2);
		
		double resta2= (double) (A-N);
		
		System.out.println("La diferencia entre A y N es: "+ resta2);
		
		System.out.println("El valor numerico real de C es: " + ((int)C));
		
		System.out.println("-----------TAREA 3---------------");
		
		int X=13;
		
		int Y=15;
		
		double N3=14;
		
		double M=16;
		
		System.out.println("Los valores de mis variables son: X(" + X + "), Y(" + Y + "), M(" + M + ") y N(" + N3 + ")");
		
		System.out.println("La suma de X más Y es: " + (X+Y));
		
		System.out.println("La diferencia entre X e Y es: " + (X-Y));
		
		System.out.println("El producto de X por Y es: " + (X*Y));
		
		System.out.println("El cociente de X entre Y es: " + ((double)X/Y));
		
		System.out.println("El resto de X entre Y es: " + (X%Y));
		
		System.out.println("La suma de N y M es: " + ((int)N3+M));
		
		System.out.println("La diferencia entre N y M es : " + ((int)N3-M));
		
		System.out.println("El producto de N por M es: " + ((int)N3*M));
		
		System.out.println("El cociente de N entre M es: " + (N3/M));
		
		System.out.println("El resto de N entre M es: " + ((int)N3%M));
		
		System.out.println("La suma de X mas N es: " + ((int)X+N3));
		
		System.out.println("El cociente de Y entre M: " + ((double)Y/M));
		
		System.out.println("El resto de Y entre M: " + ((int)Y%M));
		
		System.out.println("El doble de las variables X, Y ,M y N , es respectivamente : " + (X*2) +", " + (Y*2) + ", " + (M*2) + " y " + (N3*2));
		
		System.out.println("La suma de todas las variables es: " + ((int)X+Y+N3+M));
		
		System.out.println("El producto de todas las variables es: " + ((int)X*Y*M*N3));
		
		System.out.println("-----------TAREA 4---------------");
		
		int N4= 15;
		
		System.out.println("Mi variable n tiene el valor de " + N4 + ".");
		
		System.out.println("Mi variable n es aumentada en 77 y pasa a valer " + (N4+=77) + ".");
		
		System.out.println("Mi variable n es decrementada en 3 y pasa a valer " + (N4-=3) + ".");
		
		System.out.println("Mi variable n es multiplicada por 2 y pasa a valer " + (N4*2) + ".");

		
		System.out.println("-----------TAREA 5---------------");

		int A5=1;
		int B=2;
		int C5=3;
		int D=4;
		int BETA=2;
		System.out.println("Mis variables son: A(" + A + "), B(" + B + "), C(" + C + ") y D(" + D + ").");
		
		
		B=C5;
		C5=A5;
		A5=D;
		D=BETA;
		
		System.out.println("Mis variables tras el cambio de valores son: A(" + A5 + "), B(" + B + "), C(" + C5+ ") y D(" + D + ").");
	}

}
