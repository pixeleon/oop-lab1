package net.pixeleon.khpi.oop.hier;

public class Main {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Adam", 1),
                new Citizen("Kane", 1941, "USA"),
                new Student("Vadym", 2000, "Ukraine", "NTU 'KhPI'"),
                new Employee("Aliona", 1996, "Belarus", "lawyer")
        };
        for (Human h :
                humans) {
            System.out.println(h);
        }
        System.out.println(new Employee("Robert", 1999, "Bikini Bottom", "fry cook"));
    }
}
