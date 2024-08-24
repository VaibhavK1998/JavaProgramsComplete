package InterviewPrograms;

public class StringBufferClassUse {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Rajhul");
        // note: stringBuffer create mutable object stringBuffer override the value of object instead of create new object and stored data inside that object
        System.out.println(sb);
        System.out.println("conversion of StringBuffer to string:" + String.valueOf(sb));

        sb.deleteCharAt(1);// here we are deleting the first character from StringBuffer
        System.out.println(sb);// here we can see that value of sb change it means StringBufffer is muttable in java

        String name = String.valueOf(sb.append("prakash"));// method 1 append(); method we use to append this string with end of main string
        System.out.println(name);

        sb.delete(3, 7);// method 2 It is used to delete the string from specified startIndex and endIndex.
        System.out.println("after deleteChar from range" + sb);

        //sb.charAt('r');// method 3 this return the index of this cahracter
        sb.deleteCharAt(7);// method 4 this method delete char of index number 8
        System.out.println("after deleteCharAt:" + sb);

        sb.insert(3, "ra");// method 5 It is used to insert the specified string with this string at the specified position
        System.out.println("after insert method" + sb);

        sb.replace(3, 5, "bhau");// method is used to replave the character from specific inex to specific index
        System.out.println("after replace method" + sb);

        System.out.println("String before reverse : " + sb);
        sb.reverse();// method 6 is used to reverse the string.
        System.out.println("after reverse method: " + sb);

        sb.setLength(6);// method 7 this method set the length of this object
        System.out.println("after setLength method" + sb);

        String value = sb.toString();// method 8 this method returns string exactly the value which is in sb;
        System.out.println("after toString method" + sb);
    }
}
