package joo.강의12;



public class MovieTicketValidator {

	
    public  void checkAge(int age) {
        if (age < 15) {
            throw new IllegalArgumentException("이 영화는 15세 이상만 관람 가능합니다.");
        }
    }
    
    
}
