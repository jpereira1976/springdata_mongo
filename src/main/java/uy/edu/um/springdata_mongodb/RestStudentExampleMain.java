package uy.edu.um.springdata_mongodb;

import org.springframework.web.client.RestTemplate;

public class RestStudentExampleMain {

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();

        Student student = template.getForObject("http://localhost:8080/students/5fadac0b7238e61831d571b5", Student.class);

        System.out.println(student);
    }
}
