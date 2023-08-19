package StringPrograms;

public class StringBufferClassUse {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Rahulrajan");
        // note: stringBuffer create mutable object stringBuffer override the value of object instead of create new object and stored data inside that object

        String name= String.valueOf(sb.append("prakash"));// method 1 append(); method we use to append this string with end of main string
        System.out.println(name);

        sb.delete(3,7);// method 2 It is used to delete the string from specified startIndex and endIndex.
        System.out.println(sb);

        //sb.charAt('r');// method 3 this return the index of this cahracter
        sb.deleteCharAt(7);// method 4 this method delete char of index number 8
        System.out.println(sb);
        sb.insert(3,"ra");// method 5 It is used to insert the specified string with this string at the specified position
        System.out.println(sb);

        sb.reverse();// method 6 is used to reverse the string.
        System.out.println(sb);
        sb.setLength(6);// method 7 this method set the length of this object
        System.out.println(sb);
    }
}
