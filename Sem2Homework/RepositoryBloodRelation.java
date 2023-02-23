package Sem2Homework;

import java.util.ArrayList;

public class RepositoryBloodRelation extends Repository {
    ArrayList<BloodRelat> bloodRelation = new ArrayList<>();

    public ArrayList<BloodRelat> getRelation() {
        return bloodRelation;
    }

    void Create(BloodRelat current) {
        bloodRelation.add(current);
    }

    ArrayList<BloodRelat> Read(int id) {
        ArrayList<BloodRelat> t = new ArrayList<>();

        for (BloodRelat relat : bloodRelation) {
            if (relat.whoseRelations == id) {
                t.add(relat);
            }
        }
        return t;
    }

}
