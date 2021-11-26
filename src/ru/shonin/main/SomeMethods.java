package ru.shonin.main;
import static java.lang.Math.*;
import static java.lang.Double.*;
import ru.shonin.animals.*;
import ru.shonin.generalizedСlasses.*;

import ru.shonin.geometry.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class SomeMethods {
    // 4.1.4
    static double stringPow(String str1,String str2){
        return pow(parseDouble(str1),parseDouble(str2));
    }

    //3.3.1 Сложение
    static double sum(Number ...numbers){
        double temp = 0;
        for (Number number: numbers){
            temp+=number.doubleValue();
        }
        return temp;
    }

    //3.3.2 птичий рынок
    static void singBird(Bird ...birds){
        for (ru.shonin.animals.Bird bird:birds) {
            bird.sing();
        }
    }

    //3.3.3 Общая площадь

    static int measurementLength(Shape...shapes){
        int temp =0;
        for (Shape shape: shapes){
            temp+= shape.getArea();
        }
        return temp;
    }
    //3.3.4 Мяуканье
    static void meow(CanMeow... canMeows){
        for (CanMeow canMeow: canMeows)
            canMeow.meow();
    }

    //3.3.5 Измерение длины
    static int sumOfLengths(CanReturnDistance...objects){
        int temp=0;
        for (CanReturnDistance obj:objects){
            temp += obj.getDistance();
        }
        return temp;
    }

    //3.3.7  Ломай меня полностью

    static Polyline sumPolyline(CanGetPolyLine... polyLines){
        Polyline polyline = new Polyline();
        for (CanGetPolyLine polyLine:polyLines){
            polyline.polyline.addAll(polyLine.getPolyline().polyline);
        }
        return polyline;
    }


    //5.2.1 Сдвинуть линию

    static void moveLine (Line<?> line){
        line.getStart().setX(line.getStart().getX() > 0 ? line.getStart().getX() + 10 : line.getStart().getX() - 10);
    }

    // 5.2.2 Поиск максимума

    static double getMaxValueStorage(Storage<? extends Number> []  storages){
        double max = storages[0].getObj(null).doubleValue();
        for (int i = 0; i < storages.length; i++){
            double temp = storages[i].getObj(null).doubleValue();
            if (temp > max) max = temp;
        }
        return max;
    }

    // 5.2.3 Начало отчёта
    static void put3DPoint(GeneralizedBox <? super ThreeDimensionalPoint> box){
        box.setObj(new ThreeDimensionalPoint((int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10)));
    }

    // 5.2.4 Заполнение списка

    static List fillList (List<? super Integer> list){
        if (list.isEmpty())
            for (int i = 0; i < 100; i++){
                list.add(i+1);
            }
        else
            for (int i = 0; i < list.size(); i++){
                list.set(i,i+1);
            }
        return list;
    }

    // 5.3.1 Функция

    static <T,P> List<P>  function(List<T> tList, Applyable<T,P> applyable){
        List<P> pList = new ArrayList<>();
        for (T listElem : tList ){
            pList.add((applyable.apply(listElem)));
        }
        return pList;
    }

    // 5.3.2 Фильтр

    public static <T> List<T> filter(List<T> tList, Testable<T> testable){
        List<T> tList1 = tList;
        for (int i = 0; i < tList1.size(); i++){
            if(testable.test(tList1.get(i)))
                tList1.remove(tList1.get(i));
        }

        return tList1;
    }

    // 5.3.3 Сокращение

    public static <T> T reduction(List<T> tList,Reducible<T> reducible){
        return (T) reducible.reduct(tList);
    }

    //5.3.4  Коллекционирование

    public static <T,P> P collect(List<T> list, BiConsumer<T,P> biConsumer, Supplier<P> supplier ){
        P res = supplier.get();
        for (T tobj: list){
            biConsumer.accept(tobj,res);
        }
        return res;
    }
}

