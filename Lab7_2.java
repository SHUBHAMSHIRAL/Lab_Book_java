import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Lab7_2  {
public static void main(String[] args) {
    try
    {
        FileInputStream file = new FileInputStream("C:\\Users\\Rutuja\\Documents\\uti.docx");
        DataInputStream dis = new DataInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(dis));
        String Contents="";
        String str="";

        while ((Contents = br.readLine()) != null) {
            str+=Contents;
        }

        char[]char_array =str.toCharArray();
        int count = 0;
        char ch = char_array[count];
        Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(charCounter.containsKey(char_array[i]))
            {
                charCounter.put(ch, charCounter.get(ch)+1);
            } 
            else
            {
                charCounter.put(ch, 1);
            }
       }

       for(Character key:charCounter.keySet())
       {
           System.out.println(key+""+charCounter.get(key));
       }
    } 
    catch(IOException e1){
        System.out.println(e1);
    }
    }
}