public class EntityCreatorAtrRelsAtr extends EntityCreatorBasic {
    @Override
    public void Construct(EntityBuilder entityBuilder) {
        this.builder = entityBuilder;
        builder.readDetails().readRelations();
    }
}
