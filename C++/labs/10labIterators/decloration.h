#include <iostream>
#include <vector>
#include <iterator>
#include <string>

using namespace std;

class iterString{
private:
    int k;
    string s;
public:
    iterString(int k, string s) : k(k), s(s) {};
    vector<string> iterateString();
};