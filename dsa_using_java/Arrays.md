# Rotation of Array

We are rotating array by rotating it one element at a time till k elements. This causes issue for a large rotation. Initially it has been done by using recursion. Below this is the most optimized method.

```java  
static void rotation(int[] arr, int k) {  
	if (k == 0) {  
		return;  
	}  

	int temp = arr[arr.length - 1];  
	for (int i = arr.length - 1; i > 0; i--) {  
		arr[i] = arr[i - 1];  
	}  
	arr[0] = temp;  

	rotation(arr, k - 1);  
}
```

The above code can be more optimized by initially reversing the whole array. Next we reverse the only the first k element so that we have the last k element come in the front. We end this by reversing the remaining n-k elements after the first k element. 

```java
static void reverse(int[] nums, int left, int right) {
	while (left < right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
		left++;
		right--;
	}
}

public void rotate(int[] nums, int k) {
	k = k % nums.length;
	
	if (k == 0) {
		return;
	}
	reverse(nums, 0, nums.length - 1);
	reverse(nums, 0, k - 1);
	reverse(nums, k, nums.length - 1);
}
```

# Maximum Subarray

We tackle the above problem by using kadane's algo

```java
public static int maxSubArray(int[] nums) {  
    int max_till_here = Integer.MIN_VALUE;  
    int max_ending_here = 0;  
  
    for (int i = 0; i < nums.length; i++) {  
        max_ending_here += nums[i];  
  
        if (max_ending_here > max_till_here) {  
            max_till_here = max_ending_here;  
        }  
  
        if (max_ending_here < 0) {  
            max_ending_here = 0;  
        }  
    } 
    return max_till_here;  
}
```


