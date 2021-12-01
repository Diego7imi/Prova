import garage.*;
import java.util.Scanner;
public class MainGarage {

	public static void main(String[] args) 
	{
		String risp, marca, tipo, tipologia;
		int anno, cil, porte, tempi, capacita, posto;
		Scanner input = new Scanner(System.in);
		
		Garage g = new Garage();
		VeicoloAMotore v;
		
		System.out.println("Benvenuto nella gestione del Garage!");
		do 
		{
			input = new Scanner(System.in);
			System.out.println("\nPremi");
			System.out.println("A) Inserisci un automobile");
			System.out.println("B) Inserisci una moto");
			System.out.println("C) Inserisci un furgone");
			System.out.println("D) Libera un posto");
			System.out.println("E) Situazione corrente posti");
			System.out.println("F) Esci");
			System.out.print("\nScelta: ");
			risp = input.nextLine();
			
			switch(risp)
			{
			case "a":
				System.out.println("\nInsersci i dati dell'automobile");
				System.out.print("Inserisci l'anno: ");
				anno = input.nextInt();
				System.out.print("Inserisci la marca: ");
				marca = input.next();
				System.out.print("Inserisci l'alimentazione: ");
				tipo = input.next();
				System.out.print("Inserisci la cilindrata: ");
				cil = input.nextInt();
				System.out.print("Inserisci le porte: ");
				porte = input.nextInt();
				v = new Automobile(anno, marca, tipo, cil, porte);
				if(g.immettiNuovoVeicolo(v))
					System.out.println("Veicolo inserito con successo!");
				else System.out.println("Errore");
				break;
			case "b":
				System.out.println("\nInsersci i dati della moto");
				System.out.print("Inserisci l'anno: ");
				anno = input.nextInt();
				System.out.print("Inserisci la marca: ");
				marca = input.next();
				System.out.print("Inserisci l'alimentazione: ");
				tipo = input.next();
				System.out.print("Inserisci la cilindrata: ");
				cil = input.nextInt();
				System.out.print("Inserisci la tipologia: ");
				tipologia = input.next();
				System.out.print("Inserisci i tempi: ");
				tempi = input.nextInt();
				v = new Motocicletta(anno, marca, tipo, cil, tipologia, tempi);
				if(g.immettiNuovoVeicolo(v))
					System.out.println("Veicolo inserito con successo!");
				else System.out.println("Errore");
				break;
			case "c":
				System.out.println("\nInsersci i dati del furgone");
				System.out.print("Inserisci l'anno: ");
				anno = input.nextInt();
				System.out.print("Inserisci la marca: ");
				marca = input.next();
				System.out.print("Inserisci l'alimentazione: ");
				tipo = input.next();
				System.out.print("Inserisci la cilindrata: ");
				cil = input.nextInt();
				System.out.print("Inserisci la capacità: ");
				capacita = input.nextInt();
				v = new Furgone(anno, marca, tipo, cil, capacita);
				if(g.immettiNuovoVeicolo(v))
					System.out.println("Veicolo inserito con successo!");
				else System.out.println("Errore");
				break;
			case "d":
				System.out.print("\nImmetti numero posto da liberare: ");
				posto = input.nextInt();
				if(posto >= 0 && posto <15)
					System.out.println("Il veicolo estratto al posto " + posto + " e\': \n\n" + g.estraiVeicolo(posto));
				else System.out.println("Il posto non esiste!");
				break;
			case "e":
				System.out.println("Lista posti auto del garage");
				g.stampaSituazionePosti();
				break;
			case "f": 
				System.out.println("Arrivederci!");
				break;
			}
		}while(!risp.equals("f"));
		
		input.close();
	}
}
