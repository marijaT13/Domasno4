package vezba22;

public class main {
	public static void main(String[] args) {
		Proizvod p1=new Proizvod();
		System.out.println("Ime na produkt: "+p1.getProizvod()+".");
		System.out.println("Proizvoditel: "+p1.getProizvoditel()+".");
		System.out.println("Cena "+(int)p1.getCena()+" denari.");
		System.out.println("Tezina "+p1.getTezina()+"g.");
		
	}
}
