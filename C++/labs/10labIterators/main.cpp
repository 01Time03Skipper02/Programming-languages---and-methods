#include "implementation.cpp"

int main() {
    string str = "0123456789";
    int k;
    cout << "Input number of digits:";
    cin >> k;
    iterString iter(k, str);
    vector<string> res = iter.iterateString();
    for (auto & re : res){
        cout << re << endl;
    }
    return 0;
}
