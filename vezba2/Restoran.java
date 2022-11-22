package vezba21;

public class Restoran {
private String imeNaRestoran;
private String lokacija;
private int brojNaSedista;
private String telefon;

public String getRestoran() {
	return imeNaRestoran;
}
public void setRestoran(String imeNaRestoran) {
	this.imeNaRestoran=imeNaRestoran;
}
public String getLokacija() {
	return lokacija;
}
public void setLokacija(String lokacija) {
	this.lokacija=lokacija;
}
public String getTelefon() {
	return telefon;
}
public void setTelefon(String telefon) {
	this.telefon=telefon;
}
public int getBrSedista() {
	return brojNaSedista;
}

public void setBrSedista(int brojNaSedista) {
	this.brojNaSedista=brojNaSedista;
}
}
