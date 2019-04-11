package pl.code.academy;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getField() {
        return this.a * this.a;
    }

    public double getDiagonal() {
        return this.a * Math.sqrt(2);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        DBConnection.getPerson();
    }
}
