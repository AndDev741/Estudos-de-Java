import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(45, "João");

        FileOutputStream fileOutputStream = new FileOutputStream("yourFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("yourFile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(p2.getName().equals(person.getName()));
    }
}