package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // 1
        // int / int 형태로 나누기가 되기 때문에 3 /2 -> 1의 결과가 나옴
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;  // 1.0
        // 마찬가지로 3과 2가 int 형태이기에 1.0이라는 결과가 나옴
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 1.5
        // 3.0을 double로 인식하기에 2가 2.0으로 (double) 형변환이 이루어지기에 1.5라는 값이 나옴 
        System.out.println("div3 = " + div3);
        
        double div4 = (double) 3 / 2; // 1.5
        // (double)로 선언했기에 3은 3.0 / 2는 2.0으로 형변환 되어 1.5라는 값이 나옴
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5

        /* 2가지 원칙 기억 !
        1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다. */
    }
}
