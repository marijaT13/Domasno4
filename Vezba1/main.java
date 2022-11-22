package vezba1;

public class main {
public static void main(String[] args) {
	covek object=new covek();
	object.setIme("Mihajlo");
	
	object.setPrezime("Hristovski");
	object.setMaticenBroj("21110004100");
	
	
	System.out.println("Objektot ima ime: "+object.getIme()+".");
	System.out.println("Objektot ima prezime: "+object.getPrezime()+".");
	System.out.println("Objektot ima maticen broj: "+object.getMaticenBroj()+".");
	

	
}
}
