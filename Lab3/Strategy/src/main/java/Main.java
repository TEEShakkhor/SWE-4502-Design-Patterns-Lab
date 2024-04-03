public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm quickSort = new QuickSort();

        int[] arr = {5, 2, 9, 1, 5, 6};

        sorter.setSortingAlgorithm(bubbleSort);
        sorter.performSort(arr);

        sorter.setSortingAlgorithm(quickSort);
        sorter.performSort(arr);
    }
}