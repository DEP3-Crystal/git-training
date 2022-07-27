import java.util.ArrayList;
import java.util.Scanner;
import java.util.prefs.PreferenceChangeEvent;

//        Vending machine has following coins: 1c, 5c, 10c, 25c, 50c, 1$.
////                Your task is to write a program that will be used in a vending machine to return change.
//                Assume vending machine will always want to return the least number of coins.
//        Devise a function getChange(M, P) where M is how much money was inserted into the machine and
//        P the price of the item selected that returns an array of the integer representing the
//        number of denominations to return.
//
//        Example:
//        getChange(5, 0.99) should return [1,0,0,0,0,4]
//
//        4.01
//        0.01 -> 0.1
public class exercise1 {
    static ArrayList<Integer> getChange(double M, double P) {
        int c1, c5, c10, c50, d1, c25;
        int rd1, rc5, rc10, rc25, rc50;
        double change = M - P;
        d1 = (int) (change / 1); //d1=1
        int rchange = (int) (change*100);
        rd1 = (int) (rchange % 100);//rd1=0.7
        c50 = (int) (rd1 / 50);
        rc50 = rd1 % 50;
        c25 = (int) (rc50 / 25);
        rc25 = rc50 % 25;
        c10 = (int) (rc25 / 10);
        rc10 = rc25 % 10;
        c5 = (int) (rc10 / 5);
        rc5 = rc10 % 5;
        c1 = (int) (rc5 / 1);
        ArrayList<Integer> rest = new ArrayList<>(6);
        rest.add(0, c1);
        rest.add(1, c5);
        rest.add(2, c10);
        rest.add(3, c25);
        rest.add(4, c50);
        rest.add(5, d1);
        return rest;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter  amount of money that you will put inside :  ");
        double  amount = in.nextDouble();
        System.out.println("enter   the price of the product you want to buy : ");

        double  price = in.nextDouble();

        System.out.println(getChange(amount, price));
    }
}