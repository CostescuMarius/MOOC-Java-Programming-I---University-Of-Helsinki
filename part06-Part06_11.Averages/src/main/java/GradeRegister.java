
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private int sumOfPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.sumOfPoints = 0;
    }

    public void addGradeBasedOnPoints(int points) {
        this.sumOfPoints += points;
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if(this.grades.isEmpty()) {
            return -1;
        }
        
        int sumOfGrades = 0;
        for(int grade : grades) {
            sumOfGrades += grade;
        }
        
        return 1.0 * sumOfGrades / this.grades.size();
    }
    
    public double averageOfPoints() {
        if(this.sumOfPoints == 0) {
            return -1;
        }
        return 1.0 * this.sumOfPoints / this.grades.size();
    }
}
