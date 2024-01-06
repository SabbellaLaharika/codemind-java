import java.util.*;
public class SecondNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int otherNumber;
        otherNumber = 2*x - y; 
        System.out.println(otherNumber);
    }
}