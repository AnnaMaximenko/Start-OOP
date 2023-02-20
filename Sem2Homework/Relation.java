package Sem2Homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Relation {

    protected int whoseRelations;

    public Relation(int whoseRelations) {
        this.whoseRelations = whoseRelations;
    }

    public int getWhoseRelations() {
        return whoseRelations;
    }

}

class MarriageRelat extends Relation {
    public static void main(String[] args) {

    }

    private int partnerId;
    private int motherPartnerId;
    private int fatherPartnerId;

    public MarriageRelat(int whoseRelations,
            int partnerId,
            int motherPartnerId,
            int fatherPartnerId) {
        super(whoseRelations);
        this.partnerId = partnerId;
        this.motherPartnerId = motherPartnerId;
        this.fatherPartnerId = fatherPartnerId;
    }

    public int getWhoseRelations() {
        return whoseRelations;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public int getMotherPartnerId() {
        return motherPartnerId;
    }

    public int getFatherPartnerId() {
        return fatherPartnerId;
    }

    @Override
    public String toString() {
        return " Партнер=" + partnerId + " motherPartnerId=" + motherPartnerId;
    }

}

class BloodRelat extends Relation {

    private int fatherId;
    private int motherId;
    private int grandmotherId;
    private int grandfatherId;
    private List<ChildRelations> children = new ArrayList<>();

    public BloodRelat(int whoseRelations,
            int fatherId,
            int motherId,
            int grandmotherId,
            int grandfatherId,
            List<ChildRelations> children) {
        super(whoseRelations);
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.grandmotherId = grandmotherId;
        this.grandfatherId = grandfatherId;
        this.children = children;

    }

    public int getwhoseRelations() {
        return whoseRelations;
    }

    public int getFatherId() {
        return fatherId;
    }

    public int getMotherId() {
        return motherId;
    }

    public int getGrandmotherId() {
        return grandmotherId;
    }

    public int getGrandfatherId() {
        return grandfatherId;
    }

    public List<ChildRelations> getChildren() {
        return children;
    }

}

class ChildRelations extends BloodRelat {

    public ChildRelations(int whoseRelations,
            int fatherId,
            int motherId,
            int grandmotherId,
            int grandfatherId,

            List<ChildRelations> children) {
        super(whoseRelations,
                fatherId,
                motherId,
                grandmotherId,
                grandfatherId,
                children);
    }

    private int ChildId;

    public int getChildId() {
        return ChildId;
    }

}
