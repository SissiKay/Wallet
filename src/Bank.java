/**
 * Created by syrinekrim on 2017-01-05.
 */
public class Bank {

    private int money = 1000000 ;
    private Person [] people = new Person [100];


    public Bank(){
        for(int i=0; i<people.length;i++){//travers the array
            //put people in the array
            people[i]= new Person();
        }
        //HELPER METHOD: another method that takes care of some bit of logic in order to make it easier to read, not to bloat methods
    }

    private void giveMoney(){
        for (int i=0 ; i<this.people.length; i++){

            Wallet w = people[i].getWallet();

            if(w.getMoney()  > 5000){
                w.addMoney(100);
            }
        }

    }
    public Person[] getPeople() {
        return people;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }



}
