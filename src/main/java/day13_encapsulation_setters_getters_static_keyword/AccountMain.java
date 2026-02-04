package day13_encapsulation_setters_getters_static_keyword;

public class AccountMain {
    public static void main(String[] args){
        Account account = new Account();
        account.setAccno(1234);
        account.setAmount(12.34);
        account.setName("sid");
        System.out.println(account.getAccno());
        System.out.println(account.getAmount());
        System.out.println(account.getName());
    }
}
