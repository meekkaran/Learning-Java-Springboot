/**
 * The student class models a student having courses and grades.
 */
public class Student{
    //private instance variables
    private String name;
    private String address;
    //course and grades for courses kept in 2 parallel arrays
    private String[] courses;
    private int[] grades;     // valid range is [0, 100]
    private int numCourses;   // Number of courses taken so far
    private static final int MAX_COURSES = 30;  // Maximum number of courses taken by student

    /** Constructs a Student instance with the given input */
    public Student(String name, String address){
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES]; // allocate arrays
        grades = new int[MAX_COURSES];
        numCourses = 0; // no courses so far
    }

    // The public getters and setters.
    // No setter for name as it is not designed to be changed.
    
    // return name
    public String getName(){
        return this.name;
    }

    // return address
    public String getAddress(){
        return this.address;
    }
    // sets address
    public void setAddress(String address){
        this.address = address;
    }
    // returns self-desrcriptive string
    public String toString(){
        return name + "(" + address + ")";
    }
    // adds a course and grade
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    // print all ocurses and their grades
    public void printGrades(){
        System.out.print(name);
        for(int i = 0; i < numCourses; ++i){
            System.out.print(" " + courses[i] + ":" +grades[i]);
        }
        System.out.println();
    }

    //computes average grade
    public double getAverageGrade(){
        int sum = 0;
        for (int i = 0; i < numCourses; ++i){
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }
}
