package com.example.bbang0.application.dto.Favorite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FavoriteCreateReqDto {
    private String user_id;
    private String bakery_id;
    private Boolean favorite;
}