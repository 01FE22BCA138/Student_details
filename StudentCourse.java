public class StudentCourse {
    
  
        String[] course={"c#","python","Devops","c","ML"};
        int[] marks={80,30,78,81,32};
    
        
        public void displayCourseDetails(){
            System.out.println("Courses \t\t\t Marks");
            for(int i=0;i<course.length;i++)
            {
                System.out.println(course[i] + "\t\t\t"  +marks[i]);
            }
            
           System.out.println("Students who scored less than 40:");
            for(int j=0;j<=40;j++)
            {
                if(marks[j]<=40)
                {
                    System.out.println(course[j] + "\t\t\t" + marks[j]);
                }
            }
        }
    
    
        }
    
    
    




