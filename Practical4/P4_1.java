import java.util.Date;

public class P4_1
{
    public static void main(String[] args)
    {
        Person p = new Person("ABC", "Ahmedabad", "0123456789", "person@gmail.com");

        Student s = new Student("PQR", "Admedabad", "0123456789", "student@gmail.com", Student.SOPHOMORE);

        Employee e = new Employee("XYZ", "Ahmedabad", "0123456789", "employee@gmail.com", "Nehru Nagar Office", 100000);

        Faculty f = new Faculty("MNO", "Ahmedabad", "0123456789", "faculty@gmail.com", "Nehru Nagar Office", 50000, 5, 2);

        Staff st = new Staff("JKL", "Ahmedabad", "0123456789", "staff@gmail.com", "Nehru Nagar Office", 40000, null);


        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st); 
        
    }
    
}
class Person
{
    public String name, address, phoneNumber, email;

    public Person(String name, String address, String phoneNumber, String email)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Person : " + this.name;
    }

}

class Student extends Person
{
    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;

    public int status;

    public Student(String name, String address, String phoneNumber, String email, int status)
    {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "Student : " + this.name;
    }
}

class Employee extends Person
{
    public String office;
    public double salary;
    public Date dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary)
    {
        super(name, address, phoneNumber, email);

        this.office = office;
        this.salary = salary;
        this.dateHired = new Date(System.currentTimeMillis());
    }

    @Override
    public String toString()
    {
        return "Employee : " + this.name;
    }
}

class Faculty extends Employee
{
    public int officeHours;
    public int rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, int officeHours, int rank)
    {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString()
    {
        return "Faculty : " + this.name;
    }
}

class Staff extends Employee
{
    public String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title)
    {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "Staff : " + this.name; 
    }
}