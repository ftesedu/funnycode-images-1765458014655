LLNode* addLinkedList(LLNode* l0, LLNode* l1){
    int du = 0;
    if(l0 == NULL && l1 == NULL) return NULL;
    LLNode* res = NULL;
    LLNode* current = NULL;
    int sum = 0;
    while(l0 != NULL || l1 != NULL){
        sum = du;
        if(l0 != NULL){
            sum += l0->val;
            l0 = l0->next;
        }

        if(l1 != NULL){
            sum += l1->val;
            l1 = l1->next;
        }
        
        du = sum/10;
        sum %= 10;

        LLNode* newNode = new LLNode(sum, NULL);
        if(res == NULL){
            res = current = newNode;
        }else{
            current->next = newNode;
            current = current->next;
        }
    }
    if(du != 0){
        current->next = new LLNode(du, NULL);
    }
    return res;
}