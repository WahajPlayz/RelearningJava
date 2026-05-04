import java.awt.*;

public class DataTypes {
    public static void main(String[] args) {
        /* DATA TYPES & VARIABLES */

        // Hello I am a comment
        /*
         * And I am a multiline Comment!
         * I can come in quite handy for explaining stuff!
         */

        /* Variables */

        // datatype name_of_variable; // Declaration
        // OR
        // datatype name_of_variable = value_of_variable; // Initialization (Declaration + Assignment of Value)

        /* DATA TYPES */

        // Integers (Store whole numbers (including negative ones))
        // Go from -2147483648 to 2147483647
        int points;
        points = 100;
        int x = -69;

        System.out.println("How many points you have got is: " + points);


        // Floating Point Numbers (float & double)
        float pi = 3.14159265f;
        double e = 2.718281828;

        float accountValue = 20.20f; // NEVER DO THIS!

        // For real numbers, however! Precision can be an issue!
        // Scientific notation: 314159265 * 10^-8


        // Booleans (True or False)
        boolean HasMiraculous = true;
        boolean HasGrownUp = false;

        System.out.println("Do you have a Miraculous: " + HasMiraculous);
        System.out.println("Is GrownUp: " + HasGrownUp);

        // Chars & Strings
        char grade = 'A';
        String name = "WahajPlayz";

        System.out.println(name + "Has a Grade: Unknown Will get updated soon.....");

    }
}
