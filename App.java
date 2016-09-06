import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    float totalCost = 0;

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
      totalCost = userPackage.costToShip() + userPackage.costToWrap();
    } else {
      totalCost = userPackage.costToShip();
    }

    System.out.println("Do you have a Prime Membership?");
    String stringMembership = console.readLine();

    if(stringMembership.equals("yes")){
      totalCost -= 5;
      System.out.println("Your Prime Membership card gets you a $5.00 discount!");
    }

    System.out.println("Your shipping cost is $" + userPackage.costToShip());
    System.out.println("Your total cost is $" + totalCost);
  }
}
