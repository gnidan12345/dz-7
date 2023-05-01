// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {





    public static void main(String[] args) {


        for (Planet p : Planet.values())
            System.out.printf("Distance from Sun to  %s is %2.2f%n",
                    p, p.getDistanceFromSun());

    }


}
