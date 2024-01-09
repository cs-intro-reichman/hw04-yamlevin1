public class ArrayOps {
    public static void main(String[] args) {
        // int[] arrMissingInt = new int[] { 0, 2, 3, 1, 5 };
        // System.out.println(findMissingInt(arrMissingInt));

        //int[] arrSecondMax = new int[] {-202,48,13,7,8};
        //System.out.println(secondMaxValue(arrSecondMax));

        // int[] arrTheSameElements1 = new int[] { 3, -4, 1, 2, 5 };
        // int[] arrTheSameElements2 = new int[] { 1, 3, -4, 5 };
        // System.out.println(containsTheSameElements(arrTheSameElements1,
        // arrTheSameElements2));

        //int[] arrIsSorted = new int[] {1,3,2};
        //System.out.println(isSorted(arrIsSorted));

    }

    public static int findMissingInt(int[] array) {
        int missingNum = array[0];
        int numInArr = 0;

        for (int i = 0; i < array.length; i++) {
            if (numInArr != array[i]) {
                if (i == array.length - 1) {
                    missingNum = numInArr;
                    break;
                }
                numInArr++;
            } else {
                numInArr++;
            }
        }
        return missingNum;
    }

    public static int secondMaxValue(int[] array) {
        int max = array[0];
        int secondMax = array[0];
        int indexMax= 0;

        // finds the max value
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        // finds the second max value
        for (int i = 1; i < array.length; i++) {
            //check if the max value appears twice in the array
            if ((max == array[i]) && (indexMax != i)) {
                secondMax = array[i];
            }
            else if ((secondMax < array[i]) && (array[i] < max)) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean containsTheSameElements = false;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    containsTheSameElements = true;
                    break;
                } else {
                    containsTheSameElements = false;
                }
            }
            if (containsTheSameElements == false) {
                break;
            }
        }
        return containsTheSameElements;
    }

    public static boolean isSorted(int[] array) {
        int max = array[0];
        int min = array[0];
        boolean isSorted = false;

        for (int i = 1; i < array.length; i++) {
            //checks if the array sorted decreasingly
            if ((max >= array[i]) && (min == array[0])) {
                max = array[i];
                isSorted = true;
            }
            //checks if the array sorted increasingly
            else if ((min <= array[i]) && (max == array[0])) {
                min = array[i];
                isSorted = true;
            } 
            //checks if the array is not sorted
            else {
                isSorted = false;
            }
        }
        return isSorted;
    }
}
