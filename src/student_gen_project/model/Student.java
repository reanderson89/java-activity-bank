package student_gen_project.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        if(!isAttendingCourse(course.getCode()) && isCourseApproved(course.getCode())){
            registerApprovedCourse(course);
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {
//        this could need to check the course.getModule() and then check the module for pre-reqs. Though they don't exist now, they could exist at some point.
        for (Course course: courses) {
            if(course.getModule().getPrerequisites().containsKey(courseCode)){
                return true;
            }
        }
//        Since the prerequisites portion of the project has not yet been completed, we are returning true by default here. When the prerequisites actually get added into the project, please change the below return statement to return "false" instead, for this method to work accurately.
        return true;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
//    public List<Course> findPassedCourses( Course course )
//    {
//        return null;
//    }

    public boolean isAttendingCourse( String courseCode )
    {
        for (Course course: courses) {
            if(course.getCode().equals(courseCode)){
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        List<Course> ListofApprovedCourses = new ArrayList(approvedCourses.values());

        return ListofApprovedCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
