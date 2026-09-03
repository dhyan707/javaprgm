import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ImportfromFile {
    public static void main()throws IOException {
        String s=Files.readString(Path.of("C:\\Users\\dhyanprem\\Documents\\javapractice.txt"));
        
        Map<Character,Integer> l=new TreeMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch !=' '){
                l.put(ch,l.getOrDefault(ch,0)+1);
            }
        }
        for (Map.Entry<Character, Integer> o : l.entrySet()) {
            System.out.print(o+" ");
        }
    }
    
}
