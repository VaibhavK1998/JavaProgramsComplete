package InterviewPrograms;

public class CountWordInString {
    public static void main(String[] args) {
countWordInString();
    }
    public static void countWordInString(){
        String name="Welcome to india";
        int count=1;
         for(int i=0;i<name.length()-1;i++){
             if(name.charAt(i)==' '&& name.charAt(i+1)!=' '){
                 count++;
             }
         }
         System.out.println("Count: "+count);
    }

}
