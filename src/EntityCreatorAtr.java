public class EntityCreatorAtr extends EntityCreatorBasic {
    @Override
    public void Construct(EntityBuilder entityBuilder) {
        this.builder = entityBuilder;
        builder.readDetails();
    }
}
