import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter the length of your package in inches");
    String stringPackageL = console.readLine();
    float packageL = Float.parseFloat(stringPackageL);

    System.out.println("Enter the width of your package in inches");
    String stringPackageW = console.readLine();
    float packageW = Float.parseFloat(stringPackageW);

    System.out.println("Enter the height of your package in inches");
    String stringPackageH = console.readLine();
    float packageH = Float.parseFloat(stringPackageH);

    System.out.println("Enter the weight of your package in lbs");
    String stringPackageWeight = console.readLine();
    float packageWeight = Float.parseFloat(stringPackageWeight);

    Parcel userPackage = new Parcel(packageL, packageW, packageH, packageWeight);

    System.out.println("Would you like wrapping?");
    String stringWrappingAnswer = console.readLine();

    if(stringWrappingAnswer.equals("yes")) {
      System.out.println("Your wrapping cost is $" + userPackage.costToWrap());
      System.out.println("Your shipping cost is $" + userPackage.costToShip());
      float totalCost = userPackage.costToShip() + userPackage.costToWrap();
      System.out.println("Your total cost is $" + totalCost);
    } else {
      System.out.println("Your total cost is $" + userPackage.costToShip());
    }
  }
}
