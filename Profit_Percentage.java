import java.util.*;
public class ProfitPercentage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextDouble();
        double sp = sc.nextDouble();
        double percent;
        percent = ((sp - cp)/cp)*100;
        System.out.printf("%.2f",percent);
    }
}