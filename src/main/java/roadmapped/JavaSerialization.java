package roadmapped;

import java.io.*;

public class JavaSerialization {
    public static void main(String[] args) {
        File myFile = new File("toSerialize.txt");
        Dog dog1 = new Dog("Rex", "hound", 6);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(myFile))) {
            outputStream.writeObject(dog1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(myFile))) {
            Dog dog2 = (Dog) inputStream.readObject();
            System.out.println(dog2.getName() + ' ' + dog2.getBreed() + ' ' + dog2.getAge());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

class Dog implements Serializable {
    // variable can be marked as transient not to be serialized
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
