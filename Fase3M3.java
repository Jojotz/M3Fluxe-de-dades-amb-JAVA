/*Joan Coll JAVA 2  16/09/2020 */
import java.util.*;

public class Fase3M3 {
	
	public static void main(String[] args) { 
		
		Scanner entrada=new Scanner(System.in);
		
		String intro = "Introdueix el nom d'una ciutat:";
		
		System.out.println(intro);
		String city1=entrada.nextLine();

		System.out.println(intro);
		String city2=entrada.nextLine();
		
		System.out.println(intro);
		String city3=entrada.nextLine();
		
		System.out.println(intro);
		String city4=entrada.nextLine();
		
		System.out.println(intro);
		String city5=entrada.nextLine();
		
		System.out.println(intro);
		String city6=entrada.nextLine();
		
		System.out.println("Ciutats introudïdes: "+city1+","+city2+","+city3+","+city4+","+city5+","+city6);
	
		String [] cities = new String [] {city1,city2,city3,city4,city5,city6};
		
		int n = 6;
		String cityChanged = "";
		String [] ArrayCiutatsModificades = new String [6]; 
			
		for (int i = 0; i < n; i++) {							//Entro al Array de Strings
				
			char temp [] = cities[i].toCharArray();   			//Paso de String a CharArray
			
			for (int j = 0; j < temp.length; j++) {  			//Entro al Array de char dentro del String Array
               
				if ((temp[j] == ('a'))||(temp[j] == ('A'))) { 	//Condición para ver si char array contiene "a"s.
					temp[j] = '4';				       	 		//Reemplazo 
					cityChanged = String.valueOf(temp);			//Meto a String cityChanged
					ArrayCiutatsModificades [i] = cityChanged; 	//Meto a String Array la String: cityChanged
					
                    } else { 
                    	cityChanged = String.valueOf(temp);
                    	ArrayCiutatsModificades [i] = cityChanged;
                    }
			}			
		}
		
		// Fase de ordenar alfabeticamente	
		
		String temp2;
		
		System.out.print("Noms en ordre alfabetic: ");
		
			for (int i = 0; i < n; i++) {
	           
				for (int j = i + 1; j < n; j++) {
               
					if (ArrayCiutatsModificades[i].compareTo(ArrayCiutatsModificades[j])>0) {
						temp2 = ArrayCiutatsModificades[i];
						ArrayCiutatsModificades[i] = ArrayCiutatsModificades[j];
						ArrayCiutatsModificades[j] = temp2;
					}
				}
			}
		
			for (int i = 0; i < n - 1; i++) {         
			System.out.print(ArrayCiutatsModificades[i] + ",");
			}
        System.out.print(ArrayCiutatsModificades[n - 1]);
	
	}
}