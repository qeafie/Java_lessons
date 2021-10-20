package ru.shonin.city;

public class ImprovedCity extends City{
    ImprovedCity(String name){
        super(name);
    }

    @Override
    public void addPath(Path path) {
        super.addPath(path);
        path.getCity().addPath(new Path(this,path.getCost()));
    }
}
