package com.dl.project.old;

import com.dl.project.domain.RawDatabaseDetail;

import java.util.ArrayList;
import java.util.UUID;

public  class DataService {
    private static ArrayList<RawDatabaseDetail> Attributes;
    private static ArrayList<RawRelation> Relations;

    public static void Init() {
        Attributes= new ArrayList<RawDatabaseDetail>();
        fillData();
    }

    public static ArrayList<RawDatabaseDetail> getAttributes() {
        return Attributes;
    }

    public static void fillData() {
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "FIRST_NAME","Dominik",UUID.fromString("10000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "LAST_NAME","Smigiel",UUID.fromString("10000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "DOB","01.01.1989",UUID.fromString("10000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "FIRST_NAME","Lukasz",UUID.fromString("20000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "LAST_NAME","Pracki",UUID.fromString("20000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "DOB","21.10.1983",UUID.fromString("20000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "FIRST_NAME","Jakub",UUID.fromString("20000000-0000-0000-0000-0000000000000")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "KYCID","20200202-312354",UUID.fromString("00000000-0000-0000-0000-000000000088")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "FILENAME","File1",UUID.fromString("00000000-0000-0000-0000-000000000088")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "KYCID","20170202-123456",UUID.fromString("00000000-0000-0000-0000-000000000099")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "FILENAME","File2",UUID.fromString("00000000-0000-0000-0000-000000000099")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "KYCID","20180202-456678",UUID.fromString("00000000-0000-0000-0000-000000000077")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "FILENAME","File3",UUID.fromString("00000000-0000-0000-0000-000000000077")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "ENTITY_TYPE","PERSON",UUID.fromString("00000000-0000-0000-0000-000000000088")));
        Attributes.add(new RawDatabaseDetail(UUID.randomUUID(), "ENTITY_TYPE","ORG",UUID.fromString("00000000-0000-0000-0000-000000000077")));

    }
}
