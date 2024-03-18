class Student extends StudentCourse{
    String name="Sukanya";
    String program="BCA";
    int semester=4;
    
    public void displayDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Program:"+program);
        System.out.println("Semester:"+semester);
    }

    public static void main(String[] args)
    {
        Student s=new Student();
        s.displayDetails();
        StudentCourse sc= new StudentCourse();
        sc.displayCourseDetails();

    }



}