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
var inorderTraversal = function (root) {
    let result = [];
    if (root === null) {
        return result;
    }

    inorder(root, result);
    return result;
};

let inorder = (root, result) => {
    if (root === null) {
        return;
    }

    inorder(root.left, result);
    result.push(root.val);
    inorder(root.right, result);
};
