class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numCount = new int[1001];
        int[] storageArray;
        int[] otherArray;
        List<Integer> output = new ArrayList<>();
        if(nums1.length > nums2.length){
            storageArray = nums1;
            otherArray = nums2;
        } else{
            storageArray = nums2;
            otherArray = nums1;
        }
        for(int i = 0; i < storageArray.length; i++){
            numCount[storageArray[i]]++;
        }
        for(int i = 0; i < otherArray.length; i++){
            if(numCount[otherArray[i]] > 0){
                output.add(otherArray[i]);
                numCount[otherArray[i]]--;
            }
        }
        int[] outputArr = new int[output.size()];
        for(int i = 0; i < output.size(); i++){
            outputArr[i] = output.get(i);
        }
        return outputArr;
    }
}