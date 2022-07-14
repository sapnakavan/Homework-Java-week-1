package week1;
//Make your 12th marksheets on your own.

public class Marksheet_12th {//Class Marksheet_12th
    public static void main(String [] args){//Main method

        /*Variable Declaration part*/
        String name = "Sapna Patel";
        int m1      =75;
        int m2      =25;
        int m3      =80;
        int m4      =85;
        int b       =12;
        int t       =(+(m1)+(m2+2)+(m3+2)+(m4));
        int t1      =100;
        int t3      =(t1*6);
        int t4      =300;

          /*Display and Processing part*/
        System.out.println("----------------------------------------------------------");
        System.out.println("           Central Board of  Higher Secondary  Education  " );
        System.out.println("----------------------------------------------------------");
        System.out.println("Student Name: " +name);
        System.out.println("Roll No:      " +b);
        System.out.println("----------------------------------------------------------");


        System.out.println("Subject           Total Marks         Obtained Marks   ");
        System.out.println("English               "+t1+"                   "+(m2));
        System.out.println("computer Science      "+t1+"                   "+(m4));
        System.out.println("Accountancy           "+t1+"                   "+(m1));
        System.out.println("Economics             "+t1+"                   "+(m3));
        System.out.println("Hindi                 "+t1+"                   "+(m2));
        System.out.println("Computer practical    "+t1+"                   "+(m3));
        System.out.println("----------------------------------------------------------");
        System.out.println("Total :              "+t3+"                     "+t ) ;
        System.out.println("----------------------------------------------------------");

        if (t>t4);{
            System.out.println("Result :  PASS");

        }

    }
}
