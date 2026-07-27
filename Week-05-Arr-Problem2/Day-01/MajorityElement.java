import java.util.HashMap;

public class MajorityElement {
    static int getMajorityElBrute(int arr[]){
        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(++count > n/2){
                return arr[i];
            }
            
        }
        return -1;

        //time complexity of it is O(n^2)
    }

    static int getMajorityElBetter(int arr[]){
        int n= arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }

        return -1;

        //now the time complexity is O(n) but we are using extra space 
    }

    static int getMajorityElOptimal(int arr[]){
        //Moor's Voting Algorithm
        int el=arr[0];
        int count=0;

        //in this algo we will keep an el and a counter  , increase it if the arr[i]==el , and decrease if not ,and one more thing here that if count becomes zero then we will change our element to the next element

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==el){
                count++;
            }else{
                count--;
            }

            if(count==0){   
                el=arr[i+1];
            }

        }


        //in some cases the output might be wrong , if there is not any majority el in the array, so we have to verify it
        
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==el){
                cnt++;
            }
        }

        if(cnt>arr.length/2){
            return el;
        }


        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,2,1,1,1,2,2};
        System.out.println(getMajorityElOptimal(arr));
    }
}
