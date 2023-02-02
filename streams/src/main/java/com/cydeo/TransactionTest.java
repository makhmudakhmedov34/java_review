package com.cydeo;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        // 1. Find all transaction in 2011 and sort by value
        System.out.println("****************Task - 1 ********************");
        TransactionData.getAll().stream()
                .filter(i -> i.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2. What are all the unique cities where the traders work
        System.out.println("****************Task - 2 ********************");
        TransactionData.getAll().stream()
                .map(i ->i.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3. Find all traders from Cambridge and sort them by name
        System.out.println("****************Task - 3 ********************");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4. Return a string of all trader's names sorted alphabetically
        System.out.println("****************Task - 4 ********************");
        String str = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2) -> name1+name2+" ");
        System.out.println(str);

        //5. Are any traders based in Milan
        System.out.println("****************Task - 5 ********************");
        boolean milanBased =TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //6. Print the values of all transactions from the traders living in Cambridge
        System.out.println("****************Task - 6 ********************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7. What is the highest value of all the transaction
        System.out.println("****************Task - 7 ********************");
      int maxValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max).get();
        System.out.println(maxValue);

        //8. Find transaction with the smallest value
        System.out.println("****************Task - 8 ********************");
       Optional<Transaction> smallestValueTransaction = TransactionData.getAll().stream()
                .reduce((t1,t2) ->t1.getValue()<t2.getValue() ? t1:t2);
        System.out.println(smallestValueTransaction.get());

        Optional<Transaction> smallestValue = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallestValue.get());





    }
}
