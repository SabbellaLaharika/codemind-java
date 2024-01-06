import java.util.*;
public class HeronFormula
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double area,s;
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.4f",area);
    }
}
