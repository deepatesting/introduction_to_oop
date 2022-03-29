package com.introductiontooops.student;

public class Student {

    private String name = null;
    private char grade = ' ';
    private int group = 0;

    private final char[] studentGrades = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
    private final int[] studentGroups = new int[]{1, 2, 3, 4, 5};
    private String secretNickName = "MySecretNickName";

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getGroup() { return group; }

    public void setName(String name) { this.name = name; }

    public void setGrade(char grade) { this.grade = grade; }

    public void setGroup(int group) { this.group = group; }

    private String getSecretNickName() { return secretNickName; }

    private void setSecretNickName(String nickName) { this.secretNickName = nickName; }

    public char increaseGrade() {
        char newGrade = getGrade();

        for(int i = 1; i < studentGrades.length; ++i) {
            if (studentGrades[i] == newGrade) {
                newGrade = studentGrades[i - 1];
                break;
            }
        }
        return newGrade;
    }

    public char decreaseGrade() {
        char newGrade = getGrade();

        for(int i = 0; i < studentGrades.length - 1; ++i) {
            if (studentGrades[i] == newGrade) {
                newGrade = studentGrades[i + 1];
                break;
            }
        }
        return newGrade;
    }

}


