package Exercice1;

public class Paire<E, S> {
    private E firstElement;
    private S secondElement;

    public Paire(E firstElement, S secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public E fst() {
        return firstElement;
    }

    public S snd() {
        return secondElement;
    }

    public <A> Paire<A, S> changeFst(A a) {
        return new Paire<>(a, this.secondElement);
    }

    public <A> Paire<E, A> changeSnd(A a) {
        return new Paire<>(this.firstElement, a);
    }

    @Override
    public String toString() {
        return "(" + firstElement + ", " + secondElement + ") :: Paire[" + firstElement.getClass().getSimpleName() + "," + secondElement.getClass().getSimpleName() + "]";
    }
}
