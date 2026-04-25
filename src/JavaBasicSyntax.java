public class JavaBasicSyntax {
    public static void main(String[] args) {
        /* JAVA SYNTAX BASICS */

        /* Variables */

        // datatype name_of_variable; //Declaration
        // OR
        // datatype name_of_variable = value_of_variable; // Initialization ( Declaration + Assignment of Value )

        int points;     // Declaration
        points = 100;   // Assignment
        int x = -69;    // Initialization ( Declaration + Assignment of Value )

        int health;
        health = 200;
        int damage = 100;

        int heathNow;
        heathNow = health - damage;

        System.out.println("Your Health was at " + health);
        System.out.println("Your Health after you damage is now at " + heathNow);

        // Every Instruction/Line ends with a semicolon ;
        // int y = 42



    }
}
