class DynamicArray {
    int[] array;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
         array[i] = n;
    }

    public void pushback(int n) {
        if (capacity == size) resize();

        array[size] = n;
        size++;
    }

    public int popback() {
        int temp = array[size - 1];
        array[size - 1] = 0;

        size--;
        return temp;
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
