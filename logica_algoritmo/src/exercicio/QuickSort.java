package exercicio;

public class QuickSort {


    public void quickSort(int arr[]){
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int arr[], int begin, int end){

        if (begin < end){

            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);

        }

    }

    int partition(int arr[], int begin, int end){

        int pivot = arr[end];

        int i = begin - 1;

        for (int j = begin; j < end; j++){

            if (arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[end] = arr[i + 1];
        arr[i+1] = pivot;

        return i+1;
    }

}
