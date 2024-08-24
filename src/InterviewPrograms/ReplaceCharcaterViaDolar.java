package InterviewPrograms;

public class ReplaceCharcaterViaDolar {
    public static void main(String[] args) {
        String input = "Go to Joho";
        String output = "G$ t$$ J$$$h$$$$";
        StringBuffer stringBuffer=new StringBuffer(input);
        int count = 0;
        String output2=null;
        String updated=null;
        for (int a = 0; a < input.length(); a++) {
            char i = input.charAt(a);
            if (i == 'o') {
                count++;
                stringBuffer.deleteCharAt(i);
                stringBuffer.append(String.valueOf('$').repeat(count));
             output2= input.replaceAll("[o]",String.valueOf(i).repeat(count));
                System.out.println(output2);
            }

        }

    }
}
