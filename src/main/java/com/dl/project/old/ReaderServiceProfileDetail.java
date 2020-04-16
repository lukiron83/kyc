package com.dl.project.old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class ReaderServiceProfileDetail implements ReaderService {

    public ReaderServiceProfileDetail() {
    }

    @Override
    public DetailBasic getDetail(DetailRequest dRequest) {
        return getDetail(dRequest.getProfileId(),dRequest.getName());
    }


    public DetailBasic getDetail(UUID parentId, String attributeName) {

        String value;

        try {
            if (parentId==null) {
                throw null;
            }
            else {
                return retrieveByNameAndParentId(parentId,attributeName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    public DetailBasic retrieveByNameAndParentId(UUID parentId,String name) {
        ArrayList<String> values = new ArrayList<String>();
        ArrayList<RawDatabaseDetail> TableOfDetails=DataService.getAttributes();
        for(RawDatabaseDetail detail : TableOfDetails){
            if(detail.getName() != null && detail.getName()==name) {
                if(detail.getParentId()!=null && (detail.getParentId().compareTo(parentId))==0) {
                    values.add(detail.getValue());
                }
            }
        }
        if(!values.isEmpty()){
            return new PartyDetail(parentId, name, values);
        }
        return null;
    }
    public ArrayList<DetailBasic> getAllDetails(UUID parentId) {

        String value;

        try {
            if (parentId==null) {
                throw null;
            }
            else {
                return retrieveByParentId(parentId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private ArrayList<DetailBasic> retrieveByParentId(UUID parentId) {
        ArrayList<DetailBasic> returnDetailsList= new  ArrayList<DetailBasic>();
        HashMap<String,DetailBasic> detailsList= new  HashMap<String,DetailBasic>();
        ArrayList<RawDatabaseDetail> TableOfDetails=DataService.getAttributes();
        for(RawDatabaseDetail detail : TableOfDetails){
            if(detail.getParentId()!=null && (detail.getParentId().compareTo(parentId)==0)) {
                if(!detailsList.containsKey(detail.getName()))
                    detailsList.put(detail.getName(),new ProfileDetail(detail.getId(),detail.getName(),new ArrayList<String>()));
                detailsList.get(detail.getName()).getValues().add(detail.getValue());
            }
        }
        for(HashMap.Entry element : detailsList.entrySet()){
            DetailBasic detailBasic= (DetailBasic) element.getValue();
            returnDetailsList.add(detailBasic);
        }
        if(!returnDetailsList.isEmpty()){
            return returnDetailsList;
        }
        return null;
    }
}

