import java.util.Scanner;

public class Main {

    //region Homework 1
    public static void task1()
    {
        var in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        if(age >= 18) {
            System.out.println("Вы совершеннолетний");
        }
        if(age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    public static void task2()
    {
        var in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int childrenAge = in.nextInt();

        if(childrenAge >= 7 && childrenAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (childrenAge >= 18 && childrenAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (childrenAge >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    public static void task3(){
        var in = new Scanner(System.in);
        System.out.print("Введите количество людей в вагоне: ");
        int peopleQuantity = in.nextInt();
        int seatingPlaces = 60;
        int carCapacity = 102;

        if(peopleQuantity <= seatingPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (peopleQuantity <= carCapacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (peopleQuantity > carCapacity) {
            System.out.println("В вагоне нет мест, вагон забит");
        }
    }
    //endregion

    //region Homework 2
    public static void task4() {
        var in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age = in.nextInt();

        if(age < 18) {
            System.out.println("Возраст совершеннолетия еще не насупил");
        }
        else {
            System.out.println("Вы совершеннолетний");
        }
    }

    public static void task5()
    {
        var in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int childrenAge = in.nextInt();

        if(childrenAge >= 7 && childrenAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (childrenAge >= 18 && childrenAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (childrenAge >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        else {
            System.out.println("Ребенок ходит в дет.сад");
        }
    }

    public static void task6()
    {
        var in = new Scanner(System.in);
        System.out.print("Введите количество людей в вагоне: ");
        int peopleQuantity = in.nextInt();
        int seatingPlaces = 60;
        int carCapacity = 102;

        if(peopleQuantity <= seatingPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (peopleQuantity <= carCapacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("В вагоне нет мест, вагон забит");
        }
    }
    //endregion

    //region Homework 3
    public static void task7()
    {
        var in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int personAge = in.nextInt();

        if(personAge >= 2 && personAge <= 6) {
            System.out.println("Нужно ходить в детский сад");
        }
        else if (personAge >= 7 && personAge <= 18) {
            System.out.println("Нужно ходить в школу");
        }
        else if (personAge > 18 && personAge <= 24) {
            System.out.println("Место в университете");
        }
        else {
            System.out.println("Пора ходить на работу");
        }
    }

    public static void task8(){
        var in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int personAge = in.nextInt();

        if(personAge <= 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        else if(personAge > 5 && personAge <= 14) {
            System.out.println("Можно кататься только в сопровождении взрослого.\n" +
                    "Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Можно кататься без взрослых");
        }
    }

    public static void task9(){
        int one, two, free;

        if (one >= two && one >= free){
            System.out.println("Большее число = " + one);
        }
        else if (two >= one && two >= free) {
            System.out.println("Большее число = " + two);
        }
        else{
            System.out.println("Большее число = " + free);
        }
    }
    //endregion

    public static void main(String[] args) {
        task9();
    }
}