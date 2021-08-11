package kr.ac.dgd;

public class ThisConstructorTest {

    public static void main(String[] args) {
        System.out.println("ConstructorPractice2");
        // p 201 ~ 202p
        House house1 = new House();
        printHouse(house1); // house의 멤버변수들 값을 출력하는 메소드.

        House house2 = new House(300);
        printHouse(house2);

        House house3 = new House(300, 40);
        printHouse(house3);

        House house4 = new House(300, 40, "서초동");
        printHouse(house4);

        House house5 = new House(300, 40, "서초동" , "빌라");
        printHouse(house5);
    }

    private static void printHouse(House house) {
        System.out.println(house.toString());
    }
}
