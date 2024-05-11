import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import spring.test.controller.HelloController;
import spring.test.controller.Student;

@SpringBootTest
public class MainApplicationTest {
    public static void main(String[] args) {
        Student student=new Student();

        student.setAge(1);
        student.setName("eee");
        System.out.println(student);
    }
}
