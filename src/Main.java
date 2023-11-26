//import static java.lang.Math.abs;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*System.out.println("Hello world and good luck to you!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);*/
        System.out.println("--hw3--");

        // task 1
        System.out.println("\nTask 1 result:");

        byte    aV = 127;
        short   bV = 32767;
        int     cV = 2147483647;
        long    dV = 9223372036854775807L;
        float   eV = 3.4E+38f;
        double  fV = 1.7E+308;

        System.out.println("Value of aV:byte is " + aV + ";");
        System.out.println("  ... of bV:short is " + bV + ";");
        System.out.println("  ... of cV:int is " + cV + ";");
        System.out.println("  ... of dV:long is " + dV + ";");
        System.out.println("  ... of eV:float is " + eV + ";");
        System.out.println("and finally, value of fV:double is " + fV + ".\n");

        // task 2
        System.out.println("\nTask 2 result:");
        float weightCoin = 27.12f;
        long starsGalactic = 987678965549L;
        double pencilWeight = 2.786;
        int staffCount = 569;
        int lakeDepth = -159;
        short brickBuildingCount = 27897;
        byte dogsCount = 67;
        System.out.println("(defined variables)\n");

        // task 3
        System.out.println("\nTask 3 result:");
        byte ludPavl_count = 23;
        byte annSerg_count = 27;
        byte kateAndr_count = 30;
        int purchasedSheets_amount = 480;
        int byChildrenInHands = purchasedSheets_amount / (ludPavl_count + annSerg_count + kateAndr_count);
        System.out.println("Every children will received by " + byChildrenInHands + " sheets.\n");

        // task 4
        System.out.println("\nTask 4 result:");
        byte machinePerf = 16; // per 2 min.
        int inDAYminuteCount = 24 * 60;
        int machinePerfByMinute = machinePerf / 2;
        int inTwentlyMinPerf = 20 * machinePerfByMinute;
        int inDAYperf = inDAYminuteCount * machinePerfByMinute;
        int inThreeDaysPerf = inDAYminuteCount * 3 * machinePerfByMinute;
        int inMonthPerf = 31 * inDAYminuteCount * machinePerfByMinute;
        System.out.println("За 20 минут машина произвела " + inTwentlyMinPerf  + " штук бутылок;");
        System.out.println(".. сутки машина произвела " + inDAYperf + " штук бутылок;");
        System.out.println(".. три дня (трое суток) машина произвела " + inThreeDaysPerf  + " штук бутылок;");
        System.out.println(".. месяц машина произвела " + inMonthPerf + " штук бутылок.\n");

        // task 5
        System.out.println("\nTask 5 result:");
        byte paintBuckets = 120;
        byte perRoomWhitePaint = 2;
        byte perRoomBrownPaint = 4;
        int roomCount = paintBuckets / (perRoomWhitePaint + perRoomBrownPaint);
        int purchasedWhite = roomCount * perRoomWhitePaint;
        int purchasedBrown = roomCount * perRoomBrownPaint;
        System.out.println("В школе, где " + roomCount + " классов, нужно " + purchasedWhite + " банок белой кураски,");
        System.out.println("и " + purchasedBrown + " банок коричневой краски.\n");

        // task 6
        System.out.println("\nTask 6 result:");
        int bananasCount = 5;
        int bananaWeight = 80;
        int milkVolume = 200; //ml
        int milkOneHundredMilitersWeight = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggsCount = 4;
        int eggWeight = 70;
        int totalWeight = (bananasCount * bananaWeight) + (2 * milkOneHundredMilitersWeight) +
                (iceCreamCount * iceCreamWeight) + (eggsCount * eggWeight);
        float totalWeightKg = totalWeight / 1000f;

//       System.out.println("Total weight is " + totalWeight + " g.\n");
        System.out.println("Total weight is " + totalWeightKg + " (Kg).\n");

        // task 7
        System.out.println("\nTask 7 result:");
        int liteWeight = 7;
        int liteWeightGram = liteWeight * 1000;
        float daysLiteBy250gr = liteWeightGram / 250f;
        float daysLiteBy500gr = liteWeightGram / 500f;

        System.out.println("Спортсмен похудеет на 7 кг. по 250 гр. в день за " + daysLiteBy250gr + " дней,");
        System.out.println("\t либо за " + daysLiteBy500gr + " дней, если будет худеть по 500 гр. в день.\n");

        // task 8
        System.out.println("\nTask 8 result:");
        int maryIncoming = 67760;
        int denisIncoming = 83690;
        int kristineIncoming = 76230;

        int maryIncomingIndex = maryIncoming + (maryIncoming / 10);
        int maryIncomingIndexByYear = (maryIncomingIndex - maryIncoming) * 12;
        int denisIncomingIndex = denisIncoming + (denisIncoming / 10);
        int denisIncomingIndexByYear = (denisIncomingIndex - denisIncoming) * 12;
        int kristineIncomingIndex = kristineIncoming + (kristineIncoming / 10);
        int kristineIncomingIndexByYear = (kristineIncomingIndex - kristineIncoming) * 12;

        System.out.println("Маша теперь полуяает " + maryIncomingIndex + " рублей,");
        System.out.println("\tгодовой доход вырос на " + maryIncomingIndexByYear + " рублей;");
        System.out.println("Денис теперь полуяает " + denisIncomingIndex + " рублей,");
        System.out.println("\tгодовой доход вырос на " + denisIncomingIndexByYear + " рублей;");
        System.out.println("Кристина теперь полуяает " + kristineIncomingIndex + " рублей,");
        System.out.println("\tгодовой доход вырос на " + kristineIncomingIndexByYear + " рублей.");

    }
}

