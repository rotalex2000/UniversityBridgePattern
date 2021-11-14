import models.Professor;
import models.Student;
import repository.ProfessorRepository;
import repository.StudentRepository;
import storage.CSV;
import storage.DB;

public class Client {

    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository(new CSV());
        studentRepository.save(new Student("Alex"));

        ProfessorRepository professorRepository = new ProfessorRepository(new DB());
        professorRepository.save(new Professor("Daniel"));
    }
}
