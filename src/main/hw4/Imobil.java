package main.hw4;

public class Imobil {
	
	 private String tipCasa;
	   private int nrEtaje;
	   private double pret; 

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


