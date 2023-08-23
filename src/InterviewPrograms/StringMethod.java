package InterviewPrograms;

public class StringMethod {
    public static void main(String[] args) {
        // we can create string in two way
        String name1 = "Rajesh";// way 1 to create String
        String name2 = new String("Rajesh");// way 2 to create string Note: String is a class

        int nameLength = name2.length();// method 1 length(); return the length of string
        System.out.println("length of name2: " + nameLength);

        String nameLowercase = name2.toLowerCase();// method 2 toLowerCase(); return the new string which has all the lowercase character
        System.out.println("nameLowercase: " + nameLowercase);

        String nameInUppercase = name2.toUpperCase();// method 3 toUpperCase(); return the new string which has uppercase character
        System.out.println("nameInUppercase : " + nameInUppercase);

        String Trail = " strigCheck ";
        String afterTrim = Trail.trim();// method 4 trim(); method return string after removing all the spaces form front and back of the string
        System.out.println("Fresh string :" + afterTrim);

        String Designation = "SoftwareTester";
        String RebuitDesignation = Designation.substring(3);// method 4 substring(1); method return string from the index we enter to the end of string
        System.out.println("RebuitDesignation : " + RebuitDesignation);

        String substring2 = Designation.substring(2, 8);// method 5 substring(2,8); this method return string from index 2 to index 8
        System.out.println("substring2 : " + substring2);

        String DesignationUpadted = Designation.replace('t', 'p');// method 6 this method replace all t with p
        System.out.println("DesignationUpadted : " + DesignationUpadted);

        boolean resultStartsWith = Designation.startsWith("am");// method 7 startsWith("am"); returns true or false if this string starts with am or not
        System.out.println("result : " + resultStartsWith);

        boolean resultEndsWith = Designation.endsWith("er");// method 8 endsWith("er"); method 8 this method returns true or false if this string end with "er" or not
        System.out.println("resultEndsWith : " + resultEndsWith);

        char indexOfChar = Designation.charAt(2);// method 9 charAt(2); this method return character of index 2
        System.out.println("indexOfChar : " + indexOfChar);

        int indexOfString = Designation.indexOf("s");// method 10 indexOf("s"); this method return the first index of string s
        System.out.println("indexOfString: " + indexOfString);

        int indexOfString2 = Designation.indexOf("T", 6);// method 11 indexOf("T",6); this method start searching string from index 6 and return index
        System.out.println("indexOfString2: " + indexOfString2);

        int lastIndexOfChar = Designation.lastIndexOf('r');// method 12 lastIndexOf('r'); method return last index of 'r' character
        System.out.println("lastIndexOfChar: " + lastIndexOfChar);

        boolean resultDesignation = Designation.equals("Tester");// method 13 this method check content of string and it return true or false
        System.out.println("resultDesignation: " + resultDesignation);

        boolean resultDesignation2 = Designation.equalsIgnoreCase("soFtwareTester");// method 14 this method check content of string and it return true or false it doesn't matter character of string is in Lower or in uppercase lettr
        System.out.println("resultDesignation2: " + resultDesignation2);

        char[] DesigCharcter = Designation.toCharArray();// method 15 this method toCharArray(); return array of cahracter
        for (int a = 0; a < DesigCharcter.length; a++) {
            System.out.println("DesigCharcter : " + DesigCharcter[a]);
        }

        String NewDesignation = Designation.concat("Experience");// method 16 concat("Experience") method return new string with addition of this string
        System.out.println("NewDesignation: " + NewDesignation);

        boolean CharPresentInString = Designation.contains("z");// method 17 contains("z") this method check if this string contain "z" it return true and false
        System.out.println("CharPresentInString: " + CharPresentInString);

        String DesignationrEplaceChar = Designation.replaceFirst("t", "m");// method 18 this method replace only first "t" with "m" and return new string
        System.out.println("DesignationrEplaceChar: " + DesignationrEplaceChar);

        String Newvalue = String.valueOf(10);// method 19 this method convert int,float,char,double,object into string
        System.out.println("Newvalue: " + Newvalue);

        String slogan = "i am the tester";
        String[] DivideSlogan = slogan.split(" ");// method 20 this method split string from " " and it will return String array
        for (String words : DivideSlogan) {
            System.out.println("DividedWords: " + words);
        }

        char[] alphabet={'G','o','o','g','l','e'};// convert array of cahracter into string
        String combineAlphabet=new String(alphabet);
        System.out.println("combineAlphabet: " + combineAlphabet);
    }


}
