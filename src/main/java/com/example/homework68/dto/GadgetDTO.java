package com.example.homework66.dto;

import com.example.homework66.entity.Gadgets;
import lombok.*;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GadgetDTO {
    private int id;
    private String name;
    private String image;
    private GadgetTypeDTO type;
    private float price;

    public static GadgetDTO from(Gadgets gadgets) {
        GadgetTypeDTO typeDTO = GadgetTypeDTO.from(gadgets.getGadgetType());
        return builder()
                .id(gadgets.getId())
                .name(gadgets.getName())
                .type(typeDTO)
                .image(gadgets.getImage())
                .price(gadgets.getPrice())
                .build();
    }
}
