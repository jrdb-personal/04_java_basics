public class DataStructureArrays {

    static int index =0;
    static char[] Alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    static char[] Letters = {'k', 'b', 'm', 'x', 'f', 'r', 'i'};

    public static void main(String[] args) {

        //binary search on arrays
        int arrIndex = myBinarySearch(Alphabet, 'e', 0, Alphabet.length);
        if (arrIndex > 0){
            System.out.println("Key was found on array index " + arrIndex);
        }

        else {
            System.out.println("Key was not found!");
        }

        //comparing arrays
        if (myArrayCompare(Alphabet, Letters)){
            System.out.println("The 2 Arrays are equal");
        }
        else {
            System.out.println("The 2 Arrays are not equal");
        }


        //sorting arrrays
        char arrSort[] = myArraySorting(Letters);
        for (int x=0; x<Letters.length; x++){
            System.out.print(arrSort[x]);
        }

    }

    public static int myBinarySearch(char[] arrSearch, char key, int min, int max){
        if (min > max){
            index = 0;
        }

        else{
            int mid = (min+(max-min)/2);

            if (arrSearch[mid] > key){
                myBinarySearch(arrSearch, key, min, mid-1);
            }

            else if (arrSearch[mid] < key){
                myBinarySearch(arrSearch, key, mid+1, max);
            }

            else {
                index = mid;
            }
        }
        return index;
    }

    public static boolean myArrayCompare(char[] arr1, char[] arr2){
        boolean isEqual = false;

        if(arr1.length == arr2.length){
            isEqual = true;
            for (int i = 0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }

    public static char[] myArraySorting(char[] arrSort){
        for (int i = (arrSort.length - 1); i >= 0; i--){
            for (int j=1; j<=i; j++){
                if (arrSort[j-1] > arrSort[j])
                {
                    char temp = arrSort[j-1];
                    arrSort[j-1] = arrSort[j];
                    arrSort[j] = temp;
                }
            }
        }
        return arrSort;
    }
}
