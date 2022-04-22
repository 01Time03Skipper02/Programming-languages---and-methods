#include <iostream>
#include <string.h>

using namespace std;

struct node
{
    int value;
    node *next;
    node *prev;
};


template <typename T>
class Queue{

private:
    node *head, *tail;
    int total;
    bool flag;
    int len;

public:
    Queue() : head(nullptr), tail(nullptr), total(0), flag(true), len(0){};
    void push(T value);
    void show();
    T pop();
    void reverse();
    int getTotal();
    void operator <<(T value);
    void operator >>(T& pop);
    int length();
    T *operator[] (int index);
    friend Queue operator +(Queue queue1, Queue queue2){
        Queue res;
        res = queue1;
        for (int i = 0; i < queue2.length(); i++){
            res.push(*queue2[i]);
        }
        return res;
    }
};