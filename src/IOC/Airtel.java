package IOC;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("airtel constructor");
	}

	@Override
	public void calling() {
		System.out.println("airtel calling");
		
	}

	@Override
	public void data() {
		System.out.println("airtel data");
		
	}

}
