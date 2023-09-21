package org.example;

/*
Le eccezioni sono oggetti che estendono la classe Exception
 */

public class PoisonedFoodException extends Exception {

    public PoisonedFoodException(String message) {
        super(message);
    }

}
