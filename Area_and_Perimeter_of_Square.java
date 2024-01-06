import java.util.*;
public class AreaPerimeterOfSquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area,perimeter;
        area = s*s;
        perimeter = 4*s; 
        System.out.printf("%d %d",area,perimeter);
    }
}