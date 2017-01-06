/**
 * Created by syrinekrim on 2017-01-05.
 */
import java.util.Random;

public class Person {
    private String fname ;
    private String lname ;
    private Wallet wallet;

    public Person(){
        wallet= new Wallet();
        //when a person object is called it will automatically have a wallet because of thos sentence (a wallet whose money=0)

        Random rand = new Random ();


        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((10000) + 1) + 0;

        wallet.setMoney(randomNum);

    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Wallet getWallet() {
        return wallet;
    }
}


