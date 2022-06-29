package student_gen_project.service;


import student_gen_project.model.Course;
import student_gen_project.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        if(isSubscribed(student.getId())){
            System.out.println("A student with that ID already exists");
        } else {
            students.put( student.getId(), student );

        }
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        return students.containsKey(studentId);
    }

    public void showSummary()
    {
        System.out.println("Current Students: ");
        for (String key : students.keySet()){
            Student student = students.get(key);
            System.out.println(student);
            System.out.println("Current courses this student is taking: ");
            student.getApprovedCourses().forEach(course -> System.out.println(course.toString()));
            System.out.println(" ");
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
