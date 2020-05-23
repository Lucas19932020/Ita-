package lucasteste.SpringBoot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Student {
    private int id;
    private String name;
    public static List<Student> studentList;

    // Criação de um novo bloco de inicialização Static para chamar o studentRepository()
    static {
        studentRepository();
    }
    public Student(int id, String name) {
        this(name);
        this.id = id;
    }
     public Student(String name) {
            this.name = name;
    }
public Student() {
        }


@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
        }

@Override
public int hashCode() {
        return Objects.hash(id);
        }

public String getName() {
        return name;
        }
private static void studentRepository(){
        studentList = new ArrayList<>(asList(new Student( 1, "Deku"),new Student(2,"Todoroki")));
        }
public void setName(String name) {
        this.name = name;
        }
public int getId() {
        return id;
        }
public void setId(int id) {
        this.id = id;
        }
}
