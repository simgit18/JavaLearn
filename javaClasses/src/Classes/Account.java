package Classes;

public class Account {
    private int account;
    private int balance;
    private String customer_name;
    private String email;
    private String mobile;

    public Account(){
        this("Default Name", 000, "Default Email", "Default Mobile Number");
        System.out.println("Empty Constructor called.");
    }
    public Account(String name, int balance, String email, String mobile){
        this.balance = balance;
        this.customer_name = name;
        this.email = email;
        this.mobile = mobile;

    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAccount() {
        return account;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println(depositAmount+" credited to acoount, new balance is "+this.balance);
    }
    public void withdrawal(double withdrawAmount){
        if (this.balance - withdrawAmount <0) {
            System.out.println("withdrawal not possible, balance is obly:" + this.balance);
        }
        else{
            this.balance-=withdrawAmount;
            System.out.println(withdrawAmount+" debited from the account, remaining balance is "+ this.balance);
        }
    }
}
