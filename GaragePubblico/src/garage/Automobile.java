package garage;

public class Automobile extends VeicoloAMotore
{
	protected int numPorte;
	public Automobile(int anno, String marca, String tipo, int cil, int porte)
	{
		super(anno, marca, tipo, cil);
		this.numPorte = porte;
	}
	
	public int getNumPorte() {return numPorte;}
	
	public void setNumPorte(int p) {this.numPorte = p;}
	
	public String toString()
	{
		return "Caratteristiche Automobile\n Anno Immatricolazione: "
				+ getAnnoImm() + "\n Marca: " + getMarca() + 
				"\n Alimentazione: " + getTipoAlimentaz() + 
				"\n Cilindrata: " + getCilindrata() + 
				"\n Numero porte: " + numPorte;
	}
}
