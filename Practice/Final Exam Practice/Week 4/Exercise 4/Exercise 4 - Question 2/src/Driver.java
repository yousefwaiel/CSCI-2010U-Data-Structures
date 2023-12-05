import java.util.Arrays;

public class Driver {

    public static Student getOldest(Student students[])
    {
        Arrays.asList(students);

        Arrays.sort(students, (a,b)->b.age - a.age);

        return students[0];
    }

    public static void main(String[] args) {

        Student students[] = new Student[]
                {
                        new Student("Steve", 55),
                        new Student("Bill", 65),
                        new Student("Warren", 75),
                        new Student("Elon", 45),
                        new Student("John", 35)
                };

        System.out.println("The student with the oldest age is " + getOldest(students).name +" witht the age of " + getOldest(students).age);
    }
}