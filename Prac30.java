// Array Nesting

class Solution {
    public int arrayNesting(int[] nums) {
        // boolean[] visited = new boolean[nums.length];
        // HashSet<Integer> set;
        // int result = 0;
        // for(int i = 0 ; i < nums.length; i++) {
        //     set = new HashSet<>();
        //     int j = i;
        //     while(!set.contains(nums[j]) && visited[j] == false) {
        //         set.add(nums[j]);
        //         visited[j] = true;
        //         j = nums[j];
        //     }
        //     result = Math.max(set.size(), result);
        // }
        // return result;
        
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int j = i;
            int count = 0;
            while(nums[j] != -1) {
                int temp = j;
                j = nums[j];
                nums[temp] = -1;
                count++;
            }
            //System.out.println(Arrays.toString(nums));
            result = Math.max(count, result);
        }
        return result;
    }
}

// Partition Array into 3 Equal Parts

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
       for(Integer i : arr) {
           totalSum = totalSum + i;
       }
        int count = 0;
        if(totalSum % 3 != 0) {
            return false;
        } else {
            int totalBy3 = totalSum/3;
            int temp = 0;
            for(int i = 0; i < arr.length; i++){
                temp = temp + arr[i];
                if(temp == totalBy3){
                    temp = 0;
                    count++;
                    if(count == 3) {
                        break;
                    }
                }
            }
        }
        return count == 3;
    }
}