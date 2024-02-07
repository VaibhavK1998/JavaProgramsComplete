package InterviewPrograms;

public class ReverseEachWordInString {
    public static void main(String[] args) {
       // reverseEachWordInStringWay1();
        reverseEachWordInStringWay2();
    }

    public static void reverseEachWordInStringWay1() {
        String slogan = "lets go to play";


        String[] slow=slogan.split(" ");

        for(int i=0;i<slow.length;i++){
            String s=slow[i];
            StringBuffer sb = new StringBuffer(s);
            System.out.print(sb.reverse()+" ");
        }

    }
    public static void reverseEachWordInStringWay2(){
        String slogan = "lets go to play";
        String[] slow=slogan.split(" ");
        String reverseString="";
        for(String word:slow){
            String reverseWord="";
            for(int i=word.length()-1;i>=0;i--){
                reverseWord=reverseWord+word.charAt(i);
            }
            reverseString=reverseString+reverseWord+" ";

        }
        System.out.println(reverseString);

    }

}

