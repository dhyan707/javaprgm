class reverseint
{

    public static void main(){
        int num=123654;
        int rev=0;
        while(num!=0){
             int lastd=num%10;
             rev=rev*10+lastd;
             num=num/10;

        }
        System.out.println("Reverse of the number is: "+rev);
    }
}