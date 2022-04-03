package com.ak;

import java.util.Arrays;

//Code by Ambar Kansal
//always look for all the possibilities when you are solving a particular problem
public class BinarySearchQues {
    //Ques 1: Ceiling of a Number
    // Ceiling of a number is find the smallest element in the array which is greater than or equal to the given number
    //lets understand by this with the help of an example
    //arr=[2,3,5,9,14,16,18]

    //Ceiling(arr,target=14)=14 // the smallest integer in the array which is equal to 14 is 14 itself
    //Ceiling(arr,target=15)=16

    //Step 1: find the target element
    //Step 2: find the elements less than or equal to the target element
    //Step 3: find the smallest of all

    public static void main(String[] args) {
        int[] arr={-5,-6,0,3,4,10,56,78,999};
        int target = 1;
        int ans= ceil(arr,target);
        if (ans!=-1)
        System.out.println("The answer is: "+ans);
        else
            System.out.println("Please enter the correct element");
    }

    private static int ceil(int[] arr, int target) {
        int[] duplicate_arr=new int[arr.length];
        int index=0;
        for (int j : arr) {
            if (j >= target) {
                duplicate_arr[index] = j;
                index++;
            }
        }
        if (index==0){
            return -1;
        }
        int min=duplicate_arr[0];
        for (int i = 0; i < index; i++) {
            min=Math.min(min,duplicate_arr[i]);
        }
        return min;

    }

}

// But the above approach is not efficient , as we are using a linear search over there
// now we will apply binary search here

class Ques1{ // Question of  ceil function
    // now let's think if the Question is find the element equal to the target element then it is simply the question of binary search only
    // the only change from binary search we are making is that we are not returning the -1 here , if we are not able to find the element we are going to find the next greater element
    // if we are not able to find the element we will find the smallest greatest element next to it
    // now let suppose we are not able to find the element so , the condition of while loop violates and start will become greater than ahead , as we have to return the answer we have to return the value of start index as it is greater than the target elem

    public static void main(String[] args) {
    //let us consider an array

        int[] arr={2,3,100};
        int target =101;
        int start=0 , end=arr.length-1;
        //here we also have to include a case where the user enter a very large number present in the array
        int index = ceil(arr, target);
        int index2=floor(arr,target);
        if (index>0) System.out.println(index);
        else System.out.println("There is no such number exist in the array");
//        if (index2>0) System.out.println(index2);
//        else System.out.println("There is no such element exist in the array");


    }

    private static int floor(int[] arr, int target) {
        //the floor function will return the largest number greater than or equal to
        // All procedure are same , the only difference is, it will return end
        int start=0 , last=arr.length-1;
        int mid;
        boolean isAsc=arr[start]<arr[last];
        while (start<=last){

            mid=start+(last-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    last = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target>arr[mid]){
                    last=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }

        return last;

    }


    public static int ceil(int[] arr, int target){

        int start=0 , last=arr.length-1;
        int mid;
        boolean isAsc=arr[start]<arr[last];
        while (start<=last){

            mid=start+(last-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target>arr[arr.length-1]) return -1;
                if (target < arr[mid]) {
                    last = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else {

                if (target>arr[mid]){
                    last=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }

        return start;

    }

}

class Ques2{
    //find the smallest character greater than  the target character
    //Exact the same approach as ceiling af number
    //Ignore the target ==what we are going to find
    //Condition violated when we have start =end+1
    // start =end+1 -->after the condition is violated
    // so , we'll return start = start%length of array
    //Note: That the letters wrap around
    public static void main(String[] args) {
        //here in the question we are given a non-descending array
        char[] arr={
                'c','f','j'
        };
        char target ='l';
        char ans=nextGreatestLetter(arr,target);
         System.out.println(ans);




    }
    public static char nextGreatestLetter(char[] arr, char target){
        int start =0,end =arr.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (target<arr[mid]){
                end =mid-1;

            }else{
                start=mid+1;
            }
        }

        return arr[start%arr.length];// this check will cover all the case
    }
        }

class Ques3{
        // Ques: Given an array of nums sorted in ascending order , find starting and ending position of given target element
        // If target is not found in the array then return {-1,-1}
        //Algorithm must be within order of O(logn) time complexity
        //Always try to think a bruteforce solution
        // we can use binary search twice as logn+logn=2logn and constant are ignored in time complexity , so its time complexity will still be logn
        // When we'll apply binary search for the first time , there might be a possibility we will find the element in the middle , but there might be a probability there will be more such element in the left or right side , for then  we will apply binary search again
        public static void main(String[] args) {
            int[] nums={0,1,2,3,3,3,4,5,6,88};
            int target=5;
            int[] ans=new int[2];
            ans=searchRange(nums,target);
            System.out.println(Arrays.toString(ans));

        }

         public static int[] searchRange(int[] nums,int target){
             int[] ans={-1,-1};

             ans[0]=search(nums,target,true);
             if (ans[0]!=-1) {
                 ans[1] = search(nums, target, false);
             }

             return ans;
             //this function just return the index value
         }
         public static int search(int [] nums , int target,Boolean findRightIndex){
             int ans=-1;
             int start=0,end=nums.length-1;
             int mid;
             while (start<=end){
                 //mid=(start_ind+last_in)/2;
                 // but there is a problem  that integer has a fixed size
                 //there might be a possibility that start+end may exceed the range o int
                 // so ,we'll follow an approach i.e. start+(end-start)/2
                 mid=start+(end-start)/2;
                 if (target<nums[mid]){
                     end =mid-1;

                 }else if(target>nums[mid]){
                     start=mid+1;
                 }
                 else {
                     //potential answer found
                   ans=mid;
                   if (findRightIndex) end=mid-1; //checks whether there is another such target existed on the right side
                   else start=mid+1; // checks whether there are more such targets existed on the left side
                 }
             }

             return ans;
         }

        }

class Ques4{
    // find the index of element in a sorted indefinite array
    // the problem is that we don't know the last index , because it is given in the question that it is an indefinite array
    // here we will move in chunk i.e. we apply binary search on a group of values , if the element is not found in that particular chunk ,  we are going to move that chunk

        public static void main(String[] args) {
            int[] arr={0,2,3,9,15,20,21,22,45,100,150,151,2000,2001,2005,2500,30000};
            int target =30000;
            int ans=ans(arr,target);
            System.out.println("index--> "+ans);

        }
        //Note : as given in the question that the array size is infinite there will be no array out of bound condition
        // here we have to use arr.length in order to avoid array index out of bound condition
        public static int ans(int[] arr,int target){
            //first we will find in the bunch of 2
            int start =0;
            int end= 1;

            // we will check the condition that is the target element greater than start , if so we will double the size
            while(target>arr[end]){ //but there might be a possibility that the end index will reach out of bound , so
                int newStart=end+1; // this is my new start
                //now we will double the end index
                // end=end+previous*2;
                end=end+(end-start+1)*2; //here we will add 1 , because we are talking about indices
                start=newStart;
                // now don't feel upset we are using arr.length , as it is of no use if the length of array is infinite
                if (end>arr.length-1){
                    end=arr.length-1;
                }

            }

            return searchElement(arr,target,start,end);
        }

        public static int searchElement(int[] arr, int target, int start, int end) { // Case: array is sorted in ascending order

            int mid;
            while (start<=end){

                mid=start+(end-start)/2;
                if (target<arr[mid]){
                    end =mid-1;

                }else if(target>arr[mid]){
                    start=mid+1;
                }
                else {
                    return  mid;
                }
            }

            return -1;
        }




}

class Ques5{

    /*
     Ques: Calculate the peak index in a mountain array , for ex: [0,1,0];
     also known as bitonic array i.e. it is a type of array where the elements increase first attain a peak value that the element start to decrease
    Let's call an array arr a mountain if the following properties hold:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... arr[i-1] < arr[i]
    arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
    Here we are applying binary search , but we don't we have target or anything
    as the array is sorted eventually first in ascending pattern  then in descending pattern
    in case of arr[mid]<arr[mid+1] // we know that we are in the increasing part of the array , so for this we will do start=mid+1 (not start=mid) because we have found that the next element is bigger than previous one i.e. mid is greater than mid+1 , why I unnecessarily write start=mid
    but in case of arr[mid]>arr[mid+1] // we are in the decreasing part of the array , and there might be a probability that  it is the peak element , so we will do end=mid
    the loop termination condition start=end;

    */
    public static void main(String[] args) {
        int[] arr={0,10,5,2}; //bitonic array
        int peak=peakIndexMountainArray(arr);
        System.out.println("Peak elem-->"+arr[peak]);
    }
    public static int peakIndexMountainArray(int[] arr){
        int start=0,end=arr.length-1,mid;
        while (start<end){ // the loop will terminate when start=mid
             mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                //this may be the answer,but look at left
                end=mid;//this is why end!=mid-1;

            }
            else {
                start=mid+1; // because we know that mid+1 element is greater than mid element

            }
        }
        // in the end , start ==end are pointing to the largest number because of the check above
        // start and end are always try to find the max element in the above two checks
        // hence when they are both are pointing to just one element , that is the max element because of the both checks above
        //more elaboration :  at every point of time for start and end, they have the best possible answer
        //and if we are saying only that only one item is remaining , hence cuz of the above checks
        return start;


    }




}

class Ques6{
    //Find in Mountain Array
    //Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1
    //the question follows a simple approach
    //Step-->1  find the peak element
    //Step-->2 Binary search in 1st half that is in the ascending pattern
    //Step-->3 if not found then binary search in 2nd Half i.e. in Descending pattern

    public static void main(String[] args) {
        int[] arr={0,1,3,2,1,0};
        int target=2;
        int ans=ans(arr,target);
        System.out.println("index: "+ans);
    }

    public static int ans (int[] arr , int target){
        int start=0;
        int peak= peakIndexMountainArray(arr);
        //after finding the peak element , you may have a doubt that why we had applied orderAgnosticsBinarySearch here !
        // because in the second half we have an array following decreasing pattern so there is need to apply orderAgnostics binary search here
        int index=orderAgnosticsBinarySearch(arr,target,start,peak);
        if (index!=-1){
            return index;
        }
        return orderAgnosticsBinarySearch(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexMountainArray(int[] arr){
        int start=0,end=arr.length-1,mid;
        while (start<end){ // the loop will terminate when start=mid
            mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                //this may be the answer,but look at left
                end=mid;//this is why end!=mid-1;

            }
            else {
                start=mid+1; // because we know that mid+1 element is greater than mid element

            }
        }
        // in the end , start ==end are pointing to the largest number because of the check above
        // start and end are always try to find the max element in the above two checks
        // hence when they are both are pointing to just one element , that is the max element because of the both checks above
        //more elaboration :  at every point of time for start and end, they have the best possible answer
        //and if we are saying only that only one item is remaining , hence cuz of the above checks
        return start;


    }
    public static int orderAgnosticsBinarySearch(int[] arr, int target, int start, int last){
        int mid;
        Boolean isAsc=arr[start]<arr[last];
        while (start<=last){

            mid=start+(last-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    last = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target>arr[mid]){
                    last=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }

        return -1;

    }

}

class Ques7 {
    /*
    Search in a rotated sorted array
    Now what is a rotated sorted array
    suppose there is an array [2,4,5,7,8,9,10,12]
    when rotated for the first time--> [12,2,4,5,7,8,9,10] --> the element at last index came in first place i.e.at the first index
    Similarly in second rotation--> [10,12,2,4,5,7,8,9]


    Now look at the approach how we are going to this problem
    Approach 1: we'll look for the pivot(maximum element) in the array( pivot is basically where the particular is getting changed , or we can say the maximum element in the array is the pivot also we can say that pivot is the element from where the next numbers are ascending)
     [3,4,5,6,7,0,1,2]
     <------->  <---->
     Ascending  Ascending
     So , from the above array we can say that element 7 is the pivot element
     If we are able to find the pivot element then this question is a piece of cake .............
     After finding the pivot element we will apply binary search in first half and then again applying on the second half as the array is sorted


    Now the Question is how can we find the pivot element ?
    there will only be a single part of the array (containing two elements) which are in descending pattern , so when we find that mid>mid+1 element so , that is pivot for you

    After the finding the pivot element --> Apply binary Search on first half ( arr, target, start , pivot)
    If not found in first half we'll find in second half i.e. again applying binary search on the second half of the array(arr, target , pivot+1,end)

    Different cases in which we can find the pivot element
    : find the middle element :
    Case 1: If.......
    arr[mid]>arr[mid+1] // then arr[mid] is the pivot element

    Case 2: If.......
    arr[mid-1] >arr[mid] // then arr[mid-1] is the pivot element

    Case 3: If........
    arr[start] >=arr[mid] then  we will ignore all elements after arr[mid] i.e. we will increment our end value to end=mid-1;

    Case 4: if........
    arr[start]<arr[mid] then we ignore the first half values and increment start pointer to mid+1 //Note : We are not taking start =mid because if mid element is the pivot element it would be caught earlier
    Hence prove that bigger number lie ahead
    */
    public static void main(String[] args) {
        int[] arr={6,7,7,1,2,3,4,5};
        System.out.println(ans(arr,7));

    }

    public static int ans(int[] arr, int target) {

        int pivot = findPivotWithDuplicated(arr); // this function will return us the index of the pivot element

        if (pivot==-1){ //it indicates that the array is not rotated
            //just do binary search
            return BinarySearch(arr,target,0,arr.length-1);
        }
        //also
        if(arr[pivot]==target){
            return pivot;

        }
        //now there arises two cases

        //Case 0 : if the target element is greater than start
        //then we are not going to check the values before pivot i.e. our end =pivot-1
        if (target>=arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        //Case 1:Similarly when arr[start]>target element then we know all the elements from start to pivot are greater than the target , so we will update our start =pivot+2

            return BinarySearch(arr ,target,pivot+1, arr.length-1);


    }

    // this will not work for duplicate elements in array
    public static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //we have to apply four cases over here
            if (mid<end&&arr[mid] > arr[mid + 1]) // there might be a condition that array index will reach  out of bound
               return mid;
             else if (mid>start&&arr[mid - 1] > arr[mid]) { //similarly ,there might occur an outOfBound index condition
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                 //ignoring all the elements after the middle
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1; // in case no pivot element is found that is the array is not sorted

    }

//    public static int orderAgnosticsBinarySearch(int[] arr, int target, int start, int last) {
//        int mid;
//        boolean isAsc=true;
//        if (start!=last) {
//            isAsc = arr[start] < arr[last]; //there might be a condition that there is only one element in the array
//        }
//
//        while (start <= last) {
//
//            mid = start + (last - start) / 2;
//            if (target == arr[mid]) {
//                return mid;
//            }
//            if (isAsc) {
//                if (target < arr[mid]) {
//                    last = mid - 1;
//
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (target > arr[mid]) {
//                    last = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//
//            }
//        }
//        return -1;
//
//
//    }
    public static int BinarySearch(int[] arr, int target, int start, int end) { // Case: array is sorted in ascending order
        //int start_ind=0,last_ind=arr.length-1;
        int mid;
        while (start<=end){
            //mid=(start_ind+last_in)/2;
            // but there is a problem  that integer has a fixed size
            //there might be a possibility that start+end may exceed the range o int
            // so ,we'll follow an approach i.e. start+(end-start)/2
            mid=start+(end-start)/2;
            if (target<arr[mid]){
                end =mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return  mid;
            }
        }

        return -1;
    }
    public static int findPivotWithDuplicated(int[] arr) {
        //using the old approach we can't find which part of the array is sorted or which part is not
        //We can ignore as many element as we duplicate element as we want

        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //we have to apply four cases over here
            if (mid<end&&arr[mid] > arr[mid + 1]) // there might be a condition that array index will reach  out of bound
                return mid;
            if (mid>start&&arr[mid - 1] > arr[mid]) { //similarly ,there might occur an outOfBound index condition
                return mid - 1;
            }
            //if elements in middle and start are equal then just skip the duplicates
            //ignoring all the elements after the middle
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //Note: what if these elements at start and end are equal then just skip the duplicates
                //check if start is pivot or end is pivot
                if(arr[start]>arr[start+1])
                    return start;
                start++;
                //checks if the start is pivot or not
                if(arr[ end-1]>arr[end]){
                    return end-1;
                }

                end--;
            }
           //left side is sorted , so pivot should be in right
            if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[end]<arr[mid]){
                start=mid+1;
            }
            else
                //otherwise, element is present in another half
                end=mid-1;

        }
        return -1; // in case no pivot element is found that is the array is not sorted

    }
}

class Ques8{
    // Count the number of rotations in a rotational sorted array
    // the simple logic of the program is :
    //No. of Rotations = index of pivot+1
    //as index value of pivot is incremented every time it is rotated

    public static void main(String[] args) {
        int[] arr={4,5,0,1,2,3};
        System.out.println("No. of Times Array is rotated: "+findNumberOfRotations(arr));
    }

    private static int findNumberOfRotations(int[] arr) {
        int pivot=findPivot(arr);
        if (pivot!=-1) {
            return pivot + 1; // the index+1 denotes no. of times the pivot value is rotated
        }
        return pivot;
    }
    public static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //we have to apply four cases over here
            if (mid<end&&arr[mid] > arr[mid + 1]) // there might be a condition that array index will reach  out of bound
                return mid;
            else if (mid>start&&arr[mid - 1] > arr[mid]) { //similarly ,there might occur an outOfBound index condition
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                //ignoring all the elements after the middle
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1; // in case no pivot element is found that is the array is not sorted

    }
}

class Ques9{
    //  ****important question
    //  Split Array Largest Sum
    //  Given an array nums which consists of non-negative integers and an integer n , you can split the array into non-empty continuous array
    //  Write an algorithm to minimize the largest sum among n subarrays
    //  we have to divide array in such a  contiguous manner that sum of the elements inside should be minimum in that
    //  here no. of partitions = m-1(where m denotes the number of subarrays)
    //  Now the question is what is the maximum no. of partitions does the array have == n(size of the array)
    //    in case 1: f m=1 , result is the sum of the whole array
    //    in case 2:  of array having maximum divisions , the result is the maximum element of one of the subarray
    // Maximum value of answer of question == case 1
    // Minimum value of answer of question == case 2
    //  minAns=max value in array
    //  maxAns=Sum of all values in array
    // So , here we have a range of maximum and minimum sum
    // our possible answer has either maximum answer and minimum answer or something between this range
    //  [10,32] --> start =10 , end =32
    //  middle =(s+e)/2 -->21 might be a possible answer
    // try to see if you ccn split the array with 21 as the largest sum
    //   for example in array 7,2,5,8,10
    //  [7,2,5] ,[8,10] ---> total pieces are two
    // if (pieces <=m)
    //  here we are going to make a check on pieces <m
    //  if pieces are less than m , the reason is individual pieces sum is more
    //  if we have to divide in the pieces specifies , the individual pieces sum should be greater or larger
    //  here we apply binary search in this case
    //  we'll say don't take 21 take something less
    //  *Most of the type of questions like this i.e. when we have to find the potential answer in range , we'll use Binary search
    //  thus it is a range of number all which are sorted , so we'll use binary search
    //  till , now the largest individual sum is 21 which divides the array into two pieces, but we want more pieces, so we'll reduce our potential answer
    //  now we reduced 21 by updating end==mid
    //  now s=10 , end=21
    //  new mid=15
    //   now we'll create the subarrays
    // [7,2,5] [8] [10] --> no. of pieces ==3
    // we have to take a sum greater than 15
    // now start =mid+1 i.e. 16 and end =21
    // new middle =16+21/2=18
    // [7,2,5] ,[8,10] -->pieces =2
    // while pieces<=n , new end=mid
    // s=16  , end =18
    // mid =17
    // [7,2,5],[8],[17] -->pieces =3
    // more piece I, have to increase the size
    // s=mid+1 =18  end=18
    // mid=18
    // so there are two checks , check 1: when pieces <=m  , end =mid
    //                           check 2: when piece >m , then s=mid+1
    public static void main(String[] args) {
       int[] arr={7,2,5,10,8};
       int m=2;
        System.out.println(splitArray(arr,m));
    }
    public static int splitArray(int[] nums , int m){
        int start =0;
        int end=0;


        for (int i = 0; i <nums.length; i++) {
            start=Math.max(start,nums[i]);//in the end of the loop this will contain the max element
            end+=nums[i];

        }
        //binary search
        while (start<end) {
            int sum = 0;
            //try for the middle as the potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this maximum sum
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //you can not add in this subarray make a new one
                    //say you add this number in new subarray then sum=num
                    sum = num;
                    pieces++;
                } else
                    sum += num;
            }
           if (pieces>m){
               start=mid+1;

           }else end=mid;




        }
        return end;//here in this case start=end
    }
}


// this is just the basics , practise more Questions











