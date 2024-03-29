package org.learning.javaBank;
//imports
import java.math.BigDecimal;
import java.util.Random;

public class BankAccount {

    //attributi
    private String bankCode;
    private String name;
    private BigDecimal balance;

    //costruttori
    public BankAccount(String name) {
        //definisco il generatore di n random
        Random randomGenerator = new Random();
        //dichiaro e inizializzo i valori integer
        int tempBankCode = randomGenerator.nextInt(99999999);
        int tempBalance = randomGenerator.nextInt(1000);
        //assegno gli attributi
        bankCode = String.format("%08d",tempBankCode);
        this.name = name;
        balance = BigDecimal.valueOf(tempBalance);
    }

    //getter
    public String getBankCode() {
        return bankCode;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    //altri metodi
    public void deposit (BigDecimal depositBalance){
        //aggiungo il deposito al saldo
        balance = balance.add(depositBalance);
        //stampo il successo
        System.out.println("Operation was successful");
        return;
    }
    public boolean withdrawal(BigDecimal withdrawalBalance){
        //false se ci sono errori
        //(belance - withdrawalBalance) compareto 0 [vero -1, uguali 0, falso 1] < 0 (solo vero quindi inferiore a 0)
        if(balance.subtract(withdrawalBalance).compareTo(BigDecimal.ZERO) < 0){
            //se il prelievo è superiore al saldo da un errore e torna false
            System.out.println("Impossible to carry out the operation, insufficient balance");
            return false;
        }
        //altrimenti l'operazione è riuscita e torna true
        System.out.println("Operation was successful");
        balance = balance.subtract(withdrawalBalance);
        return true;
    }
    public void showBankAccountInfo(){
        //output con tutte le info, (formatto il Bigdecimal per comodità in quanto renderlo una stringa in questo contesto non mi da' problemi)
        System.out.println(
                "\ncode of bank account: " + bankCode +
                "\nowner name: " + name +
                "\nbalance: " + String.format("%.2f€",balance) + "\n"
        );
    }
}
