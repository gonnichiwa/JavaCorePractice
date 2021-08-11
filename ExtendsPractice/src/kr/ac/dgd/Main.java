package kr.ac.dgd;

public class Main {

    public static void main(String[] args) {
        System.out.println("ExtendsPractice");
        // 219 ~ 220p
        Salesman2 salesman2 = new Salesman2("정재훈",
                "영업부",
                10000000, 
                70000000);
        System.out.println(salesman2.getEmployeeInfo());
    }
}

class Employee2 {
    String name;
    String dept;
    int salary;

    public Employee2(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    String getEmployeeInfo() {
        return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
    }
}

class Salesman2 extends Employee2 {
    int commission;

    public Salesman2(String name, String dept, int salary, int commission){
        super(name, dept, salary);
        this.commission = commission;
    }
    String getEmployeeInfo() {
        return super.getEmployeeInfo() + ", 수당 = " + commission;
    }
}