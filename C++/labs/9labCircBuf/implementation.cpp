#include "decloration.h"

template<typename T>
void Queue<T>::push(T value){
    total += value;
    len++;
    node *elem = new node;
    if(flag) elem -> next = nullptr;
    if(!flag) elem -> prev = nullptr;
    elem -> value = value;
    if (head != nullptr){
        if(flag){
            elem -> prev = tail;
            tail -> next = elem;
            tail = elem;
            tail -> next = head;
        }
        if(!flag){
            elem -> next = head;
            head -> prev = elem;
            head = elem;
            head -> prev = tail;
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
        len--;
        T a = tail->value;
        tail = tail->prev;
        tail->next = nullptr;
        tail -> next = head;
        return a;
    }
    if (!flag){
        total -= head -> value;
        len--;
        T a = head -> value;
        head = head -> next;
        head -> prev = nullptr;
        head -> prev = tail;
        return a;
    }
    return 0;
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
void Queue<T>::operator<<(T value) {
    total += value;
    len++;
    node *elem = new node;
    if(flag) elem -> next = nullptr;
    if(!flag) elem -> prev = nullptr;
    elem -> value = value;
    if (head != nullptr){
        if(flag){
            elem -> prev = tail;
            tail -> next = elem;
            tail = elem;
            tail -> next = head;
        }
        if(!flag){
            elem -> next = head;
            head -> prev = elem;
            head = elem;
            head -> prev = tail;
        }
    }
    else {
        if(flag) elem -> prev = nullptr;
        if(!flag) elem -> next = nullptr;
        head = tail = elem;
    }
}

template <typename T>
void Queue<T>::operator>>(T &pop){
    pop = (*this).pop();
}

template <typename T>
T *Queue<T>::operator[](int index){
    int n = 0;
    node *elem;
    if(flag){
        elem = head;
        while (n != index){
            elem = elem->next;
            n++;
        }
    }
    if(!flag){
        elem = tail;
        while (n != index){
            elem = elem->prev;
            n++;
        }
    }
    return &elem->value;
}

template <typename T>
int Queue<T>::length() {
    return len;
}

