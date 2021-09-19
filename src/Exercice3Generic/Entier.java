package Exercice3Generic;

import java.util.List;

class Entier<T> implements Sommable<Integer> {
    List<Integer> integergentil;

    public Entier(List<Integer> integergentil) {
        this.integergentil = integergentil;
    }

    @Override
    public Integer sommer(List<Integer> entier) {
        int valcumul = 0;
        for (Integer i : entier) {
            valcumul += i;
        }
        return valcumul;
    }
}