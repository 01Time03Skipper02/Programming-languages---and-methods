#include "decloration.h"

template<typename T>
void Queue<T>::push(T value){
    total += value;
    node *elem = new node;
    if(flag) elem -> next = nullptr;
    if(!flag) elem -> prev = nullptr;
    elem -> value = value;
    if (head != nullptr){
        if(flag){
            elem -> prev = tail;
            tail -> next = elem;
            tail = elem;
        }
        if(!flag){
            elem -> next = head;
            head -> prev = elem;
            head = elem;
        }
    }
    else {
        if(flag) elem -> prev = nullptr;
        if(!flag) elem -> next = nullptr;
        head = tail = elem;
    }
}

template<typename T>
void Queue<T>::show(){
    node *elem;
    if(flag) elem = tail;
    if(!flag) elem = head;
    while (elem != nullptr){
        cout << elem->value << " ";
        if(flag) elem = elem -> prev;
        if(!flag) elem = elem -> next;
    }
    cout << endl;
}

template<typename T>
T Queue<T>::pop(){
    if (flag){
        total -= tail -> value;
        T a = tail->value;
        tail = tail->prev;
        tail->next = nullptr;
        return a;
    }
    if (!flag){
        total -= head -> value;
        T a = head -> value;
        head = head -> next;
        head -> prev = nullptr;
        return a;
    }
    return 0;
}

template<typename T>
bool Queue<T>::empty(){
    return head == nullptr && tail == nullptr;
}

template<typename T>
void Queue<T>::reverse(){
    if(flag) flag = !flag;
    if(!flag == false) flag = !flag;
}

template<typename T>
int Queue<T>::getTotal(){
    return total;
}

template<typename T>
bool Queue<T>::getFlag(){
    return flag;
}