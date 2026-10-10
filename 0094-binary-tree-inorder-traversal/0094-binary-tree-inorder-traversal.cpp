/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    // visited queue 
    vector<int> visited;
    
    vector<int> inorderTraversal(TreeNode* root) {
        inorder(root); // call inorder 
        return visited; // return visited vector 
    }
    void inorder(TreeNode *root){
        if(root != NULL){
            inorder(root->left); // visit left subtree
            visited.push_back(root->val); // visit root
            inorder(root->right); /// visit right subtree
        }
    }
};