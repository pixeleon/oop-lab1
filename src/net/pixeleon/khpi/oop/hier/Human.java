package net.pixeleon.khpi.oop.hier;

class Human {
    private String name;
    private int birthYear;

    public Human() {
    }

    public Human(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "name = " + name + '\t' +
                "birthyear = " + birthYear + '\t';
    }
}
