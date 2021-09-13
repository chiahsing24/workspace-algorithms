/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function (s) {
    let i = 0,
        j = s.length - 1;
    while (j > i) {
        let temp = s[j];
        s[j] = s[i];
        s[i] = temp;
        j--;
        i++;
    }
};
