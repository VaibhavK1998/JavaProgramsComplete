package LoopsInJava;

public class WhileLoopExa {

    public static void main(String[] args) {
        int a = 10; // intialization
        while (a <= 20) {  // condition
            System.out.println(" a= " + a);

            a++;// increament


        }
        loopExa();
    }


    public static void loopExa() {
        int a = 15, b = 20;
        while (a <= 20 || b <= 25) {
            System.out.println("a= " + a + " b= " + b);
            a++;
            b++;
        }

    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
