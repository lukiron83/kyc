package com.dl.project.old;

public class EntityCreatorRels extends EntityCreatorBasic {
    @Override
    public void Construct(EntityBuilder entityBuilder) {
        this.builder = entityBuilder;
        builder.readRelations();
    }
}
