package it.polimi.ingsw.ps39;

import java.util.Random;

public class Gioco {
	
	private static final int NGIOCATORI=4;
	private final Giocatore[] giocatori;
	private static final int NDADI=3;
	private final Dado[] dadi;
	private final Familiare[] familiari;
	

	public Gioco(){
		giocatori=new Giocatore[NGIOCATORI];
		giocatori[0]=new Giocatore("ROSSO");
		giocatori[1]=new Giocatore("BLU");
		giocatori[2]=new Giocatore("VERDE");
		giocatori[3]=new Giocatore("GIALLO");
		dadi=new Dado[NDADI];
		dadi[0]=new Dado("NERO");
		dadi[1]=new Dado("BIANCO");
		dadi[2]=new Dado("ARANCIONE");
		familiari=new Familiare[NGIOCATORI*4];
	}
		
	
	public void gioca(){
		OrdineIniziale();
		AssegnaMonete();
		LanciaDadi();
		CreaFamiliari();
	}

	
	
	
	private void CreaFamiliari(){
		for (int j=0;j<(NGIOCATORI);j++){
			for(int i=0;i<4;i++){
					familiari[i]=new Familiare(AssegnaColore(i),giocatori[j].getColore(),AssociaDado(i));					
					System.out.println("CG= "+familiari[i].getColoreGio()+ " CF= "+familiari[i].getColoreFam()+" VAL= "+familiari[i].getValore());
			}
		}
	}
	
	
	private int AssociaDado(int n){
		if((n+1)%4==0){
			return 0;
		}
		else return dadi[n].getValore();
	}
	
	
	private String AssegnaColore(int n){
		String colore="";
		switch (n){
			case 0:
				colore="NERO";
				break;
			case 1:
				colore="BIANCO";
				break;
			case 2:
				colore="ARANCIONE";
				break;
			case 3:
				colore="NEUTRO";
				break;
		}
		return colore;
	}
	
	private void LanciaDadi(){
		Random random=new Random();
		for(int i=0;i<NDADI;i++){
		dadi[i].setValore(random.nextInt(6)+1);
		System.out.println("DADO: "+dadi[i].getColore()+" VALORE:"+dadi[i].getValore());
		}
	}
	
	private void AssegnaMonete(){
		for(int i=0;i<NGIOCATORI;i++){
			System.out.println("Colore: " + giocatori[i].getColore() + " Ordine: " + giocatori[i].getOrdine()+"°");
			SetRisorse r;
			r=giocatori[i].getRisorse();
			switch(giocatori[i].getOrdine()){
				case 1: r.setMonete(5);
					break;
				case 2: r.setMonete(6);
					break;
				case 3: r.setMonete(7);
					break;
				case 4: r.setMonete(8);
					break;
			}
		r=giocatori[i].getRisorse();
		System.out.println("Colore: " + giocatori[i].getColore() + " Monete: " +r.getMonete() );
		}
	}
	
	private boolean OrdineOk(int o){
		boolean ok=true;
		for(int i=0;i<NGIOCATORI;i++){
			if(giocatori[i].getOrdine()==o){
				ok=false;
				return ok;
			}
		}
		return ok;
	}
	
	private void OrdineIniziale(){
		Random random=new Random();
		int ord=0;
		int n=4;
		for(int i=0;i<NGIOCATORI;i++){
			do{
				ord=random.nextInt(n)+1;
			} while(!OrdineOk(ord));
		giocatori[i].setOrdine(ord);
		}
	}
}
