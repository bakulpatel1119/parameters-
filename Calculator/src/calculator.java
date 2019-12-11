public class calculator {

    // No return type - with parameters

public static void calc (int a, int b) {

    // This code will print addition of int a & int b

    System.out.print("Addition of " + a + " and " + b + " is = ");
    System.out.println(a + b);

    // This code will print substraction of int a & int b

    System.out.print("Substraction of " + a + " - " + b + " is = ");
    System.out.println(a - b);

    // This code will print Multiplication of int a & int b

    System.out.print("Multiplication of " + a + " and " + b + " is = ");
    System.out.println(a * b);

    // This code will print division of int a & int b

    System.out.print("Division of " + a + " / " + b + " is = ");
    System.out.println(a / b);
}

// Main method

    public static void main(String [] args) {

        // variables declared  inside the method

        calc(50, 10);  // static method can come direct in static main area method

    }


}
// END OF PROGRAMME