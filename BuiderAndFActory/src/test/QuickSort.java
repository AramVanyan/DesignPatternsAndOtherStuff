package test;

 public class QuickSort {
     protected static String description;
    public static int partition(int []arr,int low,int high){
        int pivot = arr[high-1];
        int indexOfLastHigherElementMinus1 = low-1;
        for (int i = low; i <high ; i++) {
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[++indexOfLastHigherElementMinus1];
                arr[indexOfLastHigherElementMinus1] = temp;
            }
        }
        int temp = arr[high-1];
        arr[high-1] =arr[++indexOfLastHigherElementMinus1] ;
        arr[indexOfLastHigherElementMinus1] = temp;
        return indexOfLastHigherElementMinus1;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi);
            quickSort(arr,pi+1,high);
        }
    }
}
