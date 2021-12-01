package garage;

public class Furgone extends VeicoloAMotore
{
	protected int capacitaCarico;
	public Furgone(int anno, String marca, String tipo, int cil, int capacita)
	{
		super(anno, marca, tipo, cil);
		this.capacitaCarico = capacita;
	}
	
	public int getCapacita() {return capacitaCarico;}
	
	public void setCapacita(int c) {this.capacitaCarico = c;}
	
	public String toString()
	{
		return "Caratteristiche Furgone\n Anno Immatricolazione: "
				+ getAnnoImm() + "\n Marca: " + getMarca() + 
				"\n Alimentazione: " + getTipoAlimentaz() + 
				"\n Cilindrata: " + getCilindrata() + 
				"\n Capacità: " + capacitaCarico + " Kg";
	}
}
