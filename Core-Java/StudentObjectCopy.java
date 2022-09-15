class Student
{
    String name;
    int id;
    long cno;
    Student(int id,String name,long cno)
    {
        this.id=id;
        this.name=name;
        this.cno=cno;
    }
    void Display()
    {
        System.out.println("Student id\t"+id);
        System.out.println("Student name\t"+name);
        System.out.println("Student contact number\t"+cno);
    }

}
public class StudentObjectCopy {
    public static void main(String[] args) {
        
    Student s=new Student(1, "Kotappa Y G", 9611828660L);
    Student s1=s;
    s1.Display();
    }    
}
