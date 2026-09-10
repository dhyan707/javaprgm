public class ReverseAStrings {
    public static void main(){
        String str="my name is dyan";
        String str2="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
         str2=ch+str2;
        }
        System.out.println("Reverse of the string is: "+str2);
    }
}
