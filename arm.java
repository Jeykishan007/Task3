import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        int temp,i,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the second number ::");
        num2 = sc.nextInt();
        for ( i = 1; i<num2; i++){
            int a, rem, sum = 0,d=0;
            a = i;
            temp=i;
            while(temp>0)
            {
                temp = temp/10;
                d++;
            }
            while(a != 0) {
                rem = a % 10;
                sum = sum + (int) Math.pow(rem,d);
                a = a / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }


    }

    }


