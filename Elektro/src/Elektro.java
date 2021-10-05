import java.util.Scanner;

public class Elektro {

    public static void main(String[] args) {

        // DECLARATION
        int totalPeriod;
        int unitePrice;
        int totalHours;
        int usageInWatts;

        // PRINT->Welcome message
        System.out.println("Welcome to Electro bill calculator...");
        System.out.println("---------------------------------");

        // CREATE SCANNER
        Scanner scanner = new Scanner(System.in);

        //PRINT
        System.out.println("Do you want to make a calculation for more than one house (y/n)");
        //INPUT

        char c = scanner.nextLine().charAt(0);


        //IF(how many bills calculate)
        if (c == 'y') {
            System.out.print("How many houses wil you calculate? ");
            //INPUT->House_Numbers
            int numbersHouses = scanner.nextInt();
            
            //FOR(Calculate all of the bills)
            for (int index = 0; index < numbersHouses; index++) {
                //INPUT
                int totalInkWatts = 0;
                int consumedInUnits = 0;
                int totalCost = 0;
                String consumerName = scanner.nextLine();

                //WHILE
                while (true) {
                    //PRINT
                    System.out.println("Please enter a consumer name ");
                    consumerName = scanner.nextLine();
                     /*If you write nothing, you get a message.And you must write a consumer.
                This is important because if we don't the name,we can't calculate a bill.*/

                    //IF
                    if (consumerName.isEmpty()) {
                        System.out.println("You must write a consumer name: ");
                        System.out.println("Please enter a consumer name ");
                        consumerName = scanner.nextLine();
                        break;
                    }
                    //ELSE
                    else {
                        System.out.println("Consumer name is: " + consumerName);
                        break;
                    }
                }
                //PRINT
                System.out.printf("Please enter how many watt per hour used by the consumer: ");
                //INPUT->watts
                usageInWatts = scanner.nextInt();
                //PRINT
                System.out.printf("How many hours per day: ");
                //INPUT->hours
                totalHours = scanner.nextInt();
                //PRINT
                System.out.printf("How many days per month: ");
                //INPUT->days
                totalPeriod = scanner.nextInt();
                //CALCULATE->total kWatts
                totalInkWatts = usageInWatts * totalHours * totalPeriod;
                //PRINT->total kWatts
                System.out.println("The total usage for the consumer for period of 30 days is: " + totalInkWatts + " " + "kWh");

                //CALCULATE->consumed in units
                consumedInUnits = (usageInWatts * totalHours * totalPeriod) / 1000;
                //PRINT->consumed in units
                System.out.println("The total usage in units is: " + usageInWatts + " watts " + " * " + totalHours + " hours " + " * " + totalPeriod + " days " + "/" + " 1000 " + " = " + consumedInUnits + " Units");

                //PRINT
                System.out.println("To know the total cost enter the units price?");
                //INPUT(unit price)
                unitePrice = scanner.nextInt();
                //CALCULATE->total cost
                totalCost = unitePrice * consumedInUnits;
                //PRINT->total cost
                System.out.println("The total cost for the electricity bill for one month is : " + "€" + totalCost);
            }
        }
        //ELSE IF(Calculate a bill for only one consumer°
        else if (c == 'n') {
            int totalInkWatts = 0;
            int consumedInUnits = 0;
            int totalCost = 0;
            //PRINT
            System.out.println("Please enter a consumer name ");
            //INPUT(consumer name)
            String consumerName = scanner.nextLine();
            System.out.printf("Please enter how many watt per hour used by the consumer: ");
            //INPUT->watts
            usageInWatts = scanner.nextInt();
            //PRINT
            System.out.printf("How many hours per day: ");
            //INPUT->hours
            totalHours = scanner.nextInt();
            //PRINT
            System.out.printf("How many days per month: ");
            //INPUT->days
            totalPeriod = scanner.nextInt();
            //CALCULATE->total kWatts
            totalInkWatts = usageInWatts * totalHours * totalPeriod;
            //PRINT->total kWatts
            System.out.println("The total usage for the consumer for period of 30 days is: " + totalInkWatts + " " + "kWh");

            //CALCULATE->consumed in units
            consumedInUnits = (usageInWatts * totalHours * totalPeriod) / 1000;
            //PRINT->consumed in units
            System.out.println("The total usage in units is: " + usageInWatts + " watts " + " * " + totalHours + " hours " + " * " + totalPeriod + " days " + "/" + " 1000 " + " = " + consumedInUnits + " Units");

            //PRINT
            System.out.println("To know the total cost enter the units price?");
            //INPUT(unit price)
            unitePrice = scanner.nextInt();
            //CALCULATE->total cost
            totalCost = unitePrice * consumedInUnits;
            //PRINT->total cost
            System.out.println("The total cost for the electricity bill for one month is : " + "€" + totalCost);
        }
        //ELSE
        else {
            //PRINT->not valid
            System.out.println("You have NOT chosen a valid option");
        }
        //PRINT
        System.out.println("Thank you for using our program");

    }
}