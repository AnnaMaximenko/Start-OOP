package Sem2Homework;

public abstract class Relation {

    protected int whoseRelations;

    public Relation(int whoseRelations) {
        this.whoseRelations = whoseRelations;
    }

    public int getWhoseRelations() {
        return whoseRelations;
    }

}
