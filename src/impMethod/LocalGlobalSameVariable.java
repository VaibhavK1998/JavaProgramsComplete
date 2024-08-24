package impMethod;

public class LocalGlobalSameVariable {
    int a = 10, b = 30; //non static global variable

    public static void main(String[] args) {
        System.out.println("program of local and global same variable");
        int a = 20, b = 50;   // duplicate variable are allowed but only when variable are local and global
        // here we can t use other a & b here because duplicate not allowed
        System.out.println("local a= " + a);
        System.out.println("local b= " + b);
        LocalGlobalSameVariable obj = new LocalGlobalSameVariable();
        System.out.println("global variable a= " + obj.a);  //for call static to static by using className().
        System.out.println("global variable b= " + obj.b);
        obj.test1();

    }

    public void test1() {
        int a = 100, b = 300;
        System.out.println("LV a= " + a);
        System.out.println("LV b= " + b);

        System.out.println("GV a= " + this.a); // this. call the global variable a & b (because this. always call global& non static method
        System.out.println("GV b= " + this.b);
    }
}