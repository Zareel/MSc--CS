public class Student{
    String name;
    int age;
    double psp;
    String univName;

    // creating constructor
    public Student(String name, int age, double psp, String univName){
        name = this.name;
        age = this.age;
        psp = this.psp;
        univName = this.univName;
    }

    public static void main(String[] args) {
        // creating object
Student st = new Student("Zareel",19,0, "abc" );
System.out.println(st);
        
    }
    
}

