/*Joan Coll JAVA 2  15/09/2020 */
import java.util.Scanner;

public class Fase2M3 {
	
	public static void main(String[] args) { 
		
		Scanner entrada=new Scanner(System.in);
		
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
		
		System.out.println(city1+"\n"+city2+"\n"+city3+"\n"+city4+"\n"+city5+"\n"+city6);
	
		String cities [] = new String [] {city1,city2,city3,city4,city5,city6};
		
		int n = 6;
		String temp;
		
		for (int i = 0; i < n; i++) {
           
			for (int j = i + 1; j < n; j++) {
               
				if (cities[i].compareTo(cities[j])>0) {
                    temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
		}
		
		System.out.print("Noms en ordre alfabetic: ");
        
		for (int i = 0; i < n - 1; i++) {
         
			System.out.print(cities[i] + ",");
        }
        
		System.out.print(cities[n - 1]);
	}
}