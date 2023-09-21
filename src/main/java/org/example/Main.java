package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Carlo", 50, 50);

        // creo un pranzo
        // un Set di cibo e una mappa di cose da bere
        // set e mappe sono entrambe collections quindi posso serenamente passarle alla persona

        Set<Eatable> dishes = new HashSet<>();
        dishes.add(new Apple(5, true));
        dishes.add(new Yogurt(7, 3, false));
        dishes.add(new Apple(7, false));

        Map<String, Drinkable> drinks = new HashMap<>();
        drinks.put("Coca Cola", new Cola(10));
        drinks.put("Yomo", new Yogurt(1, 8, false));

        System.out.println(p);

        p.haveLunch(dishes, drinks.values());

        System.out.println(p);

    }
}