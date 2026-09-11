import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the digit :");
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
        while(num!=0){
            int lastd=num%10;
           sum=lastd*lastd*lastd +sum;
num=num/10;
        }
        if(sum==num1){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
        System.out.println(sum);
    }
}