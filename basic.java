// hi ssh

//33333333333333333333333333333333333333333333333333333  array as an argument 33333333333333333333

// public class arraycc {
//     public static void update_arr(int marks[]) {
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
        
//     }
//     public static void main(String[] args) {
//         int marks[] = {89,95, 99};
//         update_arr(marks);

//         // for printing the marks value
//         for(int i=0; i<marks.length; i++){
//             System.out.println(marks[i]+ " ");
//         }
//     }
    
// } 

// 33333333333333333333333333333333  key find 33333333333333333333333333333333333333333333333

// public class arraycc {

//     public static int linear_search(int num[], int key) {
//         for (int i=0; i<num.length; i++){
//             if(num[i]==key){
//                 return i;
//             }
//         }
//         return -1;   
//     }

//     public static void main(String[] args) {
//         int num [] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 8;
//         int ind = linear_search(num, key);
//         System.out.println(ind);

//     }
// }

// ####### ########## ######## #######  largest and smallest of the arr ######### ########## ######### ############

// public class arraycc {

//     public static int largest(int arr[]) {
//         // int larg = Integer.MIN_VALUE;      // for largest
//         int small = Integer.MAX_VALUE;
//         for(int i=0; i<arr.length; i++)
//         {
//             // if(arr[i]>larg){       // largest
//             //     larg = arr[i];
//             // }

//             if (arr[i]<small){
//                 small = arr[i];
//             }
//         }
//         // return larg;    // largest
//         return small;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6};
//         int elem = largest(arr);
//         System.out.println(elem);
//     }
// }

// ####### ########## ######## #######  reverse of the arr ######### ########## ######### ############

// public class arraycc {
//     public static void reverse(int num[]) {
//         int first = 0;
//         int last = num.length-1;

//         while(first<last){
//             //swap
//             int temp= num[first];  //ind
//             num[first]= num[last];
//             num[last] = temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//         int num[] = {1, 2, 3, 4, 5};
//         reverse(num);

//         for(int i=0; i<num.length; i++){
//             System.out.print(num[i]+ " ");
//         }
//         System.out.println("next");
//     }
//}
// ####### ########## ######## ####### print all the pairs ######### ########## ######### ############

//  public class arraycc {
//     public static void printpair(int number[]) {
//         for(int i=0; i<number.length;i++){
//             int curr=number[i];
//             for(int j=i+1; j<number.length;j++){
//             System.out.print ("("+curr+","+number[j]+")");

//             }System.out.println();
//         }
        
//     }


//     public static void main(String[] args) {
//         int number[]={2,3,4,5};
//         printpair(number);
        
//     }
//  }
// ####### ########## ######## #######  Smallest ######### ########## ######### ############
// public class arraycc {
//     public static int getsmallest(int numbers[]) {
//         int smallest=Integer.MAX_VALUE;
//        for ( int i=0;i<numbers.length;i++){
//         if(smallest>numbers[i]){
//             smallest=numbers[i];
//         }
//        }
//        return smallest;
//     }

//     public static void main(String[] args) {
//         int numbers[]={6,9,7,4,2};
//         System.out.println(getsmallest(numbers));
        
//     }
// }
// ####### ########## ######## #######  print sub arrays ######### ########## ######### ############
// public class arraycc {
//     public static void printallsubarrays(int arr[] ){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++ ){
//                 for(int k=i;k<=j;k++){
                    
//                     // System.out.println(printallsubarrays(arr));
//                      System.out.print(arr[k] + " ");
//                 }
//             }
//             System.out.println(" ");
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr[]={ 1,2,3,4,5,6};
//         printallsubarrays(arr);
//     }
// }
// ####### ########## ######## #######  print sub arrays by bruite force approch  ######### ########## ######### ############
// public class arraycc {
//     public static void printmaxsum(int numbers[]) {
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i;j<numbers.length;j++){
//                 currsum=0;
//                 // System.out.println("1 currsum"+ " "+currsum);
//                 for(int k=i;k<=j;k++){
//                     currsum+=numbers[k];
//                 }
//                 // System.out.println("2nd currsum"+ " " +currsum);
//                 if(maxsum<currsum){
//                     maxsum=currsum;
//                 }
                
//             }
//         }
//          System.out.println("max is :" + maxsum);
//     }

//     public static void main(String[] args) {
//         int numbers[]={1,2,3,4};
//         printmaxsum(numbers);

        
//     }
// }
// ####### ########## ######## #######  print sub arrays by kadans   ######### ########## ######### ############
// public class arraycc {
//     public static void kadans(int numbers[]) {
//         int cs=0;
//         int ms=Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             cs =cs+numbers[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("max sum is:" + ms);
        
//     }

//     public static void main(String[] args) {
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//         kadans(numbers);
      
        
//     }
// }

// 
// ####### ########## ######## #######  Assignment of Array ######### ########## ######### ############


// public class basic {
//     public static boolean check_duplicate(int arr[]) {
//         for(int i=0; i<=arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]==arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4};
//         System.out.println(check_duplicate(arr));
//     }
// }

//              --------------------- optimized way for duplicate ----------------------

// import java.util.HashMap;
import java.util.HashSet;

public class basic {
    public static boolean check_duplicate(int arr[]) {
        
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i=0; i<=arr.length; i++){
            if(duplicate.contains(arr[i])){
                return true;
            }else{
                duplicate.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2}; // example input
        System.out.println(check_duplicate(arr));
    }
}


