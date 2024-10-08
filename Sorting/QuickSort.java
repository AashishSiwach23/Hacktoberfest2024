public class QuickSort {
    
    // Function to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find pivot element such that elements smaller than pivot are on the left
            // and elements greater than pivot are on the right
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort the left and right partitions
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    // Partition function
    private static int partition(int[] array, int low, int high) {
        // Pivot element (you can pick first, last, or middle element)
        int pivot = array[high];
        int i = (low - 1);  // Index of smaller element
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;  // Return the partition index
    }
    
    // Helper function to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    // Main function
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;
        
        System.out.println("Original array:");
        printArray(array);
        
        quickSort(array, 0, n - 1);
        
        System.out.println("Sorted array:");
        printArray(array);
    }
}
