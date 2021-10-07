import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List <Path> paths;

    City (String name){
        this.name = name;
        paths = new ArrayList<Path>();
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
}
