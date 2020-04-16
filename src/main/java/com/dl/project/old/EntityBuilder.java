package com.dl.project.old;

public interface EntityBuilder{
    public EntityBuilder readDetails();
    public EntityBuilder readRelations();
    public Entity build();
}