package day13_encapsulation_setters_getters_static_keyword;

public class Account {
    private int accno;
    private String name;
    private double amount;

    public void setAccno(int accno){
        this.accno = accno;
    }

    public int getAccno(){
        return accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
