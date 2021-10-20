import ru.shonin.animals.*;
import ru.shonin.city.City;
import ru.shonin.city.House;
import ru.shonin.city.ImprovedCity;
import ru.shonin.city.Path;
import ru.shonin.geometry.*;
import ru.shonin.music.Album;
import ru.shonin.music.MusicTrack;
import ru.shonin.person.Human;
import ru.shonin.person.Name;
import ru.shonin.person.RecordBook;
import ru.shonin.person.RecordResult;
import ru.shonin.publication.Comments;
import ru.shonin.service.Fraction;
import ru.shonin.service.ImprovedTime;
import ru.shonin.service.Time;
import ru.shonin.service.TimeZone;
import ru.shonin.weapon.Gun;
import ru.shonin.weapon.MachineGun;

import static java.lang.Math.*;
import static java.lang.Double.*;

public class Start_1 {

    public static void main(String[] args) throws CloneNotSupportedException {

//        //1.1.1 Точка координат
//        ru.shonin.geometry.Point p1 = new ru.shonin.geometry.Point();
//        ru.shonin.geometry.Point p2 = new ru.shonin.geometry.Point();
//        ru.shonin.geometry.Point p3 = new ru.shonin.geometry.Point();
//
//        p1.x = 5;
//        p1.y = 6;
//
//        p2.x = 6;
//        p2.y = 15;
//
//        p3.x = -1;
//        p3.y = 0;
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        System.out.println("----------");
//
//        //1.1.2 Коментарий
//
//        ru.shonin.publication.Comments c1 = new ru.shonin.publication.Comments();
//        ru.shonin.publication.Comments c2 = new ru.shonin.publication.Comments();
//        ru.shonin.publication.Comments c3 = new ru.shonin.publication.Comments();
//
//        c1.rating = 100;
//        c1.text = "Ух ты";
//
//        c2.rating = 250;
//        c2.text = "Скучный комментарий";
//
//        c3.rating = 500;
//        c3.text = "Веселый комментарий";
//
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//
//        System.out.println("----------");
//
//        //1.1.3 Человек
//
//        ru.shonin.person.Human h1 = new ru.shonin.person.Human();
//        ru.shonin.person.Human h2 = new ru.shonin.person.Human();
//        ru.shonin.person.Human h3 = new ru.shonin.person.Human();
//
//        h1.name = "Клеопатра";
//        h1.height = 152;
//
//        h2.name = "Пушкин";
//        h2.height = 167;
//
//        h3.name = "Владимир";
//        h3.height = 189;
//
//
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
//
//        System.out.println("----------");
//
//        //1.1.4 Имена
//        ru.shonin.person.Name n1 = new ru.shonin.person.Name();
//        ru.shonin.person.Name n2 = new ru.shonin.person.Name();
//        ru.shonin.person.Name n3 = new ru.shonin.person.Name();
//
//        n1.firstName = "Клеопатра";
//
//        n2.firstName = "Александр";
//        n2.thirdName = "Сергеевич";
//        n2.secondName = "Пушкин";
//
//        n3.firstName = "Владимир";
//        n3.secondName = "Маяковский";
//
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//
//        System.out.println("----------");
//
//        //1.1.5 Время
//
//        ru.shonin.service.Time t1 = new ru.shonin.service.Time();
//        ru.shonin.service.Time t2 = new ru.shonin.service.Time();
//        ru.shonin.service.Time t3 = new ru.shonin.service.Time();
//
//        t1.numberOfSeconds = 10;
//        t2.numberOfSeconds = 10_000;
//        t3.numberOfSeconds = 100_000;
//
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//
//
//        ru.shonin.service.Time t4 = new ru.shonin.service.Time();
//        t4.numberOfSeconds = 100_000_000;
//        System.out.println(t4);
//        System.out.println("----------");
//
//
//        //1.1.6 Дом
//
//        ru.shonin.city.House d1 = new ru.shonin.city.House();
//        ru.shonin.city.House d2 = new ru.shonin.city.House();
//        ru.shonin.city.House d3 = new ru.shonin.city.House();
//
//
//        d1.numberOfFloors = 1;
//        d2.numberOfFloors = 5;
//        d3.numberOfFloors = 23;
//
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//
//        System.out.println("----------");

//        //1.2.1 Прямая
//
//        ru.shonin.geometry.Line l1 = new ru.shonin.geometry.Line (new ru.shonin.geometry.Point (1, 3), new ru.shonin.geometry.Point (23, 8));
//        ru.shonin.geometry.Line l2 = new ru.shonin.geometry.Line (5, 10, 25, 10);
//        ru.shonin.geometry.Line l3 = new ru.shonin.geometry.Line (l1.start, l2.end);
//
//        // 1.2.1.3
//        System.out.println (l1);
//        System.out.println (l2);
//        System.out.println (l3);
//        System.out.println("----------");
//
//        //1.2.1.4
//
//        l1.start.x = -15;
//        l1.start.y = -20;
//        l1.end.x = 10;
//        l1.end.y = 1;
//
//        l2.start.x = 0;
//        l2.start.y = 5;
//        l2.end.x = 8;
//        l2.end.y = 1;
//        System.out.println (l1);
//        System.out.println (l2);
//        System.out.println (l3);
//        System.out.println("----------");
//
//        //1.2.1.5
//        l1.start = new ru.shonin.geometry.Point(1,1);
//
//        System.out.println (l1);
//        System.out.println (l2);
//        System.out.println (l3);
//        System.out.println("----------");

        //1.2.2

        Name n1 = new Name ("Клеопатра");
        Name n2 = new Name ("Александр", "Сергеевич", "Пушкин");
        Name n3 = new Name ("Владимир", "Маяковский");
        Name n4 = new Name ("Христофор","Бонифатьевич");


        //ru.shonin.person.Human h1 = new ru.shonin.person.Human (n1);
        Human h2 = new Human (n2,167);
        Human h3 = new Human (n3,189);

        //System.out.println (h1);
        System.out.println (h2);
        System.out.println (h3);
        System.out.println("----------");


        //1.2.3

//        ru.shonin.person.Human h4 = new ru.shonin.person.Human(new ru.shonin.person.Name ("Иван","Чудов"),164,ru.shonin.person.Sex.MALE);
//        ru.shonin.person.Human h5 = new ru.shonin.person.Human(new ru.shonin.person.Name ("Пётр","Чудов"),178,ru.shonin.person.Sex.MALE);
//        ru.shonin.person.Human h6 = new ru.shonin.person.Human(new ru.shonin.person.Name ("Борис"),164,ru.shonin.person.Sex.MALE);
//        ru.shonin.person.Human h7 = new ru.shonin.person.Human(n1,150,ru.shonin.person.Sex.FEMALE);
//
//        h5.father = h4; //Иван отец Петра
//        h6.father = h5; //Пётр отец Борис
//        h7.father = h6;
//
//        System.out.println (h4);
//        System.out.println (h5);
//        System.out.println (h6);
//        System.out.println (h7);
//
//        System.out.println("----------");


        //1.2.4
//
//        ru.shonin.person.Employee e1 = new ru.shonin.person.Employee(new ru.shonin.person.Name("Петров"),new ru.shonin.person.Department("IT"));
//        ru.shonin.person.Employee e2 = new ru.shonin.person.Employee(new ru.shonin.person.Name("Козлов"),e1.department);
//        ru.shonin.person.Employee e3 = new ru.shonin.person.Employee(new ru.shonin.person.Name("Сидоров"),e1.department);
//        e1.department.boss = e2;
//
//        System.out.println (e1);
//        System.out.println (e2);
//        System.out.println (e3);
//        System.out.println("----------");

        //1.2.5

        Comments c1 = new Comments("Отличные задачи!",169);
        Comments c2 = new Comments("Совершенно согласен с этим комментарием!",5,c1);
        Comments c3 = new Comments("Что-то я ничего не понял",0,c2);
        Comments c4 = new Comments("ответ на ответ на ответ на ответ",0,c3);
        Comments c5 = new Comments("ответ на ответ на ответ",0,c2);
        Comments c6 = new Comments("ещё один комментарий",11);
        System.out.println (c1);
        System.out.println (c2);
        System.out.println (c3);
        System.out.println (c4);
        System.out.println (c5);
        System.out.println (c6);
        System.out.println("----------");

        //1.2.6
        Album a1 = new Album("Кукловод","Металлов");
        Album a2 = new Album("Шоссе к ООП","Асид");

        MusicTrack t1 = new MusicTrack("Состояние объектов","Янг");
        MusicTrack t2 = new MusicTrack("Шоссе к ООП");
        MusicTrack t3 = new MusicTrack("Одноразовый программист","Бертон");

        t1.album = a2;
        t2.album = a2;
        t3.album = a1;

        System.out.println (t1);
        System.out.println (t2);
        System.out.println (t3);
        System.out.println("----------");


        // практика

        Polyline poly = new Polyline(new Point(2,4),new Point(2,8), new Point (10,15));
        System.out.println(poly);


//        // 1.3.1.1 Студент
//        ru.shonin.person.Student s1 = new ru.shonin.person.Student(new ru.shonin.person.Name("Вася"),3,4,5);
//        System.out.println(s1);
//
//        // 1.3.1.2
//        ru.shonin.person.Student s2 = new ru.shonin.person.Student(new ru.shonin.person.Name("Петя"),s1.grades);
//        System.out.println(s2);
//        System.out.println("----------");
//
//        // 1.3.1.2
//        s2.grades[0] = 5;
//        System.out.println(s1);
//        System.out.println(s2);
//        /*
//        *   Поле grades у студента Пети ссылается на тот же массив(объект) grades у Васи.
//        *   Следовательно если мы изменим оценку у Пети,то затроним общий массив.
//        */

//        // 1.3.1.4
//        ru.shonin.person.Student s3 = new ru.shonin.person.Student(new ru.shonin.person.Name("Андрей"),s1.grades.clone());
//        System.out.println(s3);
//        System.out.println("----------");
//
//        s1.grades[1] = 2;
//        System.out.println(s2);
//        System.out.println(s3);
//
//        System.out.println("----------");


        // 1.3.2 Зачётка
        RecordBook rb1 = new RecordBook(171896L,new Name("Вася"),
                new RecordResult("Информатика","Ермаков",5),
                new RecordResult("Математика","Петрова",4),
                new RecordResult("Физика","Сидоров",5));
        System.out.println(rb1);
        System.out.println("----------");

        // 1.3.2.2
        rb1.results[2] = new RecordResult("Английский язык","Буров",4 );
        System.out.println(rb1);
        System.out.println("----------");

        // 1.3.2.3
        RecordBook rb2 = new RecordBook(173654L,new Name("Петя"), rb1.results.clone());

        rb2.results[1] = (RecordResult) rb2.results[1].clone();
        rb2.results[1].grade = 5;


        System.out.println(rb1);
        System.out.println(rb2);
        System.out.println("----------");


        // 1.3.3 Города
//        ru.shonin.city.City cityA = new ru.shonin.city.City("A");
//        ru.shonin.city.City cityB = new ru.shonin.city.City("B");
//        ru.shonin.city.City cityC = new ru.shonin.city.City("C");
//        ru.shonin.city.City cityD = new ru.shonin.city.City("D");
//        ru.shonin.city.City cityE = new ru.shonin.city.City("E");
//        ru.shonin.city.City cityF = new ru.shonin.city.City("F");
//
//        cityA.addPath(new ru.shonin.city.Path(cityF,1));
//        cityA.addPath(new ru.shonin.city.Path(cityB,5));
//        cityA.addPath(new ru.shonin.city.Path(cityD,6));
//
//        cityB.addPath(new ru.shonin.city.Path(cityA,5));
//        cityB.addPath(new ru.shonin.city.Path(cityF,1));
//        cityB.addPath(new ru.shonin.city.Path(cityC,3));
//
//        cityC.addPath(new ru.shonin.city.Path(cityB,3));
//        cityC.addPath(new ru.shonin.city.Path(cityD,4));
//
//        cityD.addPath(new ru.shonin.city.Path(cityC,4));
//        cityD.addPath(new ru.shonin.city.Path(cityE,2));
//        cityD.addPath(new ru.shonin.city.Path(cityA,6));
//
//        cityE.addPath(new ru.shonin.city.Path(cityD,2));
//        cityE.addPath(new ru.shonin.city.Path(cityF,2));
//
//        cityF.addPath(new ru.shonin.city.Path(cityA,1));
//        cityF.addPath(new ru.shonin.city.Path(cityB,1));
//        cityF.addPath(new ru.shonin.city.Path(cityE,2));
//
//        System.out.println(cityA);
//        System.out.println(cityB);
//        System.out.println(cityC);
//        System.out.println(cityD);
//        System.out.println(cityE);
//        System.out.println(cityF);
//
//        System.out.println("----------");

        // 1.3.4 Песни и ссылки

        a2.addTrack(t1);
        a2.addTrack(t2);

        System.out.println(a2);
        System.out.println("----------");

        //1.3.5 Публикации

        //1.4.1 Точка
        System.out.println(new Point(3,5));
        System.out.println(new Point(25,6));
        System.out.println(new Point(7,8));
        System.out.println("----------");

        //1.4.2 Линия строки 132-134

        //1.4.3 Дом
        House d1 = new House(2);
        House d2 = new House(35);
        House d3 = new House(91);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("----------");

        //d1.numberOfFloors = 3; cannot assign a value to final variable numberOfFloors

        //1.4.4 Время

        //1.4.5  строки 168 - 171
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println("----------");
        
        
        // 1.5.1 Пистолет
        
//        ru.shonin.weapon.Gun g1 = new ru.shonin.weapon.Gun(3);
//        g1.shoot(5);
//        System.out.println("----------");
        
        // 1.5.2 Кот 
        Cat b1 = new Cat("Барсик");
        b1.meow();
        b1.meow(3);
        System.out.println("----------");
        
        // 1.5.3

        Line line = new Line(new Point(1,1),new Point(10,15));
        System.out.println(line.getDistance());
        System.out.println("----------");
        
        //Практика цыгане
//        int i = 10;
//        ru.shonin.city.City tempCity = cityA;
//        ru.shonin.city.Path[] checkedPath= new ru.shonin.city.Path[10];
//        while(i>0){
        
//        for(int i = 0; i < checkedPath.length; i++){
//            if(checkedPath[i]!=null){
//                if(tempCity != chekedPath[i]){
//                tempCity = tempCity.paths[i].city;
//                System.out.println(tempCity.name);
//                checkedPath[i+1] =tempCity ;
//                }
//            }
//
//
//        }
            
//        if(tempCity != tempCity.paths[0].city){
//            
//            tempCity = tempCity.paths[0].city;
//            System.out.println(tempCity.name);
//        }
        
        
        //i--;
        
        
        //1.5.4 
        Time t4 = new Time(34056);
        System.out.println(t4.getHour());
        
        Time t5 = new Time(4532);
        System.out.println(t5.getMinutes());
        
        Time t6  = new Time(123);
        System.out.println(t6.getSeconds());
        
        
        System.out.println("----------");


        //практика 2.10.2021

        //ru.shonin.city.House houseTest = new ru.shonin.city.House(-1);

        //1.5.5
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction(2,9);

        System.out.println(f1 + " + " + f2 +" = "+ f1.addition(f2)); // сложение
        System.out.println(f1 + " - " + f2 +" = "+ f1.subtraction(f2)); // вычитание
        System.out.println(f1 + " * " + f2 +" = "+ f1.multiplication(f2)); // умножение
        System.out.println(f1 + " / " + f2 +" = "+ f1.division(f2)); // деление

        //1.5.5.4
        System.out.println(f1.subtraction(f2).division(f3).subtraction(5));
        System.out.println("----------");


        //1.5.6 Студент отличник

//        ru.shonin.person.Student vasya = new ru.shonin.person.Student(new ru.shonin.person.Name("Вася"),3,4,5,4);
//        ru.shonin.person.Student petya = new ru.shonin.person.Student(new ru.shonin.person.Name("Петя"),5,5,5,5);
//
//        System.out.println(vasya.name + "Средний балл: " + vasya.getAverageRating() + ", Отличник? - " + vasya.isExcellentStudent());
//        System.out.println(petya.name + "Средний балл: " + petya.getAverageRating() + ", Отличник? - " + petya.isExcellentStudent());
//        System.out.println("----------");


        //1.5.7 Кривая линия

        Polyline p1 = new Polyline(new Point(1,5),new Point(2,8), new Point(5,3));
        System.out.println("Длина ломаной линии: "+p1.getDistance());
        p1.addPoint(new Point(5,15),new Point(8,10));
        System.out.println("Длина ломаной линии: "+p1.getDistance());
        System.out.println("----------");

        //1.5.8 Квадрат
        Square square = new Square(5,3,23);
        System.out.println(square);
        Polyline p2 = square.getPolyline();
        System.out.println("Длина ломаной линии: "+ p2.getDistance());
        
        p2.polyline.get(p2.polyline.size() - 1).setX(15);
        p2.polyline.get(p2.polyline.size() - 1).setY(25);
        System.out.println("Длина ломаной линии: "+ p2.getDistance());
        System.out.println("----------");


        //1.6.1 Дом над землей
        //ru.shonin.city.House houseTest = new ru.shonin.city.House(5);   //Exception in thread "main" java.lang.IllegalArgumentException
        //houseTest.numberOfFloors = 0;                  //numberOfFloors has private access in ru.shonin.city.House


        //1.6.2 Время

        //1.6.3 Сторона Квадрата

//        ru.shonin.geometry.Square square1 = new ru.shonin.geometry.Square(new ru.shonin.geometry.Point(1,1),-12); //Exception in thread "main" java.lang.IllegalArgumentException: Длина должна быть больше 0
//        square1.setSideLength(-12); //Exception in thread "main" java.lang.IllegalArgumentException: Длина должна быть больше 0
//        System.out.println(square1.getSideLength());
//        System.out.println("----------");

        //1.6.4 Дроби
        Fraction fraction1 = new Fraction(-25,-25); //Exception in thread "main" java.lang.IllegalArgumentException: Знаменатель не может быть равен 0
        System.out.println(fraction1);
        System.out.println("----------");

        //1.6.5 Перезарядка пистолета
        Gun gun1 = new Gun(7);
        gun1.reload(3);
        gun1.shoot(5);
        gun1.reload(8);
        gun1.shoot(2);
        gun1.discharge();
        gun1.shoot(1);
        System.out.println("----------");

        //1.6.6 Отдельные линии
        Point startP = new Point(12,10);
        Point endP = new Point(1,5);
        Line line1 = new Line(startP,endP);
        Line line2 = new Line(startP,endP);

        System.out.println(line1);
        System.out.println(line2);

        line1.setStart(endP);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("----------");

        //1.6.7 Непустые имена
        Name name1 = new Name("Денис","Владимирович",""); //Exception in thread "main" java.lang.IllegalArgumentException: Пустая строка не имя!
        System.out.println(name1.getName());
        System.out.println(name1);

        //1.6.8 Человек меняется


        //1.6.9 Диапазон оценок

        //1.6.10
        
        //практика 08.10.2021

        ImprovedTime time1 = new ImprovedTime(40121, new TimeZone(12,30));
        System.out.println(time1);


        MachineGun m1 = new MachineGun(3,3);
        m1.reload(5);
        m1.shoot();
        m1.shoot(5);

        System.out.println(f1);
        System.out.println(new Fraction(1,1).doubleValue());
        System.out.println("----------");

        Cuckoo cuckoo = new Cuckoo();
        cuckoo.sing();

        Parrot parrot = new Parrot("Привет мир!");
        parrot.sing();


        //3.3.1 Сложение
        System.out.println(sum(2,new Fraction(3,5),2.3));
        System.out.println(sum(3.6, new Fraction(49,12), 3,new Fraction(3,2)));
        System.out.println(sum(new Fraction(1,3),1));
        System.out.println("----------");

        //3.3.2 птичий рынок

        singBird(cuckoo,parrot,new Sparrow());
        System.out.println("----------");


        //3.3.3 Общая площадь

        System.out.println(measurementLength(new Square(new Point(1,4),6),
                new Square(new Point(5,4),6),
                new Circle(new Point(10,15),5)));
        System.out.println("----------");

        //3.3.4 Мяуканье

        meow(new Cat("Барсик"), new Cat("Белка"),/*new Square(new Point(1,2),5)*/);

        System.out.println("----------");

        //3.3.5 Измерение длины
        System.out.println(sumOfLengths(poly,p1));
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

        //практика 16.10
        Point point = new Point(5,6);
        java.awt.Point point1 = new java.awt.Point(4,7);

    }
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
        for (Bird bird:birds) {
            bird.sing();
        }
    }

    //3.3.3 Общая площадь

    static int measurementLength(Shape ...shapes){
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

}