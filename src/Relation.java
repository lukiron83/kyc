import java.util.UUID;


public class Relation {
    UUID parentId;
    UUID childId;
    private RelationType relationType;
    public enum RelationType { OWNER, GRANTOR }
    public void show() {
        System.out.println("=====Relation====");
        if(parentId!=null)
            System.out.println(this.parentId+
                    this.relationType.toString()+
                    this.childId);
        else
            System.out.println("Detail not set");
        System.out.println("=====Relation====");
    }
}
