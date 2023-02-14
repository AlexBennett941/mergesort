

class mergesort{
    
    
    //method for mergesort
    public static void sort(int[] array){
        
        //finding length of array
        int arraylength = array.length;
        if (arraylength < 2){
            return;
        }
        int middle = arraylength / 2;
        
        //creating temp left and right arrays
        int[] left = new int[middle];
        int[] right = new int[arraylength-middle];
        //sorting the arrays
        for (int i = 0; i < middle; i++){
            left[i] = array[i];
        }
        for (int i = middle; i < arraylength; i++){
            right[i - middle] = array[i];
        }

        //recursively calling to split them further
        sort(left);
        sort(right);
        //actual merging  of the arrays
        mergeSort(array, left, right);
        

    }
    private static void mergeSort(int[] array, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        //filling in array with sorted ints
        while(i < leftSize && j < rightSize){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }
        //making sure no numbers are left out of sort
        while (i < leftSize){
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize){
            array[k] = right[j];
            j++;
            k++;
        }
    }
    


    public static void main(String[] args){
//calls
    int[] testarray = {3, 13, 5, 6, 1, 64};
    mergesort MergeSort = new mergesort();
    MergeSort.sort(testarray);
    for (int i = 0; i < testarray.length; i++){
        System.out.println(testarray[i]);
    }
    }
}