import java.util.*;


class OrderOfOccurrence {
    public static void main(String[] args) {
        String str = "Hello World my name is dhyan";
        Map<Character, Integer> l = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch !=' '){
                l.put(ch,l.getOrDefault(ch, 0)+1);

            }
            
            }
            for(Map.Entry<Character,Integer> o:l.entrySet()){
                System.out.print(o +" ");


        }

        
    }
}