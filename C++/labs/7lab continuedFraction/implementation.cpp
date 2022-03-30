#include "declaration.h"

double fraction::getX() const {
    return x;
}

double fraction::getE() const {
    return e;
}

void fraction::setE(double e) {
    fraction::e = e;
}

int fraction::getLength() {
    return this->length;
}

fraction::fraction(double x_new, double e_new) {
    x = x_new;
    e = e_new;
}

fraction::~fraction() noexcept {
    cout << "end of fraction" << endl;
}

double fraction::makeRational() {
    double res = (1 / makeFraction()[length-1]) * (10^length);
    for (int i = length-2; i >= 0; i--){
        if (i == 0){
            res += makeFraction()[i];
        } else{
            res = (1 / (makeFraction()[i] + res)) * (10^length);
        }
    }
    return res;
}

int *fraction::makeFraction() {
    int res[100];
    int H[100], Z[100];
    H[0] = x*10000;
    Z[0] = 10000;
    int length = 0;
    for(int i = 0; i < 100; i++){
        if(Z[i] == 0) break;
        else{
            res[i] = H[i] / Z[i];
            Z[i+1]=H[i]-Z[i]*res[i];
            H[i+1]=Z[i];
            length++;
        }
    }
    this->length = length;
    int *fract = new int[length];
    for(int i = 0; i < length; i++){
        fract[i] = res[i];
    }
    return fract;
}

void fraction::cutFraction(int n) {
    this->length = n;
}




