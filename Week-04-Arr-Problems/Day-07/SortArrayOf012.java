public class SortArrayOf012 {
    static void sortArrayBrute(int nums[]) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count0++;
            if (nums[i] == 1)
                count1++;
            if (nums[i] == 2)
                count2++;
        }
        int i = 0;
        while (count0 > 0) {
            nums[i] = 0;
            count0--;
            i++;
        }
        while (count1 > 0) {
            nums[i] = 1;
            count1--;
            i++;
        }
        while (count2 > 0) {
            nums[i] = 2;
            count2--;
            i++;
        }
    }

    static void sortArrayOptimal(int arr[]) {
        // Dutch National Flag Algorithm

        // Base Thinking :-> we will keep three pointer low , mid high , and set some
        // rules for them

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        // Rule 1 :-> 0 to low-1 everything should be zero
        // Rule 2 :-> low to mid -1 everything should be one
        // Rule 3 :-> mid to high the unsorted part will be here
        // Rule 4 :-> high+1 to n-1 everything should be 2

        // initially we have and unsorted array , then we will consider 0th idx as low
        // and mid and the last idx will be high , this will satisfy of our all of the
        // condition

        

        // now for arr[mid] there will be only three cases that we have to handle

        // 1st :-> if(arr[mid]==0) then swap arr[mid] with low and then low++ and mid++
        // 2nd :-> if arr[mid]==1 then just move mid by one idx mid++
        // 3rd :-> if arr[mid]==2 then swap with arr[high] and high--

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }

            else  {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 0,1 };
        sortArrayOptimal(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
