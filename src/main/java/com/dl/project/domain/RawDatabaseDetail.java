package com.dl.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class RawDatabaseDetail   {
    @Id
    @Column
    UUID id;
    @Column
    String name;
    @Column
    String value;
    @Column
    UUID parentId;

}
