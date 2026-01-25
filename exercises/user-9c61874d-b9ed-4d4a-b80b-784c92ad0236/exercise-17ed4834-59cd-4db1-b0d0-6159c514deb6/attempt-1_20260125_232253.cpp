template <class T>
void DLinkedList<T>::add(const T& e) {
    /* Insert an element into the end of the list. */
    if(this->count == 0){
        this->head = this->tail = new Node(e);
    }else{
        Node* newNode = new Node(e);
        newNode->previous = this->tail;
        this->tail->next = newNode;
        this->tail = newNode;
    }
    this->count++;
}

template<class T>
void DLinkedList<T>::add(int index, const T& e) {
    /* Insert an element into the list at given index. */ 
    if(index < 0 || index > this->count){
        throw std::out_of_range("Out of range");
    }
    if(this->count == index){
        this->add(e);
    }else if(index == 0){
        Node* newNode = new Node(e);
        newNode->next = this->head;
        this->head->previous = newNode;
        this->head = newNode;
        this->count++;
    }else{
        Node* tmp = this->head;
        for(int i = 0; i < index - 1; i++){
            tmp = tmp->next;
        }
        Node* newNode = new Node(e);
        newNode->previous = tmp;
        newNode->next = tmp->next;
        tmp->next->previous = newNode;
        tmp->next = newNode;
        this->count++;
    }
}

template<class T>
int DLinkedList<T>::size() {
    /* Return the length (size) of list */ 
    return this->count;
}