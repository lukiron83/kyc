package com.dl.project.old;

import java.util.ArrayList;
import java.util.UUID;

public class ProfileBuilder implements EntityBuilder {
    private UUID id;
    private ArrayList<DetailBasic> detailsListBuilder;
    private ArrayList<Relation> relationsListBuilder;
    public ProfileBuilder(UUID id) {
        this.id=id;
    }

    public  EntityBuilder readDetails(){
        DetailFacade detailFacade = new DetailFacade();
        this.detailsListBuilder = detailFacade.getAllProfileDetails(id);
        return this;
    };
    public EntityBuilder readRelations(){
//            DetailFacade detailFacade = new DetailFacade();
//            DetailRequest detailRequest= new DetailRequest(id,null,"OWNER");
//            this.detailsListBuilder = detailFacade.getDetail(detailRequest);
        return this;
    };
    public Entity build(){
        return new Profile(id,detailsListBuilder,relationsListBuilder);
    }
}
