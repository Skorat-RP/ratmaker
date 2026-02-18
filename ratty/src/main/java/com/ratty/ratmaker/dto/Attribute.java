package com.ratty.ratmaker.dto;

import java.util.List;

import static com.ratty.ratmaker.dto.AttributeType.*;

public enum Attribute {

    MIGHT(List.of(PHYSICAL)),
    RESOLVE(List.of(PHYSICAL, MENTAL, XP)),
    INTELLECT(List.of(MENTAL)),
    WISDOM(List.of(XP, MENTAL)),
    SKILL(List.of(XP));

    private final List<AttributeType> types;

    Attribute(List<AttributeType> attributeTypes){
        types = attributeTypes;
    }

}
