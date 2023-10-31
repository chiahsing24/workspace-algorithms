def binarySearch(array, target):
    # Write your code here.
    left = 0
    right = len(array) - 1
    while left + 1 < right:
        mid = left + (right - left) // 2
        if target > array[mid]:
            left = mid
        else:
            right = mid

    if array[left] == target:
        return left
    elif array[right] == target:
        return right
    return -1
