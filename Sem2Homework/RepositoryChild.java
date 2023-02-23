package Sem2Homework;

import java.util.ArrayList;

public class RepositoryChild extends Repository {
    ArrayList<ChildRelations> childRelation = new ArrayList<>();

    public ArrayList<ChildRelations> getRelation() {
        return childRelation;
    }

    void Create(ChildRelations current) {
        childRelation.add(current);
    }

    ArrayList<ChildRelations> Read(int id) {
        ArrayList<ChildRelations> t = new ArrayList<>();

        for (ChildRelations relat : childRelation) {
            if (relat.whoseRelations == id) {
                t.add(relat);
            }
        }
        return t;
    }

}
