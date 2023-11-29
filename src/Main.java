//import static java.lang.Math.abs;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
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
        System.out.println("--hw4--");

        // task 1
        System.out.println("\nTask 1 result:");
        int agePerson = 16;
        for (int i =  1; i <= 3; i++) {
            System.out.println("Возраст испытуемого составляет " + agePerson + " лет.");
            if (agePerson < 18) {
                System.out.println("Он несовершеннолетний. Пусть приходит в следующий раз.");
            } else {
                if (agePerson >= 18) {
                    System.out.println("Возраст совершеннолетия достигнут.");
                }
            }
            agePerson = agePerson + 2;
            System.out.println("---");
        }

        // task 2
        System.out.println("\nTask 2 result:");
        int someParameter = -15;
        for (int i =  1; i <= 4; i++) {
            if (i != 1) {
                System.out.println("---");
            }
            System.out.println("Температура на улице составляет " + someParameter + " \u00B0C,");
            if (someParameter < -5) {
                System.out.println("\tнельзя выходить без шапки.");
            } else {
                    System.out.println("можно выйти без шапки.");
            }
            someParameter = someParameter + 5;
        };

        // task 3
        System.out.println("\nTask 3 result:");
        int someParameterLimit = 60;
        someParameter = 56; // Повторное использование имён
        for (int i =  1; i <= 4; i++) {
            if (i != 1) {
                System.out.println("---");
            }
            System.out.println("Текущая скорость равна " + someParameter + " км/ч.");
            if (someParameter <= someParameterLimit) {
                System.out.println("Если скорость не будет превышать " + someParameterLimit +" км/ч, Вас ожидает");
                System.out.println("удачный день.");
            } else {
                System.out.println("Внимание! Скорость ТС превышает отраничение в " + someParameterLimit + " км/ч.");
                System.out.println("Если Вы не снизите скорость, вам могут выписать штраф!");
            }
            someParameter = someParameter + 2;
        };

        // task 4
        System.out.println("\nTask 4 result:");
        someParameter = 1; // Возраст
        for (int i = 1; i <= 7; i++) {
            if (i != 1) {
                System.out.println("---");
            }
            System.out.println("Возраст персоны, лет: " + someParameter + ".");
            if (someParameter >= 2 & someParameter <= 6) {
                System.out.println("Ей (персоне) нужно ходить в детский сад.");
            } else {
                if (someParameter >= 7 & someParameter <= 17) {
                    System.out.println("Человек должен ходить в школу.");
                } else {
                    if (someParameter >= 18 & someParameter <= 24) {
                        System.out.println("Человек должен ходить в университет.");
                    }
                }
            }
            // Интерактивный инкремент
            if (i == 1) {
                someParameter = someParameter + 1;
            } else {
                if (i >= 2 & i <=3) {
                    someParameter = someParameter + 4;
                } else {
                    someParameter = someParameter + 5;
                }
            }
        };

        // task 5
        System.out.println("\nTask 5 result:");
        someParameter = 2; // Возраст
        for (int i = 1; i <= 5; i++) {
            if (i != 1) {
                System.out.println("---");
            }
            System.out.println("Возраст ребёнка, лет: " + someParameter + ".");
            if (someParameter < 5) {
                System.out.println("Детям возраста до 5 лет " + " доступ в атракцион запрещён.");
            } else {
                if (someParameter >= 5 & someParameter < 14) {
                    System.out.println("Дети возраста от 5 до 13 лет могут кататься только в сопровождении");
                    System.out.println("взрослого.");
                } else {
                    if (someParameter >= 14) {
                        System.out.println("Дети, достигшие возраста 14 и более лет, могут кататься без");
                        System.out.println("сопровождения взрослого.");
                    }
                }
            }
            // Интерактивный инкремент
            if (i == 1) {
                someParameter = someParameter + 2;
            } else {
                if (i >= 2 & i <=3) {
                    someParameter = someParameter + 4;
                } else {
                    someParameter = someParameter + 5;
                }
            }
        };

        // task 6
        System.out.println("\nTask 6 result:");
        int capacityVagon = 102; // Вместимость вагона номинальная
        int sitPlacesCount = 60; // Кол-во сидячих мест

        int[] passengersCount = {59, 60, 90, 101, 102, 103, 120}; // Варианты заполненности вагона (кол-во пассажиров)

        for (int i = 0; i < passengersCount.length; i++) {
            if (i != 0) {
                System.out.println("---");
            }
            System.out.println("Кол-во пассажиров составляет: " + passengersCount[i] + ".");
            if (passengersCount[i] - sitPlacesCount <= -1) { // есть сидячее место, одно и более
                System.out.println("Есть сидячие места в кол-ве одного или более");
            } else {
                if ((passengersCount[i] - sitPlacesCount) < (capacityVagon - sitPlacesCount)) {
                    System.out.println("Есть стоячие места в кол-ве одного или более");
                } else {
                    System.out.println("Мест нет.");
                }
            }
        }

        // task 7
        System.out.println("\nTask 7 result:");
        // Кол-во подопытных чисел определяется тем, сколько вербальных названий чисел введено ниже:
        String[] verbalNumbers = {"One", "Two", "Three", "Four", "Five"};

        int numbersCount = verbalNumbers.length;
        int peakNumberIndex = 0;

        /*
        int numbersSet[] = new int[numbersCount];
        Random sourceNumbersRandom = new Random();

        // Заполнение ряда значений случайными челыми числами от 0 до 100
        for (int i = 0; i < numbersCount; i++) {
            numbersSet[i] = sourceNumbersRandom.nextInt(0, 100);
        }
        */

        // Задание массива чисел. Вручную, в теле программы. В закоменнтированном блоке выше
        // мне хотелось заполнить генератором случайных чисел. Но с ним у меня проблема.
        // Он работает, но есть проблема.
        int numbersSet[] = {7, 56, 41, 74, 50};

        // Поиск бОльшего числа
        // Полагаем, что бОльшее число лежит в нулевом элементе вектора
        for (int i = 1; i < numbersCount; i++) {
            System.out.println(" @" + numbersSet[i]);
            if (numbersSet[i] > numbersSet[peakNumberIndex]) {
                peakNumberIndex = i;
            }
        }

        // Вывод результата работы
        System.out.println("Заданные числа:");
        for (int i = 0; i < numbersCount; i++) {
            if (i != 0) {
                System.out.println("\t---");
            }
            System.out.print("\t" + verbalNumbers[i] + " = " + numbersSet[i]);
            if (i != numbersCount - 1) {
                System.out.print(";");
            } else {
                System.out.print(".");
            }
            if (i == peakNumberIndex) {
                System.out.print("\t <- Наибольшее здесь!");
            }
            System.out.println();
        }
    }
}

