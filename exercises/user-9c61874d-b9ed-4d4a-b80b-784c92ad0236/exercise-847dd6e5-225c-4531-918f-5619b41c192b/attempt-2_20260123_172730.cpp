#include<bits/stdc++.h>
using namespace std;
class IntSLinkedList {
public:
    class Node; // Forward declaration

private:
    Node* head;
    Node* tail;
    int count;

public:
    IntSLinkedList() : head(NULL), tail(NULL), count(0) {};
    void add(int element) {
        if(this->count == 0){
            this->head = this->tail = new Node(element);
        }else{
            Node* newNode = new Node(element);
            this->tail->next = newNode;
            this->tail = newNode;
        }
        this->count++;
    }

    void add(int index, int element) {
        if(index < 0 || index > this->count){
            throw std::out_of_range("out of range");
        }else if(index == this->count){
            this->add(element);
        }else if(index == 0){
            Node* newNode = new Node(element);
            newNode->next = this->head;
            this->head = newNode;
            this->count++;
        }else{
            Node* newNode = new Node(element);
            Node* tem = this->head;
            for(int i = 0; i < index-1; i++){
                tem = tem->next;
            }
            newNode->next = tem->next;
            tem->next = newNode;
            this->count++;
        }
    }

    int removeAt(int index) {

        return 0;
    }

    bool removeItem(int item) {

        return false;
    }

    bool empty() {
        if(this->count == 0) return true;
        else return false;
    }

    int size() {
        return this->count;
    }
    
    int get(int index) {
        return -1;
    }

    void set(int index, int element) {

    }

    int indexOf(int item) {
        return -1;
    }

    bool contains(int item) {
        return false;
    }
    
    void clear() {

    }
    
    string toString();

public:
    class Node {
    public:
        int data;
        Node* next;

    public:
        Node() : next(NULL) {};
        Node(int data) : 
            data(data), next(NULL) {};
    };
};