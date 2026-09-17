import java.util.Scanner;
public class Strong {
    public static void main()
    {
        System.out.println("enter the digit:");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int num1=num;
        int sum=0;
        while(num>0){
            int lastd=num%10;
            int fact =1;
            for(int i=1;i<=lastd;i++)
            {
                fact=fact*i;
                
                }

            sum=sum+fact;
            num=num/10;
            // System.out.print(sum);
        }
        if(sum==num1)
            System.out.print(num1 +" is a strong number");
        else
            System.out.println(num1 +" is not a strong number");

    }
    
}
