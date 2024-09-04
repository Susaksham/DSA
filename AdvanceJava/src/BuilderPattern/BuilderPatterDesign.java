package BuilderPattern;

public class BuilderPatterDesign {
    public static void main(String[] args) {
        Employee e = new Employee.Dummy("Saksham" , 1234).setAge(21).setEmail("sakshamyogesh@gmail.com").build();

        System.out.println(e.name + " " +  e.email + " " +  e.age + " " + e.number);

    }
}

// 26 203-------------
// aoc-
  class Employee{

    String name , email;
    int age , number;

    // it should be private so that outside the class can not call this constructor
    private Employee(Dummy obj){
        this.name = obj.name;
        this.email = obj.email;
        this.age = obj.age;
        this.number = obj.number;
    }

    static class Dummy {
        String name , email;
        int age , number;
        Dummy(String name , int number){
            this.name = name;
            this.number = number;
        }
        public Dummy setAge (int age){
            this.age = age;
            return this;
        }
        public Dummy setEmail(String email){
            this.email  = email;
            return this;
        }
        // builder method
        public Employee build(){
            return new Employee(this);
        }
    }



}