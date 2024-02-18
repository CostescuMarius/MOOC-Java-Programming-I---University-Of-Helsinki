
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class Statistics {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    private int[] gradeDistribution; 
    
    public Statistics() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.gradeDistribution = new int[6];
    }
    
    public void add(int grade) {
        this.grades.add(grade);
        if(grade >= 50) {
            this.passingGrades.add(grade);
        }
        
        int score;
        if(grade < 50) {
            score = 0;
        } else if(grade < 60) {
            score = 1;
        } else if(grade < 70) {
            score = 2;
        } else if(grade < 80) {
            score = 3;
        } else if(grade < 90) {
            score = 4;
        } else {
            score = 5;
        }
        
        this.gradeDistribution[score]++; 
    }
    
    public double average() {
        int sum = 0;

        for(int grade : this.grades) {
            sum += grade;
        }
        
        return 1.0 * sum / this.grades.size();
    }
    
    public double passingAverage() {
        int sum = 0;

        for(int grade : this.passingGrades) {
            sum += grade;
        }
        
        return 1.0 * sum / this.passingGrades.size();
    }
    
    public double passingPercentage() {
        return 100.0 * this.passingGrades.size() / this.grades.size();
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution: ");
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            
            for(int j = 0; j < this.gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
