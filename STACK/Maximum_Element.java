import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

 

    public static List<Integer> getMax(List<String> operations) 
    {
       
        List<Integer> ans=new ArrayList<>();
        
        Stack<Integer> news=new Stack<>();
        Stack<Integer> maxs = new Stack<>();
        for(String op : operations)
        {
            if(op.startsWith("1 "))
            {
                int x = Integer.parseInt(op.split(" ")[1]);
                news.push(x);
                if(maxs.isEmpty()  || x>= maxs.peek())
                {
                    maxs.push(x);
                }
            }
             if(op.equals("2"))
             {
                if(!news.isEmpty())
                {
                    int y = news.pop();
                    if(y==maxs.peek())
                    {
                        maxs.pop();
                    }
                }
             }
             if(op.equals("3"))
             {
                if(!news.isEmpty())
                {
                   
                   ans.add(maxs.peek()); 
                }
                
             }
             
        }
        return ans;
    }

}

public class Maximum_Element  {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
