import java.util.Scanner;

public class HeronVerfahren {

    static Scanner scan;
    static int accuracy;
    static int base;

    public static void main(String[] args) {

        //init scan
        scan = new Scanner(System.in);

        //A Welcome Message. Sweet.
        System.out.println("This Program should (and hopefully will) get the Square Root of a natural number.");
        System.out.println("What about some input? Pls choose just natural numbers.");

        //getAccuracy
        System.out.println("Enter the accuracy of the square Root (1000 should be enough for the most cases) :");
        accuracy=scan.nextInt();

        //getBasis
        System.out.println("Enter the base of the square Root:");
        base=scan.nextInt();

        //print squareRoot to the console
        System.out.println("The square root of "+base+" is "+getSquareRoot(accuracy, base)+".");
        System.out.println("But it can only be as exactly as a double. So use this code and implement "
                         +"it with BigDecimal or something, if you want more exactly numbers. "
                         +"It is licenced under the GNU GPL v2.0 license. Cheers.");

    }

    private static double getSquareRoot(int accuracy, int base){

        //init squareRoot with a positive number. The number must be a multiple of 1 (or one :)
        double squareRoot = 1;

        //the place, where the magic happens....
        for (int i=0; i < accuracy; ++i){
            //You ask for the reason? Read this (german) : http://www.physik-im-unterricht.de/M9-Heron-Verfahren.pdf
            squareRoot=(squareRoot+base/squareRoot)/2;
        }

        //returns the squareRoot. Ok that was really useless.
        return squareRoot;

    }

}
