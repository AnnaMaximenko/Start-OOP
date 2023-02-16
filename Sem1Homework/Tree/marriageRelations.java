package Sem1Homework.Tree;

public class marriageRelations {
    public static void main(String[] args) {

    }

    private int whoseRelations;
    private int partner;
    private int motherPartnerId;
    private int fatherPartnerId;

    public marriageRelations(int whoseRelations, int partner, int motherPartnerId, int fatherPartnerId) {
        this.whoseRelations = whoseRelations;
        this.partner = partner;
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
        return partner;
    }

    public void setPartnerId(int partner) {
        this.partner = partner;
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
        return "Id партнера= " + partner + ", Id мамы партнера= "
                + motherPartnerId + ",Id отца партнера= "
                + fatherPartnerId
                + "";
    }

}
