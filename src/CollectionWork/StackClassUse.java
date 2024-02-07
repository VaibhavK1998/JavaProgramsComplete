package CollectionWork;

import java.util.Stack;

public class StackClassUse {
    public static void main(String[] args) {
        stackClassMethods();
    }

    public static void stackClassMethods() {
        Stack s1 = new Stack<>();
        s1.push("rakesh"); // pushed method is used to push object in stack.
        s1.push(90);
        s1.push("bharat");
        s1.push("mahesh");
        System.out.println(s1);
        System.out.println(s1.pop());// remove the object at the top of this stack and return that object as the value of this function.
        System.out.println(s1);
        System.out.println(s1.peek());// looks at the object at the top of the stack without removing from the stack

        System.out.println("search method :"+s1.search(90));// return the position of object in stack
    }
}
