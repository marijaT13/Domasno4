package vezba21;

public class main {
public static void main(String[] args) {
	Restoran Restoran1=new Restoran();
	Restoran1.setRestoran("Aura");
	Restoran1.setLokacija("ul.Goce Delcev- Prilep");
	Restoran1.setBrSedista(200);
	Restoran1.setTelefon("077875959");
	System.out.println("Veganskiot restoran "+Restoran1.getRestoran()+", koj se naogja na "+Restoran1.getLokacija()+", sobira  "+Restoran1.getBrSedista()+" gosti. Za povekje informacii ili rezervacii javetese na telefonskiot broj "+Restoran1.getTelefon()+".");
}
}
