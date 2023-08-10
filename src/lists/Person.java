package lists;

@SuppressWarnings("ALL")
public class Person implements Comparable<Person>{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age){
            return -1;
        } else if (this.age > o.age){
            return 1;
        }
        return 0;
    }
}
