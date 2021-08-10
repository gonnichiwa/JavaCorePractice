// 클래스 기본: java책 p 169 ~
public class AirCon {
    // 변수 정의
    String company;
    String color;
    int price;
    int size = 10; // default 값
    int temp;

    // java 언어의 규칙 : 기본 생성자, 인자가 있는 생성자를 만들면 기본생성자는 자동 비활성화 된다.
    public AirCon() {}

    // 생성자 (메소드와 같이 생겼지만 생성자의 네이밍은 클래스 네이밍과 같아야 한다 (대소문자까지))
    public AirCon(String company, String color, int price, int size, int temp){
        this.company = company;
        this.color = color;
        this.price = price;
        this.size = size;
        this.temp = temp;
    }

    // 메소드 정의
    void onPower(){
        System.out.println("power on");
    }
    void offPower(){
        System.out.println("power off");
    }
    void upTemp(){
        temp++;
    }
    void downTemp(){
        temp--;
    }
}
