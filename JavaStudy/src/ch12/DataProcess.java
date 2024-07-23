package ch12;

public class DataProcess {
  void input(int grade, int classNum, String name) {
    StudentVO student = new StudentVO();
    student.setGrade(grade);
    student.setClassNum(classNum);
    student.setName(name);
  }
}
