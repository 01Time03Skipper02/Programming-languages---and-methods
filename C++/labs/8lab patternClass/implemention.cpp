#include "decloration.h"

template<typename T>
void Queue<T>::push(T value){
    total += value;
    node *elem = new node;
    elem -> next = nullptr;
    elem -> value = value;
    if (head != nullptr){
        elem -> prev = tail;
        tail -> next = elem;
        tail = elem;
    }
    else {
        elem -> prev = nullptr;
        head = tail = elem;
    }
}

template<typename T>
void Queue<T>::show(){
    node *elem = tail;
    while (elem != nullptr){
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
    tail->next = nullptr;
    return a;
}

template<typename T>
bool Queue<T>::empty(){
    return head == nullptr && tail == nullptr;
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