public static int majorityElement4(int[] nums) {
    // Bit frequency table 
    int[] bit = new int[32];

    // Work out bit frequency
    for (int num : nums)
        for (int i = 0; i < 32; i++)   // for each bit
            if ((num & 1 << i) != 0)   // is bit i set?
                bit[i]++;              // increment frequency

    // Recreate the majority number 
    int ret = 0;
    for (int i = 0; i < 32; i++)       // for each bit   
        if (bit[i] > nums.length / 2)  // is bit i in the majority?
            ret |= 1 << i;             // mask bit i into the result
    return ret;
}