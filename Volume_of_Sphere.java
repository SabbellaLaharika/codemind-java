import java.util.*;
public class VolumeOfSphere
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        Double volume;
        volume = (4*3.14*r*r*r)/3; 
        System.out.printf("%.2f",volume);
    }
}