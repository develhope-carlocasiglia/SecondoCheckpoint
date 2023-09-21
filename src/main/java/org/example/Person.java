package org.example;

import java.util.Collection;

public class Person {

    private String name;
    private int hunger;
    private int thirst;

    public Person(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    /*
    Creo un metodo void eat(), che non restituisce niente perché si limita a modificare lo stato della persona.
    Tuttavia restituisce un'eccezione.
    Questo metodo prende in ingresso un Eatable, e modifica la fame della persona chiamando il metodo onEat di questo eatable.
     */
    public void eat(Eatable food) throws PoisonedFoodException {

        // prima di mangiare controlliamo se il cibo è avvelenato
        if (food.isPoisoned()) {
            // il lancio dell'eccezione, come anche il return, interrompe l'esecuzione del metodo
            throw new PoisonedFoodException("This " + food.getClass().getSimpleName() + " is poisoned");
        }

        // se siamo arrivati fin qui vuol dire che non è stata lanciata alcuna eccezione
        // quindi non occorre alcun controllo

        //if (!food.isPoisoned()) {
        food.onEat(this);
        //}

    }


    /*

    nel main crea una persona e chiamo il metodo haveLunch
        il metodo haveLunch chiama il metodo eat
            il metodo eat chiama il metodo isPoisoned
            is poisoned resituisce il risultato a eat
        eat restituisce a havelunch
    havelunch restituisce al main

     */


    public void drink(Drinkable drink) {
        drink.onDrink(this);
    }

    /*
    Implement a method haveLunch(...) in Person, which takes a Collection of Eatable objects and a Collection of
    Drinkable objects as parameters. The method calls eat() and drink() passing as parameters every Eatable
    and Drinkable object in the collections, respectively.
     */
    public void haveLunch(Collection<Eatable> dishes, Collection<Drinkable> drinks) {
        for (Eatable food : dishes) {
            try {
                eat(food);
            } catch (PoisonedFoodException e) {
                System.out.println("I have skipped something because: " + e.getMessage());
            }
        }
        for (Drinkable drink : drinks) {
            drink(drink);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void reduceHunger(int value) {
        this.hunger -= value;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    @Override
    public String toString() {
        return "Al momento la persona ha " + getHunger() + " di fame e " + getThirst() + " di sete.";
    }

}
