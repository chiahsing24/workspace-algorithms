def nodeDepths(root):
    # Write your code here.
    if (root == None):
        return 0

    curDepth = 0
    depthSum = 0
    queue = []

    queue.append(root)
    while len(queue) > 0:
        size = len(queue)
        curDepth = curDepth + 1
        while size > 0:
            cur = queue.pop(0)
            if (cur.left != None):
                depthSum = depthSum + curDepth
                queue.append(cur.left)

            if (cur.right != None):
                depthSum = depthSum + curDepth
                queue.append(cur.right)

            size = size - 1

    return depthSum
    


# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None