import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // p 174 : AirCon 객체(Object)의 사용 예시
        AirCon airCon = new AirCon();
        AirCon airCon2 = new AirCon();

        // 변수(객체의 속성) 셋팅
        airCon.color = "white";
        airCon.temp = 10;
        airCon.price = 10000;
        // 메소드(airCon객체가 가진 기능) 사용
        airCon.upTemp();
        System.out.println("airCon.temp = " +
                airCon.temp +
                ", airCon.color = "
                + airCon.color +
                ", airCon.price = "
                + airCon.price + "원 ");
        airCon.onPower();
        airCon.offPower();
        airCon.downTemp();
        System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = " + airCon.price + "원 ");
        System.out.println("airCon.size = " + airCon.size);

        airCon2.color = "red";
        airCon2.temp = 20;
        airCon2.price = 5000;

        System.out.print("\n===========\n"); // \n : Line Feed + Carriage Return (엔터)

        // 메소드(airCon2객체가 가진 기능) 사용
        airCon2.upTemp();
        System.out.println("airCon.temp = " +
                airCon2.temp +
                ", airCon.color = "
                + airCon2.color +
                ", airCon.price = "
                + airCon2.price + "원 ");
        airCon2.onPower();
        airCon2.offPower();
        airCon2.downTemp();
        System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = " + airCon.price + "원 ");
        System.out.println("airCon.size = " + airCon.size);

        List<AirCon> airConList = new ArrayList<>();
        airConList.add(airCon);
        airConList.add(airCon2);


    }
}
