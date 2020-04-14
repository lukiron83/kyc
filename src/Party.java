import java.util.ArrayList;
import java.util.UUID;

public class Party extends Entity {

    private Party(UUID id, ArrayList<DetailBasic> detailsList, ArrayList<Relation> relationsList) {
        super(id, detailsList, relationsList);
    }
}
