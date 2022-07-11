import Classes.Account;
import Classes.Animals;
import Classes.Car;
import Classes.Dog;

public class Main {
    public static void main(String[] args) {
        Car buggati = new Car();

        Account shivamsAccount = new Account("shivam",200,"abc@gmail.com","123456889");
        Account defaultAccount = new Account();


        shivamsAccount.setBalance(100);

        shivamsAccount.deposit(200);
        shivamsAccount.withdrawal(50);

        System.out.println(shivamsAccount.getCustomer_name());
        System.out.println(defaultAccount.getCustomer_name());

        Animals animal = new Animals("Dinky",1, 1, 1,1,10);
        Dog germanSHephard = new Dog("Pooch",4,1,3,5,20,2,1,20,"Silky");

        germanSHephard.eat();

    }

}
