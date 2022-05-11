class Person implements Comparable<Person> {
    private String name;
    private int age;
    //Person constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter methods for Person members
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    //override toString () method
    @Override
    public String toString() {
        return "";
    }
    //Override compareTo () method to compare age of two Person objects
    @Override
    public int compareTo(Person per) {
        if(this.age == per.age)
            return 0;
        else
            return this.age > per.age ? 1 : -1;
    }
}