package impMethodSet2;
/*
this keyword use to refer current class instance variable
 */
public class ThisKeywordUse {

    int a=10;
    String Name="soham";

    public void Test1(){
        System.out.println(a);
        System.out.println(Name);
    }


    public static void main(String[] args) {
        ThisKeywordUse tk=new ThisKeywordUse();
        tk.Test1();

}
}