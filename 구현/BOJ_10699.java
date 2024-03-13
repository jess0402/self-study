package Implementation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 24.03.13
public class BOJ_10699 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);

        System.out.println(formattedDate);

    }
}
