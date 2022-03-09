import java.util.Scanner;


public class tempConverter {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the temperature in Fahrenheit. When done enter -1 ");
            double fahr = input.nextDouble();
            while (fahr != -1) {
                  double celsius = (fahr - 32) * 5 / 9;
                  System.out.println(fahr + " degrees Fahrenheit is " + Math.round(celsius * 100.0) / 100.0 + " degrees Celsius");
                  fahr = input.nextInt();
            } 
            input.close();
      }
}

