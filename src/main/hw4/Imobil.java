package main.hw4;

public class Imobil {
	
	 private String tipCasa;
	   private int nrEtaje;
	   private double pret; 
	   
	   //constructor implicit
	   public Imobil() {
			
			tipCasa = "";
			nrEtaje = 0;
			pret = 0.0;
		}
	   //constructor cu 1 parametru
	   public Imobil(String tipCasa) {
			
			this.tipCasa = tipCasa;
			nrEtaje = 0;
			pret = 0.0;
		}
	   

	public Imobil(String tipCasa, int nrEtaje, double pret) {
		
		this.tipCasa = tipCasa;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}

	public String gettipCasa() { return tipCasa;}

	public void settipCasa(String tipCasa) {this.tipCasa = tipCasa;}

	public int getnrEtaje() {return nrEtaje;}

	public void setnrEtaje(int nrEtaje) {this.nrEtaje = nrEtaje;}

	public double getPret() {return pret;}

	public void setPret(double pret) {this.pret = pret;}
	
}


