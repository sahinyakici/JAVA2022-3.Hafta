import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course(1, "Java", "Eğitim kampı", 0);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course);
    }
}