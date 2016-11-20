import java.util.Scanner;

/**
 * Created by Lee on 20/11/2016.
 */
public class main{
    public static double money;

    public static void main(String[] args) {

        //CREATE SHOPS(COFFEE PRICE, TEA PRICE, MILK PRICE)
        Shop shops[] = new Shop[3];
        shops[0] = new Centra(2.00, 1.00, 1.50);
        shops[1] = new Londis(2.50, 1.25, 1.25);
        shops[2] = new Supervalu(1.75, 0.9, 1.40);

        //Now you can use methods from Shop without writing the methods in each class and you money will decrease by the price of the item. Examples:
        money = 10.0;

        System.out.println(money);
        shops[0].buyTea();

        System.out.println(money);
        shops[2].buyMilk();

        System.out.println(money);
        shops[1].buyCoffee();

        System.out.println(money);
    }
}
