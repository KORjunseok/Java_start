package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;
        
        if (age >= 20){
            System.out.println("성인");
        } else if (age>=17) {
            System.out.println("고딩");
        } else if (age>=14) {
            System.out.println("중딩");
        } else if (age>=8) {
            System.out.println("초딩");
        } else {
            System.out.println("미취학");
        }
    }
}
