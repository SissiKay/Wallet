/**
 * Created by syrinekrim on 2017-01-05.
 */
public class Wallet {

    private int money;

    public Wallet(){
        money=0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int value){
     money += value ;
    }
}
