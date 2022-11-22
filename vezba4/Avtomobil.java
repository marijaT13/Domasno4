package vezba23;
import java.util.Scanner;
public class Avtomobil {
private String marka;
private String model;
private double pominatiKm;
private String boja;

public Avtomobil() {
	this.marka="Citroen";
	this.model="Xsara";
	this.pominatiKm=256785;
	this.boja="crvena";
}

public double pomnoziKm(double mnozeniKm) {
	double vkupnoKm=this.pominatiKm*mnozeniKm;
	return vkupnoKm;
}
public double getPominatiKm() {
	return pominatiKm;
}

public void setPominatiKm(double pominatiKm) {
	this.pominatiKm=pominatiKm;
}
public String getMarka() {
	return marka;
}
public void setMarka(String marka) {
	this.marka=marka;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model=model;
}
public String getBoja() {
	return boja;
}
public void setBoja(String boja) {
	this.boja=boja;
}
}

