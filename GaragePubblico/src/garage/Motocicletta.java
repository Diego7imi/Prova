package garage;

public class Motocicletta extends VeicoloAMotore 
{
	protected String tipologia;
	protected int numTempiMotore;
	public Motocicletta(int anno, String marca, String tipo, int cil, String tipologia, int tempi)
	{
		super(anno, marca, tipo, cil);
		this.tipologia = tipologia;
		this.numTempiMotore = tempi;
	}
	
	public String getTipologia() {return tipologia;}
	public int getNumTempiMotore() {return numTempiMotore;}
	
	public void setTipologia(String t) {this.tipologia = t;}
	public void setNumTempiMotore(int t) {this.numTempiMotore = t;}
	
	public String toString()
	{
		return "Caratteristiche Motocicletta\n Anno Immatricolazione: "
				+ getAnnoImm() + "\n Marca: " + getMarca() + 
				"\n Alimentazione: " + getTipoAlimentaz() + 
				"\n Cilindrata: " + getCilindrata() + 
				"\n Tipologia: " + tipologia + 
				"\n Numero tempi: " + numTempiMotore;
	}
}
