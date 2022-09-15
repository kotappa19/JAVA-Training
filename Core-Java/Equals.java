class Student
{
    String name;
    int id=4;
    Student(){}
    Student(int id){
        this.id = id;
    }
    public boolean equals(Object o)
    {
        Student s=(Student)o;
        return this.id==s.id;
    }
}
public class Equals {
    public static void main(String[] args) {
        Student s=new Student(5);
        Student s1=s;
        System.out.println(s.equals(s1));
        Student s2=new Student();
        System.out.println(s.equals(s2));
    }
}
