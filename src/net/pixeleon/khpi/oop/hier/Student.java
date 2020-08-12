package net.pixeleon.khpi.oop.hier;

class Student extends Citizen {

    private String almamater;

    public Student(String name, int birthYear, String citizenship, String almamater) {
        super(name, birthYear, citizenship);
        this.almamater = almamater;
    }

    public String getAlmamater() {
        return almamater;
    }

    public void setAlmamater(String almamater) {
        this.almamater = almamater;
    }

    @Override
    public String toString() {
        return super.toString() + "almamater = " + almamater + '\t';
    }
}
