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
    if (root === null) {
        return result;
    }

    postorder(root, result);
    return result;
};

let postorder = (root, result) => {
    if (root === null) {
        return;
    }

    postorder(root.left, result);
    postorder(root.right, result);
    result.push(root.val);
};
