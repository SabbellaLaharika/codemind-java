import java.util.*;
public class Hypotenuse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double h;
        h = Math.sqrt((a*a) + (b*b));
        System.out.printf("%.2f",h);
    }
}
