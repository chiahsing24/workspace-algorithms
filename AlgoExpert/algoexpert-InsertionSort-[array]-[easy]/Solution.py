def insertionSort(array):
    if len(array) < 2:
        return array

    for i in range(1, len(array)):
        curVal = array[i]
        targetIndex = i
        for j in range(i - 1, -1, -1):
            if (array[j] > curVal):
                array[j + 1] = array[j]
                targetIndex = j

        array[targetIndex] = curVal

    return array