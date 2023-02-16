package Sem1Homework.Tree;

public class marriageRelations {
    public static void main(String[] args) {

    }

    private int whoseRelations;
    private int partnerId;
    private int motherPartnerId;
    private int fatherPartnerId;

    public marriageRelations(int whoseRelations, int partnerId, int motherPartnerId, int fatherPartnerId) {
        this.whoseRelations = whoseRelations;
        this.partnerId = partnerId;
        this.motherPartnerId = motherPartnerId;
        this.fatherPartnerId = fatherPartnerId;
    }

    public int getWhoseRelations() {
        return whoseRelations;
    }

    public void setWhoseRelations(int whoseRelations) {
        this.whoseRelations = whoseRelations;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public int getMotherPartnerId() {
        return motherPartnerId;
    }

    public void setMotherPartnerId(int motherPartnerId) {
        this.motherPartnerId = motherPartnerId;
    }

    public int getFatherPartnerId() {
        return fatherPartnerId;
    }

    public void setFatherPartnerId(int fatherPartnerId) {
        this.fatherPartnerId = fatherPartnerId;
    }

    @Override
    public String toString() {
        return "marriageRelations [whoseRelations=" + whoseRelations + ", partnerId=" + partnerId + ", motherPartnerId="
                + motherPartnerId + ", fatherPartnerId="
                + fatherPartnerId
                + "]";
    }

}
