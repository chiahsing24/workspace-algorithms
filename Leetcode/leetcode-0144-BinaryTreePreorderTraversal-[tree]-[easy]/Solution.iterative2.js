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
    if (root === null) {
        return result;
    }

    let stack = [];
    stack.push(root);
    while (stack.length !== 0) {
        let cur = stack.pop();
        result.push(cur.val);

        if (cur.right !== null) {
            stack.push(cur.right);
        }

        if (cur.left !== null) {
            stack.push(cur.left);
        }
    }

    return result;
};
