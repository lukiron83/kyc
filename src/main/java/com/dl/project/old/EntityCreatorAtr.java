package com.dl.project.old;

public class EntityCreatorAtr extends EntityCreatorBasic {
    @Override
    public void Construct(EntityBuilder entityBuilder) {
        this.builder = entityBuilder;
        builder.readDetails();
    }
}
