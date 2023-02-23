package Sem2Homework;

public class MarriageRelat extends Relation {

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
