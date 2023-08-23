package InterviewPrograms;

public class PalindromStringProgram {
    public static void main(String[] args) {
palindromStringMethod1();
    }
    public static void palindromStringMethod1(){
        String name="rajan";
        String reverse="";

        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println("reverse String:"+reverse);
        if (reverse.equals(name)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not palindrom");
        }
    }
}
