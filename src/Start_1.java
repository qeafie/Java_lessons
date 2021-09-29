import java.lang.reflect.Array;
import java.util.Arrays;

public class Start_1 {

    public static void main(String[] args) throws CloneNotSupportedException{

//        //1.1.1 Точка координат
//        Point p1 = new Point();
//        Point p2 = new Point();
//        Point p3 = new Point();
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
//        Comments c1 = new Comments();
//        Comments c2 = new Comments();
//        Comments c3 = new Comments();
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
//        Human h1 = new Human();
//        Human h2 = new Human();
//        Human h3 = new Human();
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
//        Name n1 = new Name();
//        Name n2 = new Name();
//        Name n3 = new Name();
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
//        Time t1 = new Time();
//        Time t2 = new Time();
//        Time t3 = new Time();
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
//        Time t4 = new Time();
//        t4.numberOfSeconds = 100_000_000;
//        System.out.println(t4);
//        System.out.println("----------");
//
//
//        //1.1.6 Дом
//
//        House d1 = new House();
//        House d2 = new House();
//        House d3 = new House();
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

        //1.2.1 Прямая

        Line l1 = new Line (new Point (1, 3), new Point (23, 8));
        Line l2 = new Line (5, 10, 25, 10);
        Line l3 = new Line (l1.start, l2.end);

        // 1.2.1.3
        System.out.println (l1);
        System.out.println (l2);
        System.out.println (l3);
        System.out.println("----------");

        //1.2.1.4
        l1.start.x = -15;
        l1.start.y = -20;
        l1.end.x = 10;
        l1.end.y = 1;

        l2.start.x = 0;
        l2.start.y = 5;
        l2.end.x = 8;
        l2.end.y = 1;

        System.out.println (l1);
        System.out.println (l2);
        System.out.println (l3);
        System.out.println("----------");

        //1.2.1.5
        l1.start = new Point(1,1);

        System.out.println (l1);
        System.out.println (l2);
        System.out.println (l3);
        System.out.println("----------");

        //1.2.2

        Name n1 = new Name ("Клеопатра");
        Name n2 = new Name ("Александр", "Сергеевич", "Пушкин");
        Name n3 = new Name ("Владимир", "Маяковский");
        Name n4 = new Name ("Христофор","Бонифатьевич");


        //Human h1 = new Human (n1);
        Human h2 = new Human (n2,167);
        Human h3 = new Human (n3,189);

        //System.out.println (h1);
        System.out.println (h2);
        System.out.println (h3);
        System.out.println("----------");


        //1.2.3

        Human h4 = new Human(new Name ("Иван","Чудов"),164,Sex.MALE);
        Human h5 = new Human(new Name ("Пётр","Чудов"),178,Sex.MALE);
        Human h6 = new Human(new Name ("Борис"),164,Sex.MALE);
        Human h7 = new Human(n1,150,Sex.FEMALE);

        h5.father = h4; //Иван отец Петра
        h6.father = h5; //Пётр отец Борис
        h7.father = h6;

        System.out.println (h4);
        System.out.println (h5);
        System.out.println (h6);
        System.out.println (h7);

        System.out.println("----------");


        //1.2.4

        Employee e1 = new Employee(new Name("Петров"),new Department("IT"));
        Employee e2 = new Employee(new Name("Козлов"),e1.department);
        Employee e3 = new Employee(new Name("Сидоров"),e1.department);
        e1.department.boss = e2;

        System.out.println (e1);
        System.out.println (e2);
        System.out.println (e3);
        System.out.println("----------");

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
        System.out.println(poly.getLine());

        // 1.3.1.1 Студент
        Student s1 = new Student(new Name("Вася"),3,4,5);
        System.out.println(s1);

        // 1.3.1.2
        Student s2 = new Student(new Name("Петя"),s1.grades);
        System.out.println(s2);
        System.out.println("----------");

        // 1.3.1.2
        s2.grades[0] = 5;
        System.out.println(s1);
        System.out.println(s2);
        /*
        *   Поле grades у студента Пети ссылается на тот же массив(объект) grades у Васи.
        *   Следовательно если мы изменим оценку у Пети,то затроним общий массив.
        */

        // 1.3.1.4
        Student s3 = new Student(new Name("Андрей"),s1.grades.clone());
        System.out.println(s3);
        System.out.println("----------");

        s1.grades[1] = 2;
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----------");


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
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");

        cityA.addPath(new Path(cityF,1));
        cityA.addPath(new Path(cityB,5));
        cityA.addPath(new Path(cityD,6));

        cityB.addPath(new Path(cityA,5));
        cityB.addPath(new Path(cityF,1));
        cityB.addPath(new Path(cityC,3));

        cityC.addPath(new Path(cityB,3));
        cityC.addPath(new Path(cityD,4));

        cityD.addPath(new Path(cityC,4));
        cityD.addPath(new Path(cityE,2));
        cityD.addPath(new Path(cityA,6));

        cityE.addPath(new Path(cityD,2));
        cityE.addPath(new Path(cityF,2));

        cityF.addPath(new Path(cityA,1));
        cityF.addPath(new Path(cityB,1));
        cityF.addPath(new Path(cityE,2));

        System.out.println(cityA);
        System.out.println(cityB);
        System.out.println(cityC);
        System.out.println(cityD);
        System.out.println(cityE);
        System.out.println(cityF);

        System.out.println("----------");

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
        
        Gun g1 = new Gun(3);
        g1.shoot();
        System.out.println("----------");
        
        // 1.5.2 Кот 
        Cat b1 = new Cat("Барсик");
        b1.meow();
        b1.meow(3);
        System.out.println("----------");
        
        // 1.5.3
        
        //Практика цыгане
        int i = 10;
        City tempCity = cityA;
        Path[] checkedPath= new Path[10]; 
        while(i>0){
        
        for(int i = 0; i < checkedPath.length; i++){
            if(checkedPath[i]!=null){
                if(tempCity != chekedPath[i]){
                tempCity = tempCity.paths[i].city;
                System.out.println(tempCity.name);
                checkedPath[i+1] =tempCity ;
                }
            }
           
            
        }   
            
//        if(tempCity != tempCity.paths[0].city){
//            
//            tempCity = tempCity.paths[0].city;
//            System.out.println(tempCity.name);
//        }
        
        
        i--;
        }
    }

}