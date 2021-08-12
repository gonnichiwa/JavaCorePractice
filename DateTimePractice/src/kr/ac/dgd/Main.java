package kr.ac.dgd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 책 p365의 날짜 관련 클래스를 대신하여 작성해보는 날짜, 시간 데이터의 java 핸들링을 예제로 쳐봄.
public class Main {

    public static void main(String[] args) {
        System.out.println("DateTimePractice---");
        // 현재 날짜 출력
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // 날짜를 직접 지정
        LocalDate targetDate = LocalDate.of(2021, 8, 31);
        System.out.println(targetDate);

        // 현재 시간 출력
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        // 시간을 직접 지정
        LocalTime targetTime = LocalTime.of(12,33,55,12); // 0.000000012
        System.out.println(targetTime);

        // 현재 날짜 & 시간
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // 날짜 & 시간을 직접 지정
        LocalDateTime targetDateTime = LocalDateTime.of(2019,11,12,13,22,33,222);
        System.out.println(targetDateTime);

        // String date(dbms에서 가져온 값)를 LocalDateTime으로 바꿀려면?
        String date = "2021-08-11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println("parsedDate=" + parsedDate);

        String date2 = "2019-11-12T12:30:54";
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse(date2);
        System.out.println("parsedLocalDateTime="+parsedLocalDateTime);

    }
}
