package org.learning.javaBank;
//imports
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //definisco lo scanner
        Scanner scanner = new Scanner(System.in);
        //dichiaro le variabili
        String name;
        int chooseOperation = -1;
        //inizializzo name con la validazione
        do{
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
            if(name.isEmpty()){
                //se è vuoto mando in output un errore
                System.out.println("Error, the field name is empty, try again");
            }
        }while(name.isEmpty());
        //creo il profilo bancario
        BankAccount myBankAccount = new BankAccount(name);
        System.out.println("your balance: " + String.format("%.2f€",myBankAccount.getBalance()));
        //loop delle operazioni
        do {
            //ciclo finchè l'utente non digita 0;
            //prendo in input la scelta dell'operazione con validazione
            do {
                try{
                    System.out.print("dial 1 to deposit, dial 2 to withdrawal, dial 0 to exit: ");
                    chooseOperation = Integer.parseInt(scanner.nextLine());
                }catch (Exception e){
                    //setto a -1 per ripetere l'input
                    chooseOperation = -1;
                }
                if(chooseOperation < 0 || chooseOperation > 2){
                    //mando messaggio di errore e numero non compreso tra 0 e 2
                    System.out.println("Error the number is not a positive integer number between 0 and 2, please try again");
                }
            }while (chooseOperation < 0 || chooseOperation > 2);
            switch (chooseOperation){
                case 1:
                    //prendo il valore da depositare
                    BigDecimal valueDeposit = BalanceOfOperation(scanner);
                    //lo deposito
                    myBankAccount.deposit(valueDeposit);
                    //mostro i nuovi dati
                    myBankAccount.showBankAccountInfo();
                    break;
                case 2:
                    //prendo il valore da prelevare
                    BigDecimal valueWithdrawal = BalanceOfOperation(scanner);
                    //lo prelevo e creo una flag per sapere se l'operazione è riuscita
                    boolean flagWithdrawalSuccessful = myBankAccount.withdrawal(valueWithdrawal);
                    if(flagWithdrawalSuccessful){
                        //se andato a buon fine mostro i nuovi dati
                        myBankAccount.showBankAccountInfo();
                    }
                    break;
                case 0:
                    break;
            }
        }while(chooseOperation != 0);
        //chiudo lo scanner
        scanner.close();
    }
    public static BigDecimal BalanceOfOperation(Scanner scanner){
        BigDecimal value;
        do {
            try{
                System.out.print("enter how much you want to deposit: ");
                String input = scanner.nextLine();
                value = new BigDecimal(input);
            }catch (Exception e){
                //setto a -1 per ripetere l'input
                value = BigDecimal.valueOf(-1);
            }
            if(value.compareTo(BigDecimal.ZERO) < 0 ){
                //mando messaggio di errore e numero negativo
                System.out.println("Error the number is not a positive integer number between 0 and 2, please try again");
            }
        }while (value.compareTo(BigDecimal.ZERO) < 0 );
        return value;
    }
}
