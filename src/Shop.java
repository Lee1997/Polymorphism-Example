/**
 * Created by Lee on 20/11/2016.
 */
public class Shop {

    public double coffeePrice;
    public double teaPrice;
    public double milkPrice;

    public void buyCoffee(){
        main.money -= coffeePrice;
    }
    public void buyTea(){
        main.money -= teaPrice;
    }
    public void buyMilk(){
        main.money -= milkPrice;
    }
}
