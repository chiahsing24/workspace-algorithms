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
var postorderTraversal = function (root) {
    let result = [];
    let stack = [];
    if (root === null) {
        return result;
    }

    stack.push(root);
    while (stack.length !== 0) {
        let cur = stack.pop();
        result.unshift(cur.val);

        if (cur.left !== null) {
            stack.push(cur.left);
        }

        if (cur.right !== null) {
            stack.push(cur.right);
        }
    }

    return result;
};
