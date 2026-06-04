package com.sesac.ai_backend.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Food {

    private Long id;
    private String name;
    private int price;
    private String season;

}
