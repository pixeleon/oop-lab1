package net.pixeleon.khpi.oop.hier;

class Citizen extends Human {
    private String citizenship;

    public Citizen() {
    }

    public Citizen(String name, int birthYear, String citizenship) {
        super(name, birthYear);
        this.citizenship = citizenship;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return super.toString() +
                "citizenship = " + citizenship + '\t';
    }
}
