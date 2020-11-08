package ro.training.java.c07;

 public  class Human
{
    String Name;
    Integer age;

    public Human(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
