package ru.shonin.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    private List <Path> paths;

    public City (String name){
        this.name = name;
        paths = new ArrayList<Path>();
    }

    public City (String name, Path ...path){
        this.name = name;
        paths = new ArrayList<Path>();
        paths.addAll(Arrays.asList(path));
    }

    public void addPath(Path path){
       if (paths.contains(path))
           throw new IllegalArgumentException("Дорога уже существует");
       paths.add(path);
    }
    public void deletePath(Path path){
        if (! (paths.contains(path)))
            throw new IllegalArgumentException("Элемент не существует");
        paths.remove(path);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        String tempStr = "";
        tempStr += "Город " + name +" связан с \n";
        for(Path path : paths){
            if (path!=null){
                tempStr += path + "\n";
            }
        }
        return tempStr;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        if (o == null || !(o instanceof City city)) return false;
        if (name != city.name)
        if (paths.size() !=  city.paths.size()) return false;
        int flag = paths.size();
        for (int i = 0; i < paths.size(); i--){
            Path tempPath = paths.get(i);
            for (int j = 0; j < city.paths.size(); j++){
                if(tempPath.equals(paths.get(j))) flag--;
            }
        }
        if (flag == 0 ) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, paths);
    }
}
