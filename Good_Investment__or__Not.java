import java.util.*;
public class GoodInvest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print((2*y <= x) ? "YES" : "NO");
    }
}