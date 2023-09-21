package org.example;

public class Yogurt implements Drinkable, Eatable {

    int feedingValue;
    int quenchingValue;
    boolean isPoisoned;

    public Yogurt(int feedingValue, int quenchingValue, boolean isPoisoned) {
        this.feedingValue = feedingValue;
        this.quenchingValue = quenchingValue;
        this.isPoisoned = isPoisoned;
    }

    @Override
    public void onDrink(Person person) {
        person.setThirst(person.getThirst() - quenchingValue);
    }

    @Override
    public void onEat(Person person) {
        person.reduceHunger(feedingValue);
    }

    @Override
    public boolean isPoisoned() {
        return isPoisoned;
    }
}
