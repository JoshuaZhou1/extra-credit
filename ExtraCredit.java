import java.util.*;
public class ExtraCredit {
    public static void main(String args[]){
        int tc = 0;
        int arr[] = {1,2,3};
        Scanner in = new Scanner(System.in);
        for(int elem : arr)
        {
            System.out.println("round "+ elem + " out of 3");
            //start coding in the box
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            int a = 1;
            int b = 2;
            int c = 3;
            int PRODUCT = a*b*c;
            System.out.println("The product of the 3 numbers is: " + PRODUCT);
            System.out.println("The sum of the 3 numbers is: "+ (a+b+c));
            System.out.println("Guess the 3 numbers.");
            System.out.print("Enter the first number: ");
            int d = in.nextInt();
            System.out.print("Enter the second number: ");
            int f = in.nextInt();
            System.out.print("Enter the third number: ");
            int g = in.nextInt();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(ExtraCredit.check(a, b, c, d, f, g)){ // fill the check() with the correct varibles
            // DO NOT TOUCH ANYTHING BELOW THIS
                tc++; 
            }
        } 
        ExtraCredit.ending(tc);
        in.close();
    }
     //my functions (I will not fix them if you play with them) 
     public static boolean check(int a , int b, int c, int x , int y , int z){
        int p = a * b * c, s = a + b + c;
        if((p == x * y * z) && (s == x + y + z)){
            System.out.println("congrats on solving it");
            return true;
        }
        else{
            System.out.printf("the correct numbers were %d, %d, %d \n", a , b, c);
            System.out.println("you'll get it next time!");
            return false;
        }
    }
    public static void ending(int cc){
        System.out.println("you got " + cc + " / 3 correct");
        switch (cc){
            case 0:
            System.out.println("try harder next time");
            break;
            case 1:
            System.out.println("nice try");
            break;
            case 2:
            System.out.println("great job");
            break;
            case 3:
            System.out.println("perfect");
            break;
        }
    }
}
