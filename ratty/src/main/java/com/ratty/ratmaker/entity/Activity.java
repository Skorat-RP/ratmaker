package com.ratty.ratmaker.entity;

import com.ratty.ratmaker.dto.AttributeType;
import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    @CollectionTable(
            name = "activity_attribute",
            joinColumns = @JoinColumn(name = "activity_id")
    )
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name = "attribute_type")
    @Column(name = "attribute_value")
    private Map<AttributeType, Integer> attributes;
}
