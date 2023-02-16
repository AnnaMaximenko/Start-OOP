package Sem1Homework.Tree;

public class main2 {
    public static void main(String[] args) {
        PeopleRepository peoples = new PeopleRepository();
        peoples.create(new People(1, "Иван", "Иванов", null, null, null, null, null, null, null));
        peoples.create(new People(2, "Екатерина", "Иванова", null, null, null, null, null, null, null));

        MarriageRelationsRep marriage = new MarriageRelationsRep();
        marriage.create(new marriageRelations(1, 2, 0, 0));
        marriage.create(new marriageRelations(2, 1, 0, 0));

        Repos repo = new Repos(peoples, marriage);

        var res = repo.readCommonList();
        System.out.println(res);

    }

}
