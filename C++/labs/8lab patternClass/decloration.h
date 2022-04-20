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

    public:
        Queue() : head(nullptr), tail(nullptr), total(0){};
        void push(T value);
        void show();
        T pop();
        bool empty();
        void reverse();
        int getTotal();

};