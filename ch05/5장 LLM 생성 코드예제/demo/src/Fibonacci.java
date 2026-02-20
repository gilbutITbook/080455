public class Fibonacci {

    // 동적 프로그래밍을 위한 배열
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 50; // 예시로 50번째 피보나치 수를 계산
        fibonacciCache = new long[n + 1];

        System.out.println(n + "번째 피노나치 수: " +  fibonacci(n));
    }

    public static long fibonacci(int n) {
        // 기저 조건
        if (n <= 1) {
            return n;
        }

        // 이미 계산된 값이면 캐시에서 반환
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        // 새로운 값 계산 및 캐시에 저장
        fibonacciCache[n] = fibonacci(n - 1) + fibonacci(n - 2);
        
        return fibonacciCache[n];
    }
}