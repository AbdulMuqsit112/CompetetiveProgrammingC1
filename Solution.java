import java.io.*;
import java.util.*;

/**
 *
 * @author muqsit
 */
public class Solution
{
    public static String Translate(String a)
    {
        int cal =90;
        String  s;
        Map<Integer, Integer> wordsDict = new HashMap<>();
        char[] ch = a.toCharArray();
        char[] c = new char[a.length()];    
        for(int i = 65; i<=90;i++)
        {

            wordsDict.put(i,cal);
            cal--;
        }
        cal=122;
        for(int j = 97; j<=122;j++)
        {
           
            wordsDict.put(j,cal);
        //    wordsDict2.put(cal,j);
            cal--;
        }
        
        for(int k=0;k<a.length();k++)
        {
                   

                int ki =(int)ch[k];
                if(wordsDict.containsKey(ki))
                {
                    
                   int q = wordsDict.get(ki); 
                   c[k] = (char)q;
                }
                else
                {
                    c[k]= ch[k];
                }
               
        }
        s = new String (c);
        return s;

     }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int no =0;
        no = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, String> Sentences = new HashMap<>();
        for(int i=0;i<no;i++)
        {
        if(no!=1)
        {
            if(i!=0)
          {
             String in = scanner.nextLine();
          } 
        }
        
            String input = scanner.nextLine();
        
       String b = Translate(input);
        Sentences.put(i, b);
        
       
        
        }
        
        
        String out;
        for(int m=0;m<no;m++)
        {
            out=Sentences.get(m);
            System.out.println(out);
            if(no!=1)
            {
                if(m!=no-1)
                {System.out.println("#");}
            }
        }

        
    }

    
}
