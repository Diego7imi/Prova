package garage;

public class VeicoloAMotore 
{
	protected int annoImmatricolazione;
	protected String marca;
	protected String tipoAlimentazione;
	protected int cilindrata;
	
	public VeicoloAMotore(int anno, String marca, String tipo, int cil)
	{
		this.annoImmatricolazione = anno;
		this.marca = marca;
		this.tipoAlimentazione = tipo;
		this.cilindrata = cil;
	}
	
	public int getAnnoImm() {return annoImmatricolazione;}
	public String getMarca() {return marca;}
	public String getTipoAlimentaz() {return tipoAlimentazione;}
	public int getCilindrata() {return cilindrata;}
	
	public void setAnnoImm(int anno) {this.annoImmatricolazione = anno;}
	public void setMarca(String m) {this.marca = m;}
	public void setTipoAlimentaz(String alimentazione) {this.tipoAlimentazione = alimentazione;}
	public void setCilindrata(int cilindrata) {this.cilindrata = cilindrata;}
}
