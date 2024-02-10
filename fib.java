import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        int i,c,a=-1,b=1,p;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        p=sc.nextInt();
        for(i=1;i<=p;i++)
        {

            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }

    }
}
