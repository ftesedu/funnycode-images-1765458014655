template<class T>
T DLinkedList<T>::get(int index) {
    /* Give the data of the element at given index in the list. */
    if(index < 0 ||  index >= this->count){
        throw std::out_of_range("Out of range");
    }
    Node* tmp = this->head;
    for(int i = 0; i < index; i++){
        tmp = tmp->next;
    }
    return tmp->data;
}

template <class T>
void DLinkedList<T>::set(int index, const T& e) {
    /* Assign new value for element at given index in the list */
    if(index < 0 ||  index >= this->count){
        throw std::out_of_range("Out of range");
    }
    Node* tmp = this->head;
    for(int i = 0; i < index; i++){
        tmp = tmp->next;
    }
    tmp->data = e;
}

template<class T>
bool DLinkedList<T>::empty() {
    /* Check if the list is empty or not. */
    if(this->count == 0) return true;
    else return false;
}

template<class T>
int DLinkedList<T>::indexOf(const T& item) {
    /* Return the first index wheter item appears in list, otherwise return -1 */
    Node* tmp = this->head;
    for(int i = 0; i < this->count; i++){
        if(tmp->data == item){
            return i;
        }
        tmp = tmp->next;
    }
    return -1;
}

template<class T>
bool DLinkedList<T>::contains(const T& item) {
    /* Check if item appears in the list */
    if(this->indexOf(item) != -1) return true;
    else return false;
    
}