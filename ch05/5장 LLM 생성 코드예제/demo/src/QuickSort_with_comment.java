public class QuickSort_with_comment {

    // 퀵 정렬 메서드
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pivot을 기준으로 분할 후 pivot의 인덱스를 가져옴
            int pi = partition(arr, low, high);

            // 분할된 두 부분에 대해 재귀적으로 퀵 정렬 수행
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // 분할 메서드
    private static int partition(int[] arr, int low, int high) {
        // 피벗으로 배열의 마지막 요소를 선택
        int pivot = arr[high];
        // i는 피벗보다 작은 요소의 마지막 인덱스를 추적
        int i = (low - 1);

        // Low부터 high-1까지의 요소를 반복
        for (int j = low; j < high; j++) {
            // 현재 요소가 pivot보다 작으면
            if (arr[j] < pivot) {
                i++; // i를 증가시켜 피벗보다 작은 요소의 위치를 이동
                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 피벗을 올바른 위치에 놓기 위해 arr[i + 1]과 arr[high]를 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // 피벗의 최종 위치를 반환
        return i + 1;
    }

    // 배열 출력 함수
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 메인 함수
    public static void main(String[] args) {
        // 정렬 전 값
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        // 정렬 수행
        quickSort(arr, 0, n - 1);


        // 정렬 후 숫자 출력
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
