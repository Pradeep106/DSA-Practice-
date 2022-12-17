import java.util.Scanner;

public class CountNumber {

    public static void main(String[] args) {

        System.out.println("Enter number ");
        Scanner scanner=new Scanner(System.in);

        int count=0;
        int n=scanner.nextInt();

        while (n>0)
        {
            n=n/10;
            count++;

        }
        System.out.println(count);

    }

}
