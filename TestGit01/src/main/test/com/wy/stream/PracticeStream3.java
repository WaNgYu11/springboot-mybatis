package com.wy.stream;

import com.wy.entity.Trader;
import com.wy.entity.Transaction;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream3 {


    public static void main(String[] args) {


    }

    @Test
    public void test1() {//1) 找出2011年发生的所有交易,并按交易额排序(从低到高)
        List<Transaction> collect = transactions.stream()
                .filter(e -> e.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        for (Transaction transaction : collect) {
            System.out.println(transaction.getYear() + "-" + transaction.getTrader().getName() + "-" + transaction.getTrader().getCity());
        }
    }


    @Test
    public void test2() {//2) 交易员都在那些不同的城市工作过?
        transactions.stream()
                .map(e -> e.getTrader().getCity())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }


    @Test
    public void test3() {//3) 查找所有来自剑桥的交易员,并按照名字进行排序

        List<Transaction> cambridge = transactions.stream()
                .sorted(Comparator.comparing(name -> (name.getTrader().getName())))
                .filter(name -> (name.getTrader().getCity()).equals("Cambridge"))
                .collect(Collectors.toList());
        for (Transaction transaction : cambridge) {
            System.out.println(transaction.getTrader().getName() + "-" + transaction.getTrader().getCity());
        }
    }





    List<Transaction> transactions = null;

    @Before
    public void before() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }
}
