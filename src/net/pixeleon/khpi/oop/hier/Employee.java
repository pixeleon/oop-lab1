package net.pixeleon.khpi.oop.hier;

class Employee extends Citizen {

    private String occupation;

    public Employee(String name, int birthYear, String citizenship, String occupation) {
        super(name, birthYear, citizenship);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return super.toString() + "occupation = " + occupation + '\t';
    }
}
