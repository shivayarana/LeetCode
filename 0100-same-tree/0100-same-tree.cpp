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
    bool same = true;
    bool isSameTree(TreeNode* p, TreeNode* q) {
        preorder(p,q);
        return same;
    }
    private:
    void preorder(TreeNode* p,TreeNode* q){
        
        if((p != NULL && q == NULL) ||(p == NULL && q != NULL) ) same = false;
        
        if(p != NULL && q != NULL){
            
            // base case
            if(p->val != q->val){
                same = false;
                return;
                }
             preorder(p->left,q->left);
             preorder(p->right,q->right);
        }
    }
    
    
};