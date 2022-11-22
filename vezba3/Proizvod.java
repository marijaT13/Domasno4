package vezba22;

public class Proizvod {
private String imeNaProizvod;
private String proizvoditel;
private double cena;
private double tezina;

public Proizvod() {
	this.imeNaProizvod="Mentos";
	this.proizvoditel="Perfetti";
	this.cena=35;
	this.tezina=38;
}
public String getProizvod() {
	return imeNaProizvod;
}
public void setProizvod(String imeNaProizvod) {
	this.imeNaProizvod=imeNaProizvod;
}
public String getProizvoditel() {
	return proizvoditel;
}
public void setProizvoditel(String proizvoditel) {
	this.proizvoditel=proizvoditel;
}
public double getCena() {
	return cena;
}

public void setCena(double cena) {
	this.cena=cena;
}
public double getTezina() {
	return tezina;
}

public void setTezina(double tezina) {
	this.tezina=tezina;
}
}
