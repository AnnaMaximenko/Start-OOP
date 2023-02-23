package Sem2Homework;

import java.util.ArrayList;

public abstract class Repository {

}

class Repo {

    RepositoryPeople repPeopl;
    RepositoryMerRelation repMerRelat;
    ArrayList<PeopleOne> peoples;
    RepositoryBloodRelation repBloodRelat;
    RepositoryChild repChildRelation;

    public Repo(RepositoryPeople repPeopl,
            RepositoryMerRelation repMerRelat,
            RepositoryBloodRelation repBloodRelat,
            RepositoryChild repChildRelation) {
        this.repPeopl = repPeopl;
        this.repMerRelat = repMerRelat;
        this.repBloodRelat = repBloodRelat;
        this.repChildRelation = repChildRelation;
    }

    StringBuilder readPeopleList() {
        StringBuilder readPeopl = new StringBuilder();

        for (PeopleOne item : repPeopl.getDb()) {
            readPeopl.append(
                    String.format("%s %s %s \n", item.getId(), item.getName(), item.getSurname(),
                            repMerRelat.Read(item.getId()),
                            repBloodRelat.Read(item.getId()), repChildRelation.Read(item.getId())));
        }

        return readPeopl;
    }

    StringBuilder Read(int id) {
        StringBuilder readPeopl = new StringBuilder();

        for (PeopleOne item : repPeopl.getDb()) {
            if (id == item.getId()) {
                readPeopl.append(
                        String.format("%s %s", item.getName(), item.getSurname()));
            }
        }
        return readPeopl;
    }

    int ReadPartner(int id) {
        StringBuilder readPeopl = new StringBuilder();

        for (MarriageRelat item : repMerRelat.getRelation()) {
            if (id == item.getWhoseRelations()) {
                readPeopl.append(
                        String.format("%s", item.getPartnerId()));
            }
        }
        return Integer.parseInt(readPeopl.toString());
    }

    int ReadMother(int id) {
        StringBuilder readPeopl = new StringBuilder();

        for (BloodRelat item : repBloodRelat.getRelation()) {
            if (id == item.getWhoseRelations()) {
                readPeopl.append(
                        String.format("%s", item.getMotherId()));
            }
        }
        return Integer.parseInt(readPeopl.toString());
    }

    int ReadFather(int id) {
        StringBuilder readPeopl = new StringBuilder();

        for (BloodRelat item : repBloodRelat.getRelation()) {
            if (id == item.getWhoseRelations()) {
                readPeopl.append(
                        String.format("%s", item.getFatherId()));
            }
        }
        return Integer.parseInt(readPeopl.toString());

    }

    ArrayList<Integer> ReadChildMother(int id) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (ChildRelations item : repChildRelation.getRelation()) {
            if ((id == item.getFatherId()) || (id == item.getMotherId())) {
                list.add(
                        Integer.parseInt(String.format("%s", item.getWhoseRelations())));
            }
        }
        return list;
    }

}