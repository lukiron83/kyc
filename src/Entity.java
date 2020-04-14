import java.util.ArrayList;
import java.util.UUID;

public class Entity {
    private UUID id;
    private ArrayList<DetailBasic> detailsList;
    private ArrayList<Relation> relationsList;

    protected Entity(UUID id, ArrayList<DetailBasic> detailsList, ArrayList<Relation> relationsList) {
        this.id = id;
        this.detailsList = detailsList;
        this.relationsList = relationsList;
    }
    void show() {
        System.out.println("####Entity####");
        System.out.println("EntityID="+id.toString());
        for (DetailBasic dbas:detailsList) {
            dbas.show();
        }
        for (Relation rel:relationsList) {
            rel.show();
        }
        System.out.println();
        System.out.println("####Entity####");
    }


}
