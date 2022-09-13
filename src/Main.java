public class Main {
    public static void main(String[] args) {


        Account a1 = new Account(1700);

        System.out.println(a1.withdraw(90));
        System.out.println(a1.deposit(300));

        Account a2 = new Account(9090909,"Johnny Doe");
        System.out.println(a2.toString());

        a2.setName("Gerlinde Schönfelder");
        System.out.println(a2.toString());



}

}