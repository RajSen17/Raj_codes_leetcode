import java.util.Arrays;

class largest_element {
    public static int largest(int[] arr) {
        Arrays.sort(arr); // Sorts the array in ascending order
        return arr[arr.length - 1]; // Returns the last element (largest)
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3}; // Example array
        System.out.println("The largest element is: " + largest(arr));
    }
}
