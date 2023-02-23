package Sem2Homework;

import java.util.List;

public class ChildRelations extends BloodRelat {
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
