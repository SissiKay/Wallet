public class Main {

    public static void main(String[] args) {

       Bank bank = new Bank() ;

       Person[] p= bank.getPeople();

       for (int i=0; i<p.length; i++){

           Person person= p[i];
           Wallet w= person.getWallet();
           int m = w.getMoney();

           System.out.println("Person has :"+ m );
       }



    }
}
