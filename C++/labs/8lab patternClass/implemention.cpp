#include "decloration.h"

template<typename T>
void Queue<T>::push(T value){
    total += value;
    node *elem = new node;
    elem -> next = NULL;
    elem -> value = value;
    if (head != NULL){
        elem -> prev = tail;
        tail -> next = elem;
        tail = elem;
    }
    else {
        elem -> prev = NULL;
        head = tail = elem;
    }
}

template<typename T>
void Queue<T>::show(){
    node *elem = tail;
    while (elem != NULL){
        cout << elem->value << " ";
        elem = elem->prev;
    }
    cout << endl;
}

template<typename T>
T Queue<T>::pop(){
    total -= tail->value;
    T a = tail->value;
    tail = tail->prev;
    tail->next = NULL;
    return a;
}

template<typename T>
bool Queue<T>::empty(){
    return head == NULL && tail == NULL;
}

template<typename T>
void Queue<T>::reverse(){
    node *buf = tail;
    tail = head;
    while(head != buf){
        head = head->next;
        swap(head->prev->prev, head->prev->next);
    }
    swap(head->next, head->prev);
}

template<typename T>
int Queue<T>::getTotal(){
    return total;
}