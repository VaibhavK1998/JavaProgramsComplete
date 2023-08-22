package StringPrograms;

public class ReverseStringProgram {
    public static void main(String[] args) {
        //reverseStringWay1();
        reverseStringUsingBufferClassMethod();
    }
    public static void reverseStringWay1(){
        String name="rajan";
        String reverse="";

        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println("reverse String:"+reverse);
    }

    public static void reverseStringUsingBufferClassMethod(){
        String name="rajan";
        StringBuffer reverse=new StringBuffer(name);
        System.out.println("reverse string :"+reverse.reverse());
    }

}
