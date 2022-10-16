package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Database'e JDBC ile eklendi : " + course);
    }
}
