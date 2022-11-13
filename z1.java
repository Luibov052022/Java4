/**
 * Быстрая сортировка
 */
public class z1 {

  public static void main(String[] args) {
    int array[] = { 12, 2, 5, 1, 16, 3, 2, 4 };
    System.out.println("Исходный массив: ");
    printArray(array);
    System.out.println("Отсортированный массив: ");
    quickSorting(array, 0, array.length-1);
    printArray(array);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("/n");
  }

  public static void quickSorting(int[] array, int minIndex, int maxIndex) {
    if (minIndex >= maxIndex) return;
    int pivot = getPivotIndex(array, minIndex, maxIndex);
    quickSorting(array, minIndex, pivot - 1);
    quickSorting(array, pivot + 1, maxIndex);
    return;
  }

  public static int getPivotIndex(int[] array, int minIndex, int maxIndex) {
    int pivotIndex = minIndex - 1;
    for (int i = minIndex; i < maxIndex; i++) {
      if (array[i] < array[maxIndex]) {
        pivotIndex++;
        swap(array, i, pivotIndex);
      }
    }
    pivotIndex++;
    swap(array, pivotIndex, maxIndex);
    return pivotIndex;
  }

  public static void swap(int[] inputArray, int leftValue, int rightValue) {
    int temp = inputArray[leftValue];
    inputArray[leftValue] = inputArray[rightValue];
    inputArray[rightValue] = temp;
  }
}
