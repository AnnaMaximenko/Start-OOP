package Sem2Homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository {

}

class RepositoryPeople extends Repository {

    ArrayList<PeopleOne> peoples = new ArrayList<>();

    public ArrayList<PeopleOne> getDb() {
        return peoples;
    }

    void Create(PeopleOne current) {
        peoples.add(current);
    }

    public PeopleOne Read(int id) {
        return peoples.get(id);
    }

    public static void Print(List<PeopleOne> peoples) {
        for (PeopleOne one : peoples) {
            System.out.println(one);
        }
    }

    PeopleOne Read(String fl) {
        for (PeopleOne people : peoples) {
            if (people.getName().equals(fl))
                return people;
        }
        return null;
    }

}

class RepositoryMerRelation extends Repository {

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

class RepositoryBloodRelation extends Repository {

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

class RepositoryChild extends Repository {

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