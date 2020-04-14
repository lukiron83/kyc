import java.util.UUID;

public class RawDatabaseDetail   {
    UUID id;
    String name;
    String value;
    UUID parentId;


    public RawDatabaseDetail(UUID id, String name, String value, UUID parentId) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.parentId = parentId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public UUID getParentId() {
        return parentId;
    }


}
