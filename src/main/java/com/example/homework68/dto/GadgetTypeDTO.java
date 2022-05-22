package com.example.homework66.dto;

import com.example.homework66.entity.GadgetType;
import lombok.*;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GadgetTypeDTO {
    private int id;
    private String name;
    private String icon;

    public static GadgetTypeDTO from(GadgetType gadgetType) {
        return builder()
                .id(gadgetType.getId())
                .name(gadgetType.getName())
                .icon(gadgetType.getIcon())
                .build();
    }
}
