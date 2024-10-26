import java.util.Scanner;

public class lab002taskinterview {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the number1");
        int b=sc.nextInt();
        System.out.println("enter the number 2");


        int result_sub =sum_of_number(a,b);
        System.out.println("the sum is_sub"+result_sub);
        int result_div =sum_of_number_div(a,b);
        System.out.println("the sum is"+result_div);
        int result_mul =sum_of_number_mul(a,b);
        System.out.println("the sum is"+result_mul);
        sc.close();

    }
    static int sum_of_number(int a,int b)
    {
        return (a+b);

    }
    static  int sum_of_number_div(int a,int b)

    {
        return (a/b);

    }
    static int sum_of_number_mul(int a,int b)

    {
        return (a*b);
    }


}
