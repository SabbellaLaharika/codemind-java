import java.util.*;
public class MaxHeight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(n > d ? n : d);
    }
}