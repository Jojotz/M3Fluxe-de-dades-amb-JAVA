/*Joan Coll JAVA 2  16/09/2020 */
import java.util.*;

public class Fase4M3 {
	
	public static void main (String[] args) { 
		
		Scanner entrada=new Scanner(System.in);				// Cogemos input de ciudades
		
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
	
		//Declaro array por cada ciudad:
		String [] arrayCity1 = new String [city1.length()];
		String [] arrayCity2 = new String [city2.length()];
		String [] arrayCity3 = new String [city3.length()];
		String [] arrayCity4 = new String [city4.length()];
		String [] arrayCity5 = new String [city5.length()];
		String [] arrayCity6 = new String [city6.length()];
		
		//Paso cada array por función para rellenarlo letra por letra:
		fillArray (arrayCity1);
		fillArray (arrayCity2);
		fillArray (arrayCity3);
		fillArray (arrayCity4);
		fillArray (arrayCity5);
		fillArray (arrayCity6);
		
		//Paso cada array por función para invertirlos:
		arrangeArray (arrayCity1);
		arrangeArray (arrayCity2);
		arrangeArray (arrayCity3);
		arrangeArray (arrayCity4);
		arrangeArray (arrayCity5);
		arrangeArray (arrayCity6);
	
		//Paso arrays invertidos por función para mostrar por pantalla:
		printArray (arrayCity1);
		printArray (arrayCity2);
		printArray (arrayCity3);
		printArray (arrayCity4);
		printArray (arrayCity5);
		printArray (arrayCity6);
	}
				
		public static void fillArray(String [] arrayFun) {
		
			for (int i = 0; i <arrayFun.length; i++) {							
				
				Scanner entrada2=new Scanner(System.in);
				System.out.println("Introdueix una lletra: ");
				arrayFun [i]= entrada2.nextLine();			
			}		
		}
			
		public static void arrangeArray(String [] arrayFun) {
			
			List<Object> list = Arrays.asList(arrayFun);
		    Collections.reverse(list);
		    list.toArray(arrayFun);
		 }
		
		public static void printArray(String [] arrayFun) { //Construyo string desde string Array y printo
			
			StringBuilder builder = new StringBuilder();
			for (String value : arrayFun) {
			    builder.append(value);
			}
			String city = builder.toString();
			System.out.println(city);
		}
}		