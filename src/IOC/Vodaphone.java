package IOC;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("vodaphone calling");
		
	}

	@Override
	public void data() {
		System.out.println("vodaphone data");
		
	}
}
