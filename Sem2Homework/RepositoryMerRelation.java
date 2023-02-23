package Sem2Homework;

import java.util.ArrayList;

public class RepositoryMerRelation {

    ArrayList<MarriageRelat> relation = new ArrayList<>();

    public ArrayList<MarriageRelat> getRelation() {
        return relation;
    }

    void Create(MarriageRelat current) {
        relation.add(current);
    }

    ArrayList<MarriageRelat> Read(int id) {
        ArrayList<MarriageRelat> t = new ArrayList<>();

        for (MarriageRelat relat : relation) {
            if (relat.whoseRelations == id) {
                t.add(relat);
            }
        }
        return t;
    }

}
