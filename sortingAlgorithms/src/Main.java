class BubbleSort{
    /*
    Time Complexity: O(N2)
    Auxiliary Space: O(1)
    = (n-1) + (n-2) +  (n-3) + . . . 2 + 1
    = (n-1)*(n-1+1)/2  { by using sum of N natural Number formula }
    = n (n-1)/2
     */

    // Every process of sorting it gets O(N2)
    void sort(int arr[], int n){
        int i,j,temp;
        for(i=0; i<n-1;i++){
            for(j=0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    Main.swap(arr,j,j+1);
                }
            }
        }
    }

    // If it is sorted ascending order already best case O(N)
    void optimizedSort(int arr[], int n){

        boolean swapped;
        int i,j,temp;
        for(i=0; i<n-1;i++){
            swapped=false;
            for(j=0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    Main.swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    void recursiveSort(int arr[], int n){
        if(n == 0 || n == 1){
            return;
        }
        int i,temp;
        for(i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                Main.swap(arr,i,i+1);
            }
        }
        recursiveSort(arr, n-1);
    }

}
class SelectionSort{
    /*
    Time Complexity: O(N2)
    Auxiliary Space: O(1)
    for n=5  there is n-1 loops will happen
    1--->4 compare n-1
    2--->3 compare n-2
    3--->2 compare n-3
    4--->1 compare n-4 or 1
    = (n-1) + (n-2) +  (n-3) + . . . 2 + 1
    = (n-1)*(n-1+1)/2  { by using sum of N natural Number formula }
    = n (n-1)/2
    */
    void sort(int arr[], int n){
        int i,j,min_index;
        for(i=0;i<n-1;i++){
            min_index = i;
            for(j=i+1; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            Main.swap(arr,i,min_index);
        }
    }
}

class InsertionSort{
    /*
    Time Complexity: O(N2)
    Auxiliary Space: O(1)
    Insertion sort takes maximum time to sort if elements are sorted in reverse order.
    And it takes minimum time (Order of n) when elements are already sorted.
    */
    void sort(int arr[], int n){
        int i,j,key;
        for(i=1; i<n; i++){
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            // 2 3 4 1 5
        }
    }
}


public class Main {
    public static void main(String[] args) {
        /*Bubble sort test case
        int[] array = new int[]{4,9,8,1,3};
        int n = array.length;
        BubbleSort bs = new BubbleSort();
        print(array,n);
        bs.sort(array,array.length);
        bs.optimizedSort(array,n);
        bs.recursiveSort(array,n);
        print(array,n);
        */

        /*Selection Sort test case
        int[] array = new int[]{43,12,54,23,15,33,2,72};
        int n = array.length;
        SelectionSort ss = new SelectionSort();
        print(array, n);
        ss.sort(array, n);
        print(array, n);
         */

        /*Insertion Sort test case
        int[] array = new int[]{52,12,86,45,62,3,6,61,12};
        int n = array.length;
        InsertionSort is = new InsertionSort();
        print(array, n);
        is.sort(array, n);
        print(array,n);
         */


    }

    public static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}