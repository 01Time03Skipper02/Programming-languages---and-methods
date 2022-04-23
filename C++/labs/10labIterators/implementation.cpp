#include "decloration.h"

vector<string> iterString::iterateString(){
    vector<string> res;
    for (auto iter = s.begin();iter <= s.end()-k; iter++){
        res.push_back(s.substr(iter - s.begin(), k));
    }
    /*for (int i = 0; i <= s.size() - k; i++){
        res.push_back(s.substr(i, k));
    }*/
    return res;
}