package Array;

public class ArraYPractise {
    public static void main(String[] args) {

        //oneArray2();
        twoDimensional1();
    }

    public static void onearrya() {
        int ar[] = {10, 20, 30, 40, 50};
        for (int a = 0; a < ar.length; a++) {
            System.out.println(ar[a]);
        }
    }

    public static void oneArray2() {
        int ar[] = new int[3];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;

        for (int a = 0; a < ar.length; a++) {
            System.out.println(ar[a]);
        }
    }

    public static void twoDimensional1() {
        int ar[][] = {{10, 30}, {80, 90}};
        System.out.println(ar);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.println("ar[" + i + "][" + j + "]= " + ar[i][j]);
            }
        }
    }
}
