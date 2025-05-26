import java.io.*;
import java.util.*;
import java.util.stream.*;


class Result {


    public static String isBalanced(String s) 
    {
        Stack<Character> balance=new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);
            if(c =='(' || c =='{' || c=='[' )
            {
                balance.push(c);
            }
            else
            {
                if(balance.isEmpty())
                {
                    return "NO";
                }
                if(c==')' && balance.peek()=='(' ||c=='}' && balance.peek()=='{' || c==']' && balance.peek()=='[' )
                {
                    balance.pop();
                }
            
                else
                {

                    return  "NO";            
                }
        }
        }
        if(balance.isEmpty())
        {
            return "YES";
        }
        return "NO";
      

    }

}

public class Balanced_Brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
