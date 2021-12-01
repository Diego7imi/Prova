package garage;

public class Garage 
{
	VeicoloAMotore[] veicoli = new VeicoloAMotore[15];
	private static int postitotali = 15;
	private static int postirimanenti = 15;
	
	public boolean immettiNuovoVeicolo(VeicoloAMotore v)
	{
		if(postirimanenti == 0)
			return false;
		else 
		{
			for(int i=0; i<postitotali; i++)
			{
				if(veicoli[i] == null)
				{
					veicoli[i] = v;
					postirimanenti--;
					return true;
				}
			}
		}
		return false;
	}
	
	public VeicoloAMotore estraiVeicolo(int posto)
	{
		VeicoloAMotore veicolo;
		veicolo = veicoli[posto];
		veicoli[posto] = null;
		return veicolo;
	}
	
	public void stampaSituazionePosti()
	{
		int i = 0;
		for(VeicoloAMotore v : veicoli) 
		{
			if(v != null)
				System.out.println("\nPosto " + i + "\n" + v);
			else
				System.out.println("\nPosto " + i + "\nVuoto");
			i++;
		}
	}
}
