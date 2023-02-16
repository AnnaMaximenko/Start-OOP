
package Sem1Homework.Tree;

import java.util.ArrayList;
import java.util.List;

public class bloodRelations {
    // родство по крови

    private int whoseRelations;
    private int fatherId;
    private int motherId;
    private int grandmotherId;
    private int grandfatherId;
    private List<childRelations> children = new ArrayList<>();

    public bloodRelations(int whoseRelations, int fatherId, int motherId, int grandmotherId, int grandfatherId,
            List<childRelations> children) {
        this.whoseRelations = whoseRelations;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.grandmotherId = grandmotherId;
        this.grandfatherId = grandfatherId;
        this.children = children;
    }

    public int getWhoseRelations() {
        return whoseRelations;
    }

    public void setWhoseRelations(int whoseRelations) {
        this.whoseRelations = whoseRelations;
    }

    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    public int getMotherId() {
        return motherId;
    }

    public void setMotherId(int motherId) {
        this.motherId = motherId;
    }

    public int getGrandmotherId() {
        return grandmotherId;
    }

    public void setGrandmotherId(int grandmotherId) {
        this.grandmotherId = grandmotherId;
    }

    public int getGrandfatherId() {
        return grandfatherId;
    }

    public void setGrandfatherId(int grandfatherId) {
        this.grandfatherId = grandfatherId;
    }

    public List<childRelations> getChildren() {
        return children;
    }

    public void setChildren(List<childRelations> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "bloodRelations [whoseRelations=" + whoseRelations + ", fatherId=" + fatherId + ", motherId="
                + motherId + ", grandmotherId="
                + grandmotherId + ", grandfatherId="
                + grandfatherId + ", children="
                + children
                + "]";
    }
}
