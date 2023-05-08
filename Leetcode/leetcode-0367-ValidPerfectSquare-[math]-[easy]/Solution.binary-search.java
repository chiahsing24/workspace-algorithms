# **Valid Perfect Square**

## Question Description

![Screenshot 2023-05-07 at 6.36.20 PM.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2803b23d-ac58-44a7-92fc-7be8a4edfce2/Screenshot_2023-05-07_at_6.36.20_PM.png)

## Solutions

1. Binary Search
    
    ```java
    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num == 1) {
                return true;
            }
    
            long left = 1, right = num;
            while (left + 1 < right) {
                long mid = left + (right - left) / 2;
                if (mid * mid > num) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
    
            if (left * left == (long) num || right * right == (long) num) {
                return true;
            }
    
            return false;
        }
    }
    ```
    
2. 
    
    ```python
    
    ```
    

## Summary

```

```

## 相關連結

```

```