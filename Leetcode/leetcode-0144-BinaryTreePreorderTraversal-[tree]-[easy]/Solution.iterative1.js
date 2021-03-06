/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var preorderTraversal = function (root) {
    let result = [];
    let stack = [];
    if (root === null) {
        return result;
    }

    let cur = root;
    while (stack.length !== 0 || cur !== null) {
        while (cur !== null) {
            result.push(cur.val);
            stack.push(cur);
            cur = cur.left;
        }

        cur = stack.pop();
        cur = cur.right;
    }

    return result;
};
