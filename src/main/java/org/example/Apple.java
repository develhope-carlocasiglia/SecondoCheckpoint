package org.example;

/*
Estendere una classe significa che ho tutte le caratteristiche della superclasse
Implementare un'interfaccia significa che so fare tutte le cose di quell'interfaccia
Sono comunque due operazioni simili
 */
public class Apple implements Eatable {

    private int feedingValue;
    private boolean isPoisoned;

    public Apple(int feedingValue, boolean isPoisoned) {
        this.feedingValue = feedingValue;
        this.isPoisoned = isPoisoned;
    }

    @Override
    public void onEat(Person person) {
        person.reduceHunger(feedingValue);
    }

    @Override
    public boolean isPoisoned() {
        return isPoisoned;
    }

    public int getFeedingValue() {
        return feedingValue;
    }

    public void setFeedingValue(int feedingValue) {
        this.feedingValue = feedingValue;
    }

    public void setPoisoned(boolean poisoned) {
        isPoisoned = poisoned;
    }
}
