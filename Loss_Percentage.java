import java.util.*;
public class LossPercentage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextDouble();
        double sp = sc.nextDouble();
        double percent;
        percent = ((cp - sp)/cp)*100;
        System.out.printf("%.2f",percent);
    }
}