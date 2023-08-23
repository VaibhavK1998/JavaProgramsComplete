package InterviewPrograms;

public class LinearSearchProgram {
    public static void main(String[] args) {
linearSearchProgram();
    }
    public static void linearSearchProgram(){
        int ar[]={10,20,30,40,50,40};
        int serach=150;
        boolean flag=false;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==serach){
                System.out.println("element found: "+ar[i]);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("element not found ");
        }
    }
}
