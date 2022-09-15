import java.util.ArrayList;
import java.util.Scanner;

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
    public String toString()
    {
        return "Student Id: "+id+"\nStudent Name: "+name+"\nStudent Contact Number: "+cno;
    }
}
// class MyException
// {
//     public MyException(String s)
//     {
//         super(s);
//     }
// }
class School
{
    Student s;
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> a1=new ArrayList<>();
    void AddStudent()
    {
        System.out.println("Enter the Student Id");
        int id=sc.nextInt();
        for (Student s : a1) {
            if(id==s.id)
            {
                System.out.println("Student Already Present");
                return;
            }   
        }
        System.out.println("Enter the Student name");
        String name=sc.next();
        System.out.println("Enter the Student Contact Number");
        long cno=sc.nextLong();
        s=new Student(id, name, cno);
        a1.add(s);
        System.out.println("Admitted Successfully");
    }
    void DisplayDetails()
    {
            System.out.println("Enter the Student Id");
            int id=sc.nextInt();
            for (Student s : a1) {
                if(id==s.id)
                {
                    System.out.println(s);
                    return;
                }
            }
            System.out.println("Student not Found");
    }
    void RemoveStudent()
    {
        System.out.println("Enter the Student id");
        int id=sc.nextInt();
        for (Student s : a1) {
            if(id==s.id)
            {
                a1.remove(s);
                System.out.println("Student Removed");
                return;
            }
        }
        System.out.println("Student not Found");
    }
    void UpdateStudent()
    {
        System.out.println("Enter the Student Id");
        int id=sc.nextInt();
        for (Student s: a1) {
            if(id==s.id)
            {
                System.out.println("Enter the Contact Number to Update");
                Long cno=sc.nextLong();
                s.cno=cno;
                System.out.println("Contact Number Updated Successfully");
            }
        }
        System.out.println("Student not Found");
    }
    void DisplayAll()
    {
        if(a1.size()==0)
            System.out.println("No Student Found");
        else
        {
            for (Student s : a1) {
                System.out.println(s);
                System.out.println();
            }
        }
    }
}
public class StudentCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        School sk=new School();
        while(true)
        {
            System.out.println("1-Add Student\n2-Display Details\n3-Remove Student\n4-Update Details\n5-Display All the Students\n6-Exit\nEnter Your Choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:sk.AddStudent();
                break;
                case 2:sk.DisplayDetails();
                break;
                case 3:sk.RemoveStudent();
                break;
                case 4:sk.UpdateStudent();
                break;
                case 5:sk.DisplayAll();
                break;
                case 6:System.exit(0);
                default:System.out.println("Enter a Valid Choice");
            }
        }
    }
}
