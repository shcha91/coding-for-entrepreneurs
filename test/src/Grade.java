import java.util.Random;

public class Grade {
    public int grade;

    public void GenerateNumberGrade(){
        Random random = new Random();
        grade = random.nextInt(101);
        System.out.println(grade);
    }

    public void GenerateLetterGrade() {
        if (grade >= 90) {
            System.out.println("Grade : A");
        } else if (grade >= 80) {
            System.out.println("Grade : B");
        } else if (grade >= 70) {
            System.out.println("Grade : C");
        } else if (grade >= 60) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }
    }
}
