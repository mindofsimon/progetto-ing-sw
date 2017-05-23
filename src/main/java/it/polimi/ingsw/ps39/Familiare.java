package it.polimi.ingsw.ps39;

public class Familiare {
	private final String coloreFam;
	private int valore;
	private final String coloreGio;
	
	public Familiare(String cf,String cg,int v){
		coloreFam=cf;
		coloreGio=cg;
		valore=v;
	}
	
	public void setValore(int v){
		valore=v;
	}
	
	public int getValore(){
		return valore;
	}
	
	public String getColoreGio(){
		return coloreGio;
	}
	
	public String getColoreFam(){
		return coloreFam;
	}
}
