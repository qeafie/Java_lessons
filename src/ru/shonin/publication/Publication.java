package ru.shonin.publication;

public class Publication {
    String title;
    String text;
    String[] tags;
    Comments [] comments;
    int rating;



    @Override
    public String toString(){
        String tempStr = "(" + rating + ") " +title + ".\n";
        tempStr += "тэги: ";
        for (String tag: tags){
            if (tag != null){
                tempStr += tag + ", ";
            }
        }
        tempStr += "\b\n";
        tempStr += text + "\n ";
        tempStr += "Комментарии: \n";

        for (Comments comment : comments){
            tempStr += comment;
        }

        return tempStr;
    }
}
