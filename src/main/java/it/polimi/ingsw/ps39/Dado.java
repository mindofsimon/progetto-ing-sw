package it.polimi.ingsw.ps39;

public class Dado {
	private final String colore;
	private int valore;
	
	public Dado(String c){
		colore=c;
		valore=0;
	}
	
	public void setValore(int v){
		valore=v;
	}
	
	public int getValore(){
		return valore;
	}
	
	public String getColore(){
		return colore;
	}
}
