package com.ratty.ratmaker.dto;

import java.util.List;

public record StatusDto(RatClass ratClass, int level, List<AttributeProgressDto> progress) {
}
