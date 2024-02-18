
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int i = 1; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        return indexOfSmallestFrom(array, 0);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        
        for(int i = startIndex + 1; i < table.length; i++) {
            if(smallest > table[i]) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
            System.out.println(array);
        }
    }
}
