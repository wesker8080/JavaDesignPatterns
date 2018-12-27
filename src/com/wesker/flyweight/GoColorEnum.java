package com.wesker.flyweight;

public enum GoColorEnum {
    BLACK("black"),
    WHITE("white");
    String color;
    GoColorEnum(String color){
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
