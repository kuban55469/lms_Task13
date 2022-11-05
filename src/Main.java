import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MyClass деген класс тузунуз
//        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//        Параметри эки башка болгон эки конструктор тузунуз
//        MyClass тын 2 объектисин тузуп, конструктор аркылуу мааани бериниз
//        Эки объектке эки башка конструктор иштесин.
//        Объекттердин маанилерин консольго чыгарыныз.

        String[] myClasses = {"Java", "JS" , "Typing"};
        MyClass myClass = new MyClass("Kuban",myClasses);
        MyClass myClass1 = new MyClass("Kuban" ,"Kelsinbekov","Besh-Barmak");

        System.out.print("Name: " + myClass.getName() + "\nCourses: " );
        for (String ss:myClasses) {
            System.out.print(ss + " ");
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Name: " + myClass1.getName() + "\nSur name: " + myClass1.getSurName()
                + "\nMy favorite dish: " + myClass1.getYourFavoriteDish());
    }

}