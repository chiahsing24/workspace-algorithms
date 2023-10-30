def classPhotos(redShirtHeights, blueShirtHeights):
    redShirtHeights.sort()
    blueShirtHeights.sort()
    
    return ableToTakePhoto(redShirtHeights, blueShirtHeights) or ableToTakePhoto(blueShirtHeights, redShirtHeights)

def ableToTakePhoto(backRow, frontRow):
    for i in range(len(backRow)):
        if backRow[i] <= frontRow[i]:
            return False

    return True