package java8.data;

public class Account {

    private Person owner;
    private Integer balance;

    public Account(Person p, int b){
    	owner = p;
    	balance =b;
    }
    
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
