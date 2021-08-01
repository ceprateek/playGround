package interviews;

import java.util.*;

public class School {
    public static void main(String[] args) {
        Queue<Student> students = new LinkedList();
        Queue<Exam> exams = new LinkedList();
        Queue<Student> examEvals = new LinkedList();

        Subject sub1 = new Subject(1);
        Subject sub2 = new Subject(2);
        Subject sub3 = new Subject(3);

        Student s1 = new Student(1,sub1,sub2);
        Student s2 = new Student(2,sub1,sub2,sub3);
        Student s3 = new Student(3,sub2);
        //..
        students.add(s1);students.add(s2);students.add(s3);

        Teacher t1 = new Teacher(101);
        Teacher t2 = new Teacher(102);
        Teacher t3 = new Teacher(103);



        Exam e1 = new Exam(1,1);
        Exam e2 = new Exam(1,1);
        Exam e3 = new Exam(1,1);
    }


}

class Subject {
    int subjectId;

    public Subject(int subjectId) {
        this.subjectId = subjectId;
    }
}

class ExamEval {
    int subjectId;
    int studentId;
    int marks;

    public ExamEval(int subjectId, int studentId, int marks) {
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.marks = marks;
    }
}

class Student {
    int id;
    List<Subject> subjects;
    List<ExamEval> evals;

    public Student(int id, Subject... s) {
        this.id = id;
        this.subjects = Arrays.asList(s);
    }
}

class Teacher implements Evaluator,Runnable {
    int id;

    public Teacher(int id) {
        this.id = id;
    }

    @Override
    public ExamEval evaluate(Exam e) {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        return new ExamEval(e.studentId,e.subjectId,int_random);
    }

    @Override
    public void run() {

    }
}

class Exam {
    int studentId;
    int subjectId;

    public Exam(int studentId, int subjectId) {
        this.studentId = studentId;
        this.subjectId = subjectId;
    }
}

interface Evaluator {
    public ExamEval evaluate(Exam e);
}