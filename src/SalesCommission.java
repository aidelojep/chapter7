import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {

        int array[] = new int[9];

        int baseSalary = 200;

        double salesCommission = 0.09;

        Scanner input = new Scanner(System.in);

        System.out.println("Kindly input your weekly grossSales");
        double grossSales = 0.0;

        while (grossSales != -1) {
            System.out.println("Enter gross sales");

            grossSales = input.nextInt();

            if (grossSales == -1) {
                break;
            }

            int totalGrossSales = (int) (salesCommission * grossSales) + baseSalary;

            if (totalGrossSales >= 200 && totalGrossSales < 300)
                ++array[0];
            else if (totalGrossSales >= 300 && totalGrossSales <400)
                ++array[1];
            else if (totalGrossSales >= 400 && totalGrossSales < 500)
               ++array[2];
            else if (totalGrossSales >= 500 && totalGrossSales < 600)
               ++array[3];
            else if (totalGrossSales >= 600 && totalGrossSales < 700)
             ++array[4];
            else if (totalGrossSales >=700 && totalGrossSales < 800)
               ++array[5];
            else if (totalGrossSales >= 800 && totalGrossSales <900)
               ++array[6];
            else if (totalGrossSales >= 900 && totalGrossSales <1000)
               ++array[7];
            else if (totalGrossSales>=1000 && grossSales != -1)
               ++array[8];
            else
                System.out.println("Bros you need to meet your target ooo!!");

        }

        for (int count: array
             ) {
            System.out.println(count);
        }
    }

}