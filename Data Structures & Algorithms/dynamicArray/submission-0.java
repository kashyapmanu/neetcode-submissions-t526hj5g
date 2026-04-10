class DynamicArray {

    // Declare the necessary variables for the dynamic array.
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        // Initialize the dynamic array.
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        // Get the value at the ith index.
        return arr[i];
    }

    public void set(int i, int n) {
        // Set the value at the ith index
        arr[i] = n;
    }

    public void pushback(int n) {
        // Insert n at the last position of the array.
        if (length == capacity) {
            // If the array is full then increase the size of the array.
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        // Removing the last element in the array.
        if (length > 0) {
            // If there is no element in the array we can not remove anything.
            length--;
            // Kind of like soft delete.
        }
        // We are returning the element at that position.
        return arr[length];
    }

    private void resize() {
        // Method to double the size of the array.
        /*
        Create a new array with double the size of the 
        original array. Then copy all the elements from the original
        array into the new array. Then assign the new array to the original
        array.
        */
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
