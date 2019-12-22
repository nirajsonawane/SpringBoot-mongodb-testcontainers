package com.example.mongodbwithtestcontainer;

import lombok.Data;

@Data
public class FruitRequest {
    private String name;
    private String color;
    public FruitModel toFruitModel(){
       return FruitModel.builder().color(this.color).name(this.name).build();
    }
}
