package Exercice3Generic;

import java.util.List;

public class Chaine<T> implements Sommable<String> {

    List<String> valueOfString;

    public Chaine(List<String> valueOfString) {
        this.valueOfString = valueOfString;
    }

    @Override
    public String sommer(List<String> valeurs) {
        String concatString = "";

        for (String s : valeurs) {
            concatString += s;
        }

        return concatString;
    }

    @Override
    public java.lang.String toString() {
        return "Chaine{" +
                "valueOfString=" + valueOfString +
                '}';
    }
}