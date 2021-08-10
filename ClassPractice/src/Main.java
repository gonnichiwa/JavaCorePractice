public class Main {
    public static void main(String[] args) {
        // p 174 : AirCon 객체의 사용 예시
        AirCon airCon = new AirCon();

        // 변수 사용
        airCon.color = "white";
        airCon.temp = 10;
        airCon.price = 10000;

        // 메소드 사용
        airCon.upTemp();
        System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = " + airCon.price + "원 ");
        airCon.onPower();
        airCon.offPower();
        airCon.downTemp();
        System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = " + airCon.price + "원 ");
    }
}
