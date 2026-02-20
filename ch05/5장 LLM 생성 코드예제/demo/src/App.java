public class App {

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
        // 마지막 요소를 pivot으로 선택
        int pivot = arr[high];
        int i = (low - 1); // 작은 요소들의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 pivot보다 작으면
            if (arr[j] < pivot) {
                i++;

                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot과 arr[i+1]를 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

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
