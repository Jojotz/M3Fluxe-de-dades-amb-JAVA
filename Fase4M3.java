/*Joan Coll JAVA 2  22/09/2020 */
import java.util.*;

public class Fase4M3 {
	
	public static void main (String[] args) { 
		
		Scanner entrada=new Scanner(System.in);				// Cojo input de ciudades
		
		System.out.println("Introdueix el nom d'una ciutat: ");
		String city1=entrada.nextLine();

		System.out.println("Introdueix el nom d'una ciutat: ");
		String city2=entrada.nextLine();
		
		System.out.println("Introdueix el nom d'una ciutat: ");
		String city3=entrada.nextLine();
		
		System.out.println("Introdueix el nom d'una ciutat: ");
		String city4=entrada.nextLine();
		
		System.out.println("Introdueix el nom d'una ciutat: ");
		String city5=entrada.nextLine();
		
		System.out.println("Introdueix el nom d'una ciutat: ");
		String city6=entrada.nextLine();
		
		System.out.println("Ciutats introudïdes: "+city1+","+city2+","+city3+","+city4+","+city5+","+city6);
	
		//Paso a char array por cada string ciudad:
		
		char[] charCity1= city1.toCharArray();
		char[] charCity2= city2.toCharArray();
		char[] charCity3= city3.toCharArray();
		char[] charCity4= city4.toCharArray();
		char[] charCity5= city5.toCharArray();
		char[] charCity6= city6.toCharArray();
		
		//Paso cada array de chars por función para invertirlos y asigno a nuevos Arrays reversed:
		
		char[] reversedCity1 = arrangeArray (charCity1);
		char[] reversedCity2 = arrangeArray (charCity2);
		char[] reversedCity3 = arrangeArray (charCity3);
		char[] reversedCity4 = arrangeArray (charCity4);
		char[] reversedCity5 = arrangeArray (charCity5);
		char[] reversedCity6 = arrangeArray (charCity6);
	
		//Paso arrays invertidos por función para mostrar por pantalla:
		
		printArray (reversedCity1);
		printArray (reversedCity2);
		printArray (reversedCity3);
		printArray (reversedCity4);
		printArray (reversedCity5);
		printArray (reversedCity6);
	}
						
		public static char[] arrangeArray(char[] arrayFun) {
			
			char arrayRev[] = new char[arrayFun.length];
		    for (int i = arrayFun.length - 1; i >= 0; i--) {
		    	arrayRev[i] = arrayFun[(arrayFun.length - 1) - i];
		    }
		    return arrayRev;
		 }
		
		public static void printArray(char [] arrayFun) { 
			
			System.out.println(arrayFun);
		}
}	