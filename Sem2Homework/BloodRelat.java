package Sem2Homework;

import java.util.ArrayList;
import java.util.List;

public class BloodRelat extends Relation {
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
