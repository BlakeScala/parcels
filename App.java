import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter the length of your package");
    String stringPackageL = console.readLine();
    int packageL = Integer.parseInt(stringPackageL);

    System.out.println("Enter the width of your package");
    String stringPackageW = console.readLine();
    int packageW = Integer.parseInt(stringPackageW);

    System.out.println("Enter the height of your package");
    String stringPackageH = console.readLine();
    int packageH = Integer.parseInt(stringPackageH);

    System.out.println("Enter the weight of your package");
    String stringPackageWeight = console.readLine();
    int packageWeight = Integer.parseInt(stringPackageWeight);

    Parcel userPackage = new Parcel(packageL, packageW, packageH, packageWeight);

    Integer totalCost = userPackage.costToShip();

    System.out.println("Your total cost is $" + totalCost);
  }
}
