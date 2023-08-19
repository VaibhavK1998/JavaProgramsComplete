package controlStatmentsExa;

public class SwitchStatEx2 {

	public static void main(String[] args) {
		byte number=120;    // if  input no is more than 127 then we have to do explicit narrowing
		switch(number) {
		case 40:
			System.out.println("its a 40");
			break;
		case 80:
			System.out.println("its 80");
			break;
		case 100:
			System.out.println("its 100") ;
			break;
		case 120:
			System.out.println("its 120");
			break;
		case(byte) 140:// we convert integer 140 into byte 140 by explicit narrowing
			System.out.println("its 140");
		break;
		default:
			System.out.println("invalid");
		
		
		
		
		
		
		
		}
		

}
}