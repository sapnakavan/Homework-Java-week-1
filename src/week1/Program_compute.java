package week1;


//Write a Java program to compute the specified expressions and print the
        //output.
        //Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
public class Program_compute { //Class Program_compute
    public static void main(String []args){//Main method

        double a = 25.5;// declare int is datatype and a is variable name which store value 25.5
        double b = 3.5;// declare int is datatype and b is variable name which store value 3.5
        double c = 40.5;// declare int is datatype and c is variable name which store value 40.5
        double d =4.5;// declare int is datatype and d is variable name which store value 4.5
        double e =(a*b-b*b)/(c-d); // declare int is datatype and e is variable name which store value of (a,b,c,d)

        System.out.println("Expected output: "  +e);//Printing statement

    }
}
