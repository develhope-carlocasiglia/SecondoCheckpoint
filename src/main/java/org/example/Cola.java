package org.example;

public class Cola implements Drinkable {

    private int quenchingValue;


    public Cola(int quenchingValue) {
        this.quenchingValue = quenchingValue;
    }

    @Override
    public void onDrink(Person person) {
        person.setThirst(person.getThirst() - quenchingValue);
    }

    public int getQuenchingValue() {
        return quenchingValue;
    }

    public void setQuenchingValue(int quenchingValue) {
        this.quenchingValue = quenchingValue;
    }
}
