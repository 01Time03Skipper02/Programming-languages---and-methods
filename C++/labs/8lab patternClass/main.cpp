#include "implemention.cpp"

int main(){
    Queue<int> queue;
    cout << "Is queue empty? " << queue.empty() << endl;

    cout << "Total before pushing elements: " << queue.getTotal() << endl;

    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);
    queue.push(5);
    cout << "Queue after pushing 5 elements: ";
    queue.show();

    queue.pop();
    cout << "Queue after pop: ";
    queue.show();
    cout << endl;

    time_t t;
    time(&t);
    cout << "Time before reverse: " << ctime(&t);
    queue.reverse();
    cout << "Queue after reverse: ";
    queue.show();
    cout << "Time after reverse: " << ctime(&t) << endl;

    cout << "Total after all operations: " << queue.getTotal() << endl;

    cout << "Is queue empty? " << queue.empty() << endl;

}