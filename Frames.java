import java.util.*;
public class Cost
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();
        int x = read.nextInt();
        System.out.println(2*(n+m)*x);
    }
}