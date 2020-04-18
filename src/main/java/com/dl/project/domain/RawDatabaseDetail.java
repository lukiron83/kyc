package com.dl.project.old;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.UUID;

@Data
@Builder
@Entity
@Table
public class RawDatabaseDetail   {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    @Column
    String name;
    @Column
    String value;
    @Column
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
