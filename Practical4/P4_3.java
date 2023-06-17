public class P4_3
{
    public static void main(String[] args)
    {
        Person p = new Person("PQR", "Ahmedabad");
        Student s = new Student("XYZ", "Ahmedabad");
        Teacher t = new Teacher("ABC", "Ahmedabad");

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println();

        s.addCourseGrade("OOP1", 91);
        s.addCourseGrade("OS", 88);
        s.addCourseGrade("DS", 78);
        s.addCourseGrade("OOP1", 94);
        s.addCourseGrade("DBMS", 80);
        s.addCourseGrade("COA", 60);
        s.addCourseGrade("DF", 70);

        s.printGrades();
        System.out.println("Average Grade = " + s.getAverageGrade());
        System.out.println();

        t.addCourse("OOP1");
        t.addCourse("OS");
        t.addCourse("COA");
        t.addCourse("DS");

        t.printCourses();
        System.out.println();
        
        t.removeCourse("OS");
        t.printCourses();
    }
}

class Person
{
    private final String name;
    private String address;

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return this.getName() + "(" + this.getAddress() + ")";
    }
}

class Student extends Person
{
    private static final int COURSES_LIMIT = 30;
    private int numCourses = 0;
    private String[] courses = new String[COURSES_LIMIT];
    private int[] grades = new int[COURSES_LIMIT];

    public Student(String name, String address)
    {
        super(name, address);
    }

    public void addCourseGrade(String course, int grade)
    {
        for (int i = 0; i < this.numCourses; i++)
        {
            if (courses[i].equals(course))
            {
                this.grades[i] = grade;
                return;
            }
        }
        if (numCourses >= COURSES_LIMIT)
            return;
        
        this.courses[numCourses] = course;
        this.grades[numCourses] = grade;
        this.numCourses++;
    }

    public void printGrades()
    {
        System.out.println("For Student named : " + this.getName() + ",");
        for (int i = 0; i < this.numCourses; i++)
        {
            System.out.println(this.courses[i] + " : " + this.grades[i]);
        }
    }

    public double getAverageGrade()
    {
        int sum = 0;

        for (int i = 0; i < numCourses; i++)
        {
            sum += this.grades[i];
        }

        return (double) sum / this.numCourses;
    }

    @Override
    public String toString()
    {
        return "Student : " + this.getName() + "(" + this.getAddress() + ")";
    }

}

class Teacher extends Person
{
    private static final int COURSES_LIMIT = 5;

    private int numCourses = 0;
    private String[] courses = new String[COURSES_LIMIT];

    public Teacher(String name, String address)
    {
        super(name, address);
    }

    public boolean addCourse(String course)
    {
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i].equals(course))
                return false;
        }

        if (numCourses >= COURSES_LIMIT)
            return false;

        courses[numCourses] = course;
        numCourses++;

        return true;
    }

    public boolean removeCourse(String course)
    {
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i].equals(course))
            {
                for (int j = i; j < numCourses - 1; j++)
                {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }

    public void printCourses()
    {
        System.out.println("Courses taught by Teacher : " + this.getName() + ",");
        for (int i = 0; i < this.numCourses; i++)
        {
            System.out.println(this.courses[i]);
        }
    }

    @Override
    public String toString()
    {
        return "Teacher : " + this.getName() + "(" + this.getAddress() + ")";
    }
}