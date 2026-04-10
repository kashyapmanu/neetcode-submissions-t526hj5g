class TreeMap {

    /*
    Creating an inner class to represent the node.
    */
    private class TreeNode {
        int key;
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    /*
    Declare the root node.
    */
    private TreeNode root;

    /*
    Constructur for the treemap will also initialize the root node.
    */
    public TreeMap() {
        this.root = null;
    }

    public void insert(int key, int val) {
        root = insertHelper(root, key, val);
    }

    private TreeNode insertHelper(TreeNode node, int key, int value) {
        if (node == null) {
            return new TreeNode(key, value);
        }

        if (key < node.key) {
            node.left = insertHelper(node.left, key, value);
        } else if(key > node.key) {
            node.right = insertHelper(node.right, key, value);
        } else {
            node.value = value;
        }

        return node;
    }

    public int get(int key) {
        TreeNode node;
        node = getNodeWithKey(root, key);
        return node == null ? -1 : node.value;
    }

    private TreeNode getNodeWithKey(TreeNode node, int key) {
        if (node == null) return null;

        if (key < node.key) {
            return getNodeWithKey(node.left, key);
        } else if (key > node.key) {
            return getNodeWithKey(node.right, key);
        } else {
            return node;
        }
    }

    public int getMin() {
        TreeNode current = root;
        if (current == null) return -1;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public int getMax() {
        TreeNode current = root;
        if (current == null) return -1;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public void remove(int key) {
       root = removeHelper(root, key);
    }

    private TreeNode removeHelper(TreeNode node, int key) {
        if (node == null) return null;
        
        if (key < node.key) {
            node.left = removeHelper(node.left, key);
        } else if (key > node.key) {
            node.right = removeHelper(node.right, key);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            TreeNode successor = findInorderSuccessor(node.right);
            node.key = successor.key;
            node.value = successor.value;
            node.right = removeHelper(node.right, successor.key);
        }

        return node;
    }

    private TreeNode findInorderSuccessor(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public List<Integer> getInorderKeys() {
        List<Integer> inorderKeys = new ArrayList<>();
        getInorderKeysHelper(root, inorderKeys);
        return inorderKeys;
    }

    private void getInorderKeysHelper(TreeNode node, List<Integer> inorderKeys) {
        if (node == null) return;
        getInorderKeysHelper(node.left, inorderKeys);
        inorderKeys.add(node.key);
        getInorderKeysHelper(node.right, inorderKeys);
    }
}
