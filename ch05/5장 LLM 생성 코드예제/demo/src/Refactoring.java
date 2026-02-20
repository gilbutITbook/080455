public class Refactoring {
    public static void main(String[] args) {
        System.out.println(max(5,7));
    }

    // 리팩토링 전 코드
    public static int max(int a, int b) {
        if(a > b) {
            return a;
        } else if (a == b) {
            return a;
        } else {
            return b;
        }
    }


    // 리팩토링 후 코드
    public static int max_refactor(int a, int b) {
        return Math.max(a, b);
    }
      
}
