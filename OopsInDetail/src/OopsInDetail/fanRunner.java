package OopsInDetail;

public class fanRunner {

	public static void main(String[] args) {
		
		Fan fan = new Fan("USHA", 0.5467, "Green");
		
		
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)1);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}
