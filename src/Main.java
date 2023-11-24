import static java.lang.Math.abs;

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
        System.out.println("--hw2--");
        // task 1
        var dog = 8.0; var cat = 3.6;
        var paper = 763789;
        System.out.println("");
        System.out.println("Task 1 result:");
        System.out.println("Variables are printing out here:");
        System.out.println("    var dog is " + dog + ";");
        System.out.println("    var cat is " + cat + ";");
        System.out.println("    finally, var paper is " + paper + ".");

        // task 2
        var inc = 4;
        dog = dog + inc;
        cat = cat + inc;
        paper = paper + inc;

        System.out.println("");
        System.out.println("Task 2 result:");
        System.out.println("Variables is changed, added " + inc + ", and printing out here:");
        System.out.println("    var dog is " + dog + ";");
        System.out.println("    var cat is " + cat + ";");
        System.out.println("    finally, var paper is " + paper + ".");

        // task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("");
        System.out.println("Task 3 result:");
        System.out.println("Variables is changed again, custom decrement, and printing out here:");
        System.out.println("    var dog is " + dog + ";");
        System.out.println("    var cat is " + cat + ";");
        System.out.println("    finally, var paper is " + paper + ".");

        // task 4
        var friend = 19;
        var ff = friend + 2;
        System.out.println("");
        System.out.println("Task 4 result:");
        System.out.println("    var friend is " + friend + ";");
        System.out.println(ff + ";");
        System.out.println(ff / 7 + ".");

        // task 5
        var frog = 3.5;
        System.out.println("");
        System.out.println("Task 5 result:");
        System.out.println("    var frog is " + frog + ";");
        var tt = frog * 10;
        System.out.println(tt + ";");
        tt = tt / 3.5;
        System.out.println(tt + ";");
        System.out.println(tt + 4 + ".");

        // task 6
        var f_1 = 78.2;
        var f_2 = 82.7;
        var f_sumWeight = f_1 + f_2;
        var f_diffWeight = abs(f_1 - f_2);
        System.out.println("");
        System.out.println("Task 6 result:");
        System.out.println("summary weight: " + f_sumWeight + " Kg;");
        System.out.println("weight difference: " + f_diffWeight + " Kg.");

        // task 7
        System.out.println("");
        System.out.println("Task 7 result:");
        double n_diffWeight = 0;
        double o_diffWeight = 0;

        if (f_1 >= f_2) {
            n_diffWeight = f_1 - f_2;
            o_diffWeight = f_1 % f_2;
        } else
            {
            n_diffWeight = f_2 - f_1;
            o_diffWeight = f_2 % f_1;
        }
        System.out.println("difference: " + n_diffWeight + " Kg;");
        System.out.println("difference %: " + o_diffWeight + " Kg;");

        // task 8
        System.out.println("");
        System.out.println("Task 8 result:");
        int hours_ = 640;
        int workday = 8;
        int staff = 0;
        staff = hours_ / workday;
        System.out.println("The Company has : " + staff + " workers.");

        int hours_new = 0;
        int staff_new = 0;
        staff_new = staff + 94;
        hours_new = staff_new * 8;
        System.out.print("Если в компании работает : " + staff_new + " человек, то всего ");
        System.out.println(hours_new + " часов работы может быть поделено между сотрудниками.");




    }
}