package com.example.metagachon;

public enum Grade {
    VIP("VIP"), EXCELLENT("우수"), BASIC("기본"), CAUTION("주의"), WARNING("경고");
    
    final private String grade;
    
    Grade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return this.grade;
    }
}
