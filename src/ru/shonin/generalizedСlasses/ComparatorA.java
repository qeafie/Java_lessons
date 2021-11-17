package ru.shonin.generalizedСlasses;

import java.util.Comparator;

public class ComparatorA implements Comparator<String> {
    public int compare(String str1, String str2){
        int tempCount1 = 0;
        int tempCount2 = 0;
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        for (int i = 0; i<str1Char.length; i++){
            if (str1Char[i]=='a')
                tempCount1++;
        }
        for (int i = 0; i<str2Char.length; i++){
            if (str2Char[i]=='a')
                tempCount2++;
        }
        if (tempCount1 == tempCount2)
            return 0;
        else if(tempCount1 > tempCount2)
            return 1;
        return -1;
    }
}
