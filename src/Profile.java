import java.util.ArrayList;
import java.util.UUID;

public class Profile extends Entity {
    protected Profile(UUID id, ArrayList<DetailBasic> detailsList, ArrayList<Relation> relationsList) {
        super(id, detailsList, relationsList);
    }
}
