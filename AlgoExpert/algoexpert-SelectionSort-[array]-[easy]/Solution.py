def selectionSort(array):
    for i in range(len(array) - 1):
        minIndex = i
        minValue = array[i]
        for j in range(i + 1, len(array)):
            if (array[j] < minValue):
                minValue = array[j]
                minIndex = j

        if (minIndex != i):
            swap(i, minIndex, array)

    return array

def swap(i, j, array):
    array[i], array[j] = array[j], array[i]