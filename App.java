import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    float totalCost = 0;
    boolean keepRunning = true;
    float orderTotalCost = 0;
    List<Parcel> packages = new ArrayList<Parcel>();

    while(keepRunning) {
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

      packages.add(userPackage);

      System.out.println("Would you like wrapping?");
      String stringWrappingAnswer = console.readLine().toLowerCase();


      if(stringWrappingAnswer.equals("yes") || stringWrappingAnswer.equals("yeah") || stringWrappingAnswer.equals("yep")) {
        System.out.println("Your wrapping cost is $" + userPackage.costToWrap());
      } else {
        totalCost = userPackage.costToShip();
      }

      System.out.println("Your shipping cost is $" + userPackage.costToShip());

      System.out.println("This package's total cost is $" + userPackage.totalCost());
      System.out.println("Would you like to send another package?");
      String stringNewPackage = console.readLine().toLowerCase();

      if(stringNewPackage.equals("yes") || stringNewPackage.equals("ya") || stringNewPackage.equals("yeah") || stringNewPackage.equals("yep")) {
        keepRunning = true;
      } else {
        keepRunning = false;
      }
    }

    for( Parcel eachOrder : packages) {
      orderTotalCost += eachOrder.mTotalCost;
    }

    System.out.println("Do you have a Prime Membership?");
    String stringMembership = console.readLine().toLowerCase();

    if(stringMembership.equals("yes") || stringMembership.equals("ya") || stringMembership.equals("yeah") || stringMembership.equals("yep")){
      System.out.println("Your Prime Membership card gets you a $5.00 discount!");
      orderTotalCost -= 5;
    }

    System.out.println("Your total shipping cost is $" + orderTotalCost);
  }
}
