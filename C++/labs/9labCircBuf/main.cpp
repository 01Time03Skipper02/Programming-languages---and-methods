#include "implementation.cpp"

int main(){
    Queue<int> queue1;

    cout << "First queue: ";

    queue1 << 1;
    queue1 << 2;
    queue1 << 3;

    queue1.show();

    Queue<int> queue2;

    cout << "Second queue: ";

    queue2 << 4;
    queue2 << 5;
    queue2 << 6;

    queue2.show();

    Queue<int> res;

    cout << "Concatenated first and second queues: ";
    res = queue1 + queue2;
    res.show();

    cout << "Concatenated second and first queues: ";
    res = queue2 + queue1;
    res.show();

    cout << "It's length of concatenated queue: " << res.length() << endl;

    int a, b;
    res >> a;
    res >> b;
    cout << "Also I can get elements from queue: " << a << " " << b << endl;
    cout << "Queue after getting elements: ";
    res.show();

    cout << "Get element link: " << res[2] << endl;
    cout << "And get element by link: " << *res[2];
}