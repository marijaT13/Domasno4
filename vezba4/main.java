package vezba23;

public class main {
	public static void main(String[] args) {
Avtomobil auto1=new Avtomobil();
System.out.println("Marka: "+auto1.getMarka()+".");
System.out.println("Model: "+auto1.getModel()+".");
System.out.println("Pominati kilometri pred mnozenje: "+auto1.getPominatiKm()+".");
System.out.println("Pominati kilometri posle mnozenje: "+auto1.pomnoziKm(8));
System.out.println("Boja: "+auto1.getBoja());

	}
}