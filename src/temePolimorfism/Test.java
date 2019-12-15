package temePolimorfism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone s = new Smartphone("AMOLED", 25, 100, "Silver", 5, 10, 1);
		Phone p = s;
		
		System.out.println("\t Polimorfism dinamic \n");
		p.description();
		s.description();
		
		System.out.println("\n ============================================== \n\n"
				+ "\t Polimorfism static \n");
		s.increaseVolMicrophone();
		s.increaseVolMicrophone(10);
	}

}
