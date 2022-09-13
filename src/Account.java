public class Account {

    //ha en balance där kontots saldo sparas
    double balance;
    //en instansvariabel name av typen String
    String name;


    //Två konstruktörer.  en som sätter balance till 0

    public Account() {
        this.balance = balance;
    }
    //och en som tar in en balance.

    public Account(double balance) {
        this.balance = balance;
    }
    //ha en balance där kontots saldo sparas en metod withdraw som minskar saldot
    public double withdraw(double i) { this.balance = this.balance - i;


        return  this.balance;
    }
//en metod deposit som ökar saldot
    public double deposit(double i) { this.balance = this.balance + i;


        return  this.balance;
    }
//en ny konstruktor som sätter både name och balance
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "This account belongs to: "+name+" and has a balance of " +balance;
    }
}
/* Skapa en Account klass som representerar ett bankkonto.Account klassen ska
två metoder getName och setName som läser respektive skriver till name
en metod toString som returnerar en sträng innehållandes en mening med name och balance på lämplig form.
Ändra i ditt program så att du testar de nya metoderna. För att testa toString räcker det att du anropar
System.out.println(savingsAccount);
 */

