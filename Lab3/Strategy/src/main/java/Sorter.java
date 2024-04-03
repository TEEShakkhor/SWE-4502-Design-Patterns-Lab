public class Sorter {
    private SortingAlgorithm sortingAlgorithm;
    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }
    public void performSort(int[] arr) {
        if (sortingAlgorithm != null) {
            sortingAlgorithm.sort(arr);
        } else {
            System.out.println("No sorting algorithm set.");
        }
    }
}
