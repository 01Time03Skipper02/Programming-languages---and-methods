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
    queue.reverse();
    cout << "Queue after reverse: ";
    queue.show();
    cout << "Total after all operations: " << queue.getTotal() << endl;
    cout << "Is queue empty? " << queue.empty() << endl;
}