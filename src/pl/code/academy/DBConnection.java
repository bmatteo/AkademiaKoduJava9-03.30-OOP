package pl.code.academy;

public class DBConnection {

    static String dataBaseAddress = "jaikiś.adres.com";

    public DBConnection(String dataBaseAddress) {
        this.dataBaseAddress = dataBaseAddress;
    }

    public void connectToDB() {
        System.out.println("jestem podłączony !!");
    }

    static public Person getPerson() {
        System.out.println("Udaję że pobieram z bazy pod adresem " + DBConnection.dataBaseAddress + "!!");
        return new Person();
    }
}
