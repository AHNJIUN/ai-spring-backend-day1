package com.sesac.ai_backend.dto;

import com.sesac.ai_backend.domain.Item;

public record ItemResponse(Long id, String name, int price) {

    public static ItemResponse from(Item item){
        return new ItemResponse(item.getId(), item.getName(), item.getPrice());
    }
}
