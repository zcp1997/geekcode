class day01 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null){
            return 0;
        }
        int j = 0;
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}