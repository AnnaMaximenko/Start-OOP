
package Sem1Homework.Tree;

public class childRelations {
    private int idChild;

    public int getIdChild() {
        return idChild;
    }

    public void setIdChild(int idChild) {
        this.idChild = idChild;
    }

    public childRelations(int idChild) {
        this.idChild = idChild;
    }

    public String toString() {
        return "Child: [id child=" + idChild + "]";
    }

}
