package com.xuyj.demospring.designMode.flyweight.pojo;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CharacterStyle {
    public CharacterStyle(String font, int fontSize, String color) {
        this.font = font;
        this.fontSize = fontSize;
        this.color = color;
    }

    private String font;
    private  int fontSize;
    private  String color;


}
