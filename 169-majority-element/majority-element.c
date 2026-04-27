int majorityElement(int* nums, int numsSize) {
    int el = 0, ct = 0;
    for(int i = 0; i < numsSize; i++){
        if(ct == 0){
            el = nums[i];
            ct = 1;
        }
        else if(nums[i] == el){
            ct++;
        }
        else{
            ct--;
        }
    }
    return el;
}