import javax.swing.plaf.synth.SynthOptionPaneUI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("--hw5--");

        // task 1
        System.out.println("\nTask 1 result:");

        boolean clientOS = false;
        int quit = 2;

        while (quit > 0) {
            System.out.print("Please, go download and setup our app for ");
            if (clientOS) System.out.print("iOS");
            else System.out.print("Android");
            System.out.println(" at <link>.\n");

            clientOS = !clientOS;
            quit--;
        }

        // task 2
        System.out.println("\nTask 2 result:");

        clientOS = false;
        int clientDeviceYear = 2013;
        int clientModernSupportYear = 2015;
        quit = 6;

        while (quit > 0) {
            if (quit % 2 == 0) { // Проверкана на чётность
                clientDeviceYear++;
                System.out.println("Client's device was produced in " + clientDeviceYear + " year.\n");
            }
            System.out.print("Please, go download and setup our ");

            if (clientDeviceYear < clientModernSupportYear) System.out.println("LITE version of app");
            else System.out.print("MODERN version of app ");

            System.out.print("for ");
            if (clientOS) System.out.print("iOS");
            else System.out.print("Android");
            System.out.println(" at <link>.\n");

            clientOS = !clientOS;
            quit--;
        }

        // task 3
        System.out.println("\nTask 3 result:");
        int yearOfLeapInitiated = 1584;
        int[] yearsSet = {1582, 1584, 1981, 2020, 2021, 2024};
        for (int i = 0; i < yearsSet.length; i++) {
            if (yearsSet[i] > 1584) {
                if (((yearsSet[i] % 400 == 0) || (yearsSet[i] % 4 == 0)) && (yearsSet[i] % 100 != 0)) {
                    System.out.println("\tГод (" + yearsSet[i] + ") високосный.");
                } else System.out.println("\tГод (" + yearsSet[i] + ") не високосный.");
            } else {
                System.out.println("\tГод (" + yearsSet[i] + ") не является високосным, так как последние были введены");
                System.out.println("лишь после " + yearOfLeapInitiated + " года.");
            }
        }

        // task 4
        System.out.println("\nTask 4 result:");

        int[] delDist = {15, 20, 95, 200};
        int[] delDistTreshold = {0, 20, 60, 100};
        int delDays = 0;
        int i = delDist.length;
        int k = 0;
        while (i > 0) {
            int i1 = delDistTreshold.length - 1;
            int k1 = 0;
            do {
                if (delDist[k] >= delDistTreshold[k1] && delDist[k] < delDistTreshold[k1 + 1]) {
                    delDays = k1 + 1;
                    i1 = -2;
                    break;
                } else if (i1 == 1 && delDist[k] > delDistTreshold[k1 + 1]) {
                    i1 = -1;
                    break;
                }

                i1--; k1++;
            } while (i1 > 0);

            System.out.println("\tРасстояние до места доставки \u2013 " + delDist[k] + " км.");
            switch (i1) {
                case -2:
                    System.out.println("\tВремя доставки составит, сут.: " + delDays + ".\n");
                    break;
                case -1:
                    System.out.println("\tДоставка не осуществляется для расстояний, превышающие ");
                    System.out.println(delDistTreshold[k1 + 1] + " км.");
                    break;
            }

            i--; k++;
        }

        // task 5
        System.out.println("\nTask 5 result:");
        String[] monthsTitle = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String[] seasonesTitle = {"Зима", "Весна", "Лето", "Осень"};
        byte[] relation = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 0};
        int monthNumber = 1;
        byte seasone = 0;
        do {
            if (monthNumber > 0 && monthNumber < 13) {
                seasone = relation[monthNumber - 1];
                System.out.print("\tНомер месяца \u2013 " + monthNumber + ", это " + monthsTitle[monthNumber - 1]
                    + " (");
                switch (seasone) {
                    case 0:
                        System.out.print(seasonesTitle[seasone]);
                        break;
                    case 1:
                        System.out.print(seasonesTitle[seasone]);
                        break;
                    case 2:
                        System.out.print(seasonesTitle[seasone]);
                        break;
                    default:
                        System.out.print(seasonesTitle[seasone]);
                        break;
                }
                System.out.println(").");
            } else {
                System.out.println("Номера месяца " + monthNumber + " не существует.");
            }
            monthNumber++;
        } while (monthNumber < 14);
    }
}