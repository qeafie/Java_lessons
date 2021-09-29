import java.util.Arrays;

public class City {
    String name;
    Path [] paths; // На этом месте мог быть ArrayList<Path>
    int countPath;
    City (String name){
        this.name = name;
        paths = new Path[10];
        countPath = 0;
    }

    public void addPath(Path path){
        paths[countPath++] = path;
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
