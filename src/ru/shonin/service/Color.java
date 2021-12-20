package ru.shonin.service;

public enum Color {
    RED{
        public String getColor(){return "red";}
        public Color next(){return Color.GREEN;}
    },
    GREEN {
        public String getColor(){return "green";}
        public Color next(){return Color.RED;}
    };

    Color(){

    }



}
