public class Dog {
    public String species;
    public int age;
    public String name;

    public Dog(String inputSpecies, int inputAge, String inputName) {
        species = inputSpecies;
        age = inputAge;
        name = inputName;
    }

    public void getInfoDog() {
        System.out.println("Hello My species is " + species + ". And my age is " + age + ". And most important thing is my name. My name is " + name + ".");
    }

    public boolean amIDog() {
        if (species == "dog") {
            return true;
        } else {
            return false;
        }
    }
}
