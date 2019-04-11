package pl.code.academy;

public class Main {

    public final static int a = 5;
    public static void main(String[] args) {
        Square square = new Square(5);
        DBConnection.getPerson();
        System.out.println(square.getA());
        System.out.println(square.getField());
        System.out.println(square.getDiagonal());



        DBConnection.getPerson();
        /*
        * asdfasdf
        * asdfasdf
        * asdfasdf
        * asdfasd
        * fasdfa
        * sdfassdf*/














        square.setA(6);

        System.out.println(square.getA());
        System.out.println(square.getField());
        System.out.println(square.getDiagonal());
        DBConnection.getPerson();



        final int a = 5;
        final String b = "erp";


        final Person p = new Person();

        System.out.println(p.getName());

        p.setName("ABC");

        System.out.println(p.getName());
        p.talk();

        Employee employee = new Employee();
        employee.talk();
    }
}
