package ru.shonin.animals;

import ru.shonin.animals.Bird;

public class Parrot extends Bird {
    private StringBuilder textToSpeak;

    public Parrot(String textToSpeak){
        this.textToSpeak =  new StringBuilder(textToSpeak);
    }

    public StringBuilder getTextToSpeak() {
        return textToSpeak;
    }

    @Override
    public void sing() {
        int numberOfPermutations = (int) (Math.random()*textToSpeak.length());

        for (; numberOfPermutations > 0; numberOfPermutations--){
            int tempIndex = (int) (Math.random()*textToSpeak.length());
            char temp = textToSpeak.charAt(tempIndex);

            int tempIndex2 = (int) (Math.random()*textToSpeak.length());
            char temp2 = textToSpeak.charAt(tempIndex2);

            textToSpeak.setCharAt(tempIndex,temp2);
            textToSpeak.setCharAt(tempIndex2,temp);

        }

        System.out.println(textToSpeak);
    }
}
