public class Praktikum {
    public static void main(String[] args) {
        Cat pixel = new Cat("Рыжий", 2); // создали рыжего кота
        changeColor(pixel); // передали объект в метод
        changeAge(pixel);
        System.out.println(pixel.color + " очень идёт коту. А еще ему " + pixel.age); // кот теперь чёрный
    }

    private static void changeColor(Cat someCat) { // метод принимает объекты класса Cat
        someCat.color = "Чёрный";           // и меняет цвет объекта, кот становится чёрным
    }

    private static void changeAge(Cat someCat) { // метод принимает объекты класса Cat
        someCat.age = 3;
    }
}

class Cat {
    String color;
    int age;

    public Cat(String catColor, int catAge) {
        color = catColor;
        age = catAge;
    }
}