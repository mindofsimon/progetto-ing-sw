package it.polimi.ingsw.ps39;

public class Giocatore {
	private final String colore;
	private SetRisorse risorse;
	private int ordine;
	
	
	
	
	public Giocatore(String c){
		colore=c;
		risorse=new SetRisorse(2,2,3,0,0,0,0);
		ordine=0;
		
	}
	
	public void setOrdine(int o){
		ordine=o;
	}
	
	public String getColore(){
		return colore;
	}


	
	public int getOrdine(){
		return ordine;
	}
	
	public SetRisorse getRisorse(){
		return risorse;
	}


}


