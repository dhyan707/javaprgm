import java.util.*;
public class removeSPace2 {
    public static void main(){
        String s="hello my name is dhyan";
        Map<Character,Integer> l=new TreeMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch !=' '){
                l.put(ch,l.getOrDefault(ch,0)+1);
            }
        }
        for (Map.Entry<Character, Integer> o : l.entrySet()) {
            System.out.print(o.getKey());
        }
    }
    
}
