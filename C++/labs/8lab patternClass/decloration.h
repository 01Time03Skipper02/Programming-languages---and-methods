#include <iostream>
#include <string.h>
#include <time.h>

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

    public:
        Queue() : head(nullptr), tail(nullptr), total(0), flag(true){};
        void push(T value);
        void show();
        T pop();
        bool empty();
        void reverse();
        int getTotal();
        bool getFlag();
};