/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode *head;
    Solution(ListNode* head) {
        this->head = head;
    }
    
    int getRandom() {
        //  counting number of nodes
        ListNode *cur = head;
        int count = 0;
        while(cur != NULL && cur->next != NULL){
            cur = cur->next->next;
            count += 2;
        }
        if(cur != NULL) count++;
        std::random_device rd;
         std::mt19937 gen(rd());

         std::uniform_int_distribution<int> distr(1,count);

         int index =  distr(gen);
          cur = head;
         int i = 1;
         while( i < index){
            cur = cur->next;
            i++;
         }
         return cur->val;
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(head);
 * int param_1 = obj->getRandom();
 */