def nonConstructibleChange(coins):
    # Write your code here.
    coins.sort()

    possibleVals = 0
    for i in range(len(coins)):
        print(i)
        if (coins[i] > possibleVals + 1):
            return possibleVals + 1

        possibleVals += coins[i]
    
    return possibleVals + 1
