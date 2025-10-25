public class Assignment3 {
    private static int range(int[] array) {
        if(array.length ==0){
            return 0;
                      }
        int min = array[0];
        int max = array[0];
        for(int i =0; i<array.length; i++){
                    if(array[i]<min){
                       min = array[i];
                   
                    }else if(array[i]>max){
                        max = array[i];
                    }
         
              }
        return max-min;
    }

    private static int frequency(int[] array, int key) {
        if(array.length == 0){
        return 0;
        }
       
        int frq = 0;
       
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
            frq++;
            }
       
        }
        return frq;
    }

    private static boolean isSorted(int[] array) {
       
        if(array.length <= 1){
        return  true;
        }
        for(int i = 0; i< array.length-1; i++){
            if(array[i]>array[i+1]){
            return  false;
           
            }
           
       
        }
        return true;
    }

    private static void reverse(int[] array) {
    for(int i = 0; i< array.length/2; i++){
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        }    
   
    }

    private static void rotateRight(int[] array) {
        if(array.length == 0){
        return ;
        }
        int lastValue = array[array.length- 1];
        for(int i = array.length - 1; i > 0; i--){
        array[i] = array[i-1];  
        }
        array[0] = lastValue;
    }

    private static void gnomeSort(int[] array) {
       int i = 0;
       while(i<array.length){
        if(i==0|| array[i] >= array[i-1]){
        i++;
        }
        else{
        int temp = array[i];
        array[i] = array[i-1];
        array[i-1] = temp; 
        i--;}
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length]; 
        for(int i = 0; i<a.length; i++){
        c[i]=a[i];
        
        }
        
        for(int i = 0; i<b.length; i++){
        c[a.length+i] = b[i]; 
        }
        
        return c; 
    }

    private static boolean hasSubsequence(int[] array, int[] sequence) {
        int[] A = array; 
        int[] S = sequence; 
        
        for(int i = 0; i <=(A.length-S.length); i ++){
        boolean found = true; 
        for(int j = 0; j<S.length; j++){
            if(A[i+j]!= S[j]){
                 found = false; 
                 break; 
            }
        }
        if( found == true){
        return true; 
        }
        }
        return false; 
    }

    // DO NOT MODIFY ANYTHING BELOW THIS LINE
    public static void main(String[] args) {
        System.out.println("Range Tests:");
        System.out.println(range(new int[] { 1, 2, 3, 4, 5 }) == 4);
        System.out.println(range(new int[] { 1, 1, 1, 1, 1, 1, 1 }) == 0);
        System.out.println(range(new int[] { -10, 0, 10, 20, 30 }) == 40);
        System.out.println(range(new int[] { 5 }) == 0);
        System.out.println(range(new int[] { 8, 6, 4, 2, 0, 7, 3, 5, 1 }) == 8);

        System.out.println("\nFrequency Tests:");
        System.out.println(frequency(new int[] { 1, 2, 3 }, 2) == 1);
        System.out.println(frequency(new int[] { 1, 2, 2, 3, 3, 3 }, 2) == 2);
        System.out.println(frequency(new int[] { 4, 8, 12, 16 }, 5) == 0);
        System.out.println(frequency(new int[] { 4 }, -4) == 0);
        System.out.println(frequency(new int[] { 7, 7, 7, 7 }, 7) == 4);

        System.out.println("\nIs Sorted Tests:");
        System.out.println(isSorted(new int[] { 1, 2, 3, 4, 5 }) == true);
        System.out.println(isSorted(new int[] { 5, 4, 3, 2, 1 }) == false);
        System.out.println(isSorted(new int[] { 1, 1, 1, 1 }) == true);
        System.out.println(isSorted(new int[] { 8 }) == true);
        System.out.println(isSorted(new int[] { 1, 3, 2, 4, 5 }) == false);

        System.out.println("\nReverse Tests:");
        int[] arr1 = { 1, 2, 3, 4, 5 };
        reverse(arr1);
        System.out.println(java.util.Arrays.equals(arr1, new int[] { 5, 4, 3, 2, 1 }));
        int[] arr2 = { 1, 2, 3, 4 };
        reverse(arr2);
        System.out.println(java.util.Arrays.equals(arr2, new int[] { 4, 3, 2, 1 }));
        int[] arr3 = { 1 };
        reverse(arr3);
        System.out.println(java.util.Arrays.equals(arr3, new int[] { 1 }));
        int[] arr4 = {};
        reverse(arr4);
        System.out.println(java.util.Arrays.equals(arr4, new int[] {}));
        int[] arr5 = { 1, 2 };
        reverse(arr5);
        System.out.println(java.util.Arrays.equals(arr5, new int[] { 2, 1 }));

        System.out.println("\nRotate Right Tests:");
        int[] arr6 = { 1, 2, 3, 4, 5 };
        rotateRight(arr6);
        System.out.println(java.util.Arrays.equals(arr6, new int[] { 5, 1, 2, 3, 4 }));
        int[] arr7 = { 1, 2, 3, 4 };
        rotateRight(arr7);
        System.out.println(java.util.Arrays.equals(arr7, new int[] { 4, 1, 2, 3 }));
        int[] arr8 = { 1 };
        rotateRight(arr8);
        System.out.println(java.util.Arrays.equals(arr8, new int[] { 1 }));
        int[] arr9 = { 1, 2, 2, 3, 3, 3 };
        rotateRight(arr9);
        System.out.println(java.util.Arrays.equals(arr9, new int[] { 3, 1, 2, 2, 3, 3 }));
        int[] arr10 = {};
        rotateRight(arr10);
        System.out.println(java.util.Arrays.equals(arr10, new int[] {}));

        System.out.println("\nGnome Sort Tests:");
        int[] arr11 = { 5, 3, 2, 4, 1 };
        gnomeSort(arr11);
        System.out.println(java.util.Arrays.equals(arr11, new int[] { 1, 2, 3, 4, 5 }));
        int[] arr12 = { 1, 2, 3, 4, 5 };
        gnomeSort(arr12);
        System.out.println(java.util.Arrays.equals(arr12, new int[] { 1, 2, 3, 4, 5 }));
        int[] arr13 = { 3, 3, 2, 1, 2 };
        gnomeSort(arr13);
        System.out.println(java.util.Arrays.equals(arr13, new int[] { 1, 2, 2, 3, 3 }));
        int[] arr14 = { 1 };
        gnomeSort(arr14);
        System.out.println(java.util.Arrays.equals(arr14, new int[] { 1 }));
        int[] arr15 = {};
        gnomeSort(arr15);
        System.out.println(java.util.Arrays.equals(arr15, new int[] {}));

        System.out.println("\nMerge Tests:");
        int[] merged1 = merge(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
        System.out.println(java.util.Arrays.equals(merged1, new int[] { 1, 3, 5, 2, 4, 6 }));
        int[] merged2 = merge(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6, 7, 8 });
        System.out.println(java.util.Arrays.equals(merged2, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
        int[] merged3 = merge(new int[] {}, new int[] { 1, 2, 3 });
        System.out.println(java.util.Arrays.equals(merged3, new int[] { 1, 2, 3 }));
        int[] merged4 = merge(new int[] { 1, 2, 3 }, new int[] {});
        System.out.println(java.util.Arrays.equals(merged4, new int[] { 1, 2, 3 }));
        int[] merged5 = merge(new int[] {}, new int[] { 1, 2, 3, 4, 5 });
        System.out.println(java.util.Arrays.equals(merged5, new int[] { 1, 2, 3, 4, 5 }));

        System.out.println("\nHas Subsequence Tests:");
        System.out.println(hasSubsequence(new int[] { 1, 2, 3, 4, 5 }, new int[] { 2, 3 }) == true);
        System.out.println(hasSubsequence(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 5 }) == false);
        System.out.println(hasSubsequence(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3 }) == true);
        System.out.println(hasSubsequence(new int[] { 1, 2, 3, 4, 5 }, new int[] { 6 }) == false);
        System.out.println(hasSubsequence(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 }) == true);
    }
}
