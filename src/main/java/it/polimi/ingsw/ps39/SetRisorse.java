package it.polimi.ingsw.ps39;

public class SetRisorse {

	private int Legni;
	private int Pietre;
	private int Servitori;
	private int Monete;
	private int puntiVittoria;
	private int puntiFede;
	private int puntiMilitari;
	
	public SetRisorse(int l,int p,int s,int m,int pv,int pf,int pm){
		Legni=l;
		Pietre=p;
		Servitori=s;
		Monete=m;
		puntiVittoria=pv;
		puntiFede=pf;
		puntiMilitari=pm;
	}
	
	
	public void setMonete(int m){
		Monete=m;
	}
	
	public int getMonete(){
		return Monete;
	}
	
	public int getLegni(){
		return Legni;
	}
	
	public int getPietre(){
		return Pietre;
	}
	
	public int getServitori(){
		return Servitori;
	}
	
	public int getpuntiMilitari(){
		return puntiMilitari;
	}
	
	public int getpuntiVittoria(){
		return puntiVittoria;
	}
	
	public int getpuntiFede(){
		return puntiFede;
	}
}
