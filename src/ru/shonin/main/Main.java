package ru.shonin.main;
import static ru.shonin.main.SomeMethods.*;

import ru.shonin.generalizedСlasses.*;
import ru.shonin.generalizedСlasses.apply.*;
import ru.shonin.generalizedСlasses.reduct.ReductInteger;
import ru.shonin.generalizedСlasses.reduct.ReductIntegerArr;
import ru.shonin.generalizedСlasses.reduct.ReductString;
import ru.shonin.generalizedСlasses.test.*;
import ru.shonin.person.Name;
import ru.shonin.person.Save;
import ru.shonin.person.Student;
import ru.shonin.service.Connection;
import ru.shonin.service.Fraction;
import ru.shonin.animals.*;
import ru.shonin.geometry.*;
import ru.shonin.city.*;

import java.util.*;
import ru.shonin.service.TrafficLight;


public class Main {
    public static void main(String[] args){
        //3.3.1 Сложение
        System.out.println(sum(2,new Fraction(3,5),2.3));
        System.out.println(sum(3.6, new Fraction(49,12), 3,new Fraction(3,2)));
        System.out.println(sum(new Fraction(1,3),1));
        System.out.println("----------");

        //3.3.2 птичий рынок

        singBird(new Cuckoo(),new Parrot("привет"),new Sparrow());
        System.out.println("----------");


        //3.3.3 Общая площадь

        System.out.println(measurementLength(new Square(new Point(1,4),6),
                new Square(new Point(5,4),6),
                new Circle(new Point(10,15),5)));
        System.out.println("----------");

        //3.3.4 Мяуканье

        meow(new Cat("Барсик"), new Cat("Белка")/*,new Square(new Point(1,2),5)*/);

        System.out.println("----------");

        //3.3.5 Измерение длины
        System.out.println(sumOfLengths(new Polyline(new Point(1,3),new Point(3,1)),
                                        new Polyline(new Point(5,8),new Point(8,5))));
        System.out.println("----------");

        //3.3.6 Замкнутый квадрат

        City cityA = new ImprovedCity("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new ImprovedCity("D");
        City cityE = new City("E");

        cityA.addPath(new Path(cityB));
        cityA.addPath(new Path(cityC));

        cityB.addPath(new Path(cityC));

        cityD.addPath(new Path(cityB));
        cityD.addPath(new Path(cityE));

        cityE.addPath(new Path(cityC));

        //практика 16.10 задача 4.1.5
        Point point = new Point(5,6);
        java.awt.Point point1 = new java.awt.Point(4,7);


        // 4.1.4
        System.out.println(stringPow("3","2"));
        System.out.println("----------");

        // 4.1.3 Сложение из пакетов
        System.out.println(sum(7, new Fraction(11,3),3.21,new java.math.BigInteger("12345678912345678912")));
        System.out.println("----------");

        //5.1.1
        GeneralizedBox<Object> box = new GeneralizedBox<>();
        box.setObj(3);
        System.out.println(box.isEmpty());

        System.out.println(box.getObj());
        System.out.println("----------");

        //5.1.2
        Storage<String> storage =Storage.createStorage(null,true);
        System.out.println(storage.getObj(null));
        System.out.println("----------");

        //5.1.4

        Student student1 = new Student(new Name("Петя"),2,2,3);
        Student student2 = new Student(new Name("Коля"),5,5,3);

        System.out.println(student1.compare(student2));
        System.out.println(student2.compare(student1));
        System.out.println("----------");

        System.out.println(student1.compareTo(student2));
        System.out.println(student2.compareTo(student1));
        System.out.println("----------");


        //5.1.5

        Line<ThreeDimensionalPoint> threeDimensionalPointLine =
                new Line<>(new ThreeDimensionalPoint(1,2,4),new ThreeDimensionalPoint(5,4,2));

        System.out.println(threeDimensionalPointLine);

        Line<Point> pointLine = new Line<>(new Point(4,2),new Point(2,4));
        System.out.println(pointLine);

//        //5.2.1
//        moveLine(threeDimensionalPointLine);
//        moveLine(pointLine);
//        System.out.println(threeDimensionalPointLine);
//        System.out.println(pointLine);

        //5.2.2


        //5.2.3

        GeneralizedBox box1 = new GeneralizedBox();
        GeneralizedBox <? super Point>box2 = new GeneralizedBox<>();
        put3DPoint(box2);
        put3DPoint(box);
        put3DPoint(box1);
        System.out.println(box.getObj());
        System.out.println(box1.getObj());
        System.out.println(box2.getObj());
        System.out.println("----------");

        // 5.2.4

        List<Integer> list= new ArrayList<>();
        fillList(list);
        System.out.println(list);
        List<Integer> list1= new ArrayList<>();
        list1.add(0);
        list1.add(5);
        list1.add(8);

        fillList(list1);
        System.out.println(list1);
        System.out.println("----------");

        // 5.3.1.1 Функция
        List<String> strings = new ArrayList<>();
        strings.add("qwerty");
        strings.add("asdfg");
        strings.add("zx");

        System.out.println(function(strings,new ApplyString()));
        System.out.println("----------");

        // 5.3.1.2
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(-3);
        integers.add(7);
        System.out.println(function(integers,new ApplyInteger()));
        System.out.println("----------");

        //5.3.1.3
        List<Integer[]> arrIntegers = new ArrayList<>();
        arrIntegers.add(new Integer[]{1,2,4});
        arrIntegers.add(new Integer[]{-1,5,8});
        arrIntegers.add(new Integer[]{-1,-6,-10});

        System.out.println(function(arrIntegers,new ApplyIntegerArr()));
        System.out.println("----------");

        //5.3.2.1
        System.out.println(filter(strings,new TestString()));
        //5.3.2.2
        System.out.println(filter(integers,new TestInteger()));

        //5.3.2.3
        //System.out.println(filter(arrIntegers,new TestIntegerArr()));
        List<Integer[]> test = filter(arrIntegers,new TestIntegerArr());
        for (int i = 0; i<test.size();i++){
           // System.out.println(Arrays.stream(test.get(i)).toList());
            System.out.println(Arrays.asList(test.get(i)));
            
        }
        System.out.println("----------");


        //практика 09.11.2021
        List<String> stringList = new ArrayList<>();
        stringList.add("qwerty");
        stringList.add("asdfg");
        stringList.add("zx");
        System.out.println(stringList);
        stringList.sort(new ComparatorA());
        System.out.println();


        //5.3.3 Сокращение
        System.out.println(reduction(stringList,new ReductString()));
        System.out.println(reduction(integers,new ReductInteger()));
        System.out.println(Arrays.toString(reduction(arrIntegers,new ReductIntegerArr())));
        System.out.println("----------");
        //13.11.2021

        Storage<Integer> integerStorage = Storage.createStorage(null,true);
        System.out.println(integerStorage.getObj(null));
        int testInt  = integerStorage.getObj(1);
        System.out.println("----------");


        //5.3.4 Коллекционирование
//        Deque<Integer> integerDeque  = collect(List.of(1,2,6,7),
//                (obj,res)-> res.push(obj),
//                ArrayDeque::new);
//        System.out.println(integerDeque);
        //тест Метода создания
//        ArrayList<Integer> testIntegers= new ArrayList<>();
//        testIntegers.add(1);
//        testIntegers.add(-3);
//        testIntegers.add(7);
//        System.out.println(testIntegers);
//        System.out.println(new CreateIntegerPosAndNeg().creating(testIntegers));

        //23.11.2021
        Student<Integer> student3 = new Student(new Name("Denis"),x-> (x.intValue() > 0 )&&(x.intValue() < 1000),1,2,3,999,20);
        System.out.println(student3);

       // Student student4 = new Student(new Name("Denis"),x-> x%2==0,1,2,3,999,20);

       //03.12.2021

        System.out.println(student3);
        student3.setName(new Name("qwerty"));
        System.out.println(student3);
        student3.undo();
        System.out.println(student3);

        System.out.println("-----------");
//        System.out.println(student3+ "");
//        Student.Save save = student3.getSave();
//        student3.add(5);
//        student3.add(12);
//        System.out.println(student3);
//        student3.load(save);
//        System.out.println(student3);
//
        
        //оптимизация Студента
        // создать опекуна и если они узнают то ругаются за плохие оценки
        //1 родитель может отслеживать несколько студентов
        //событие происходит  - и родителя сообщают что у этого студента вот такая оценка
        //Родитель сам решает является ли оценка плохой
        //оценка - тип события 
        //доделать - интерфейс вместо guardian
        // сделать метод subsscribe
        // родитель должен выбрать на какое событие подписаться
        
        
        
        
        
        //11.12.2021
        
//        TrafficLight tl = new TrafficLight();
//        System.out.println(tl.next());
//        System.out.println(tl.next());
//        System.out.println(tl.next());
//        
        //

        Connection con = Connection.of("my.db").get();

        System.out.println(con.next());
        
    }
}
