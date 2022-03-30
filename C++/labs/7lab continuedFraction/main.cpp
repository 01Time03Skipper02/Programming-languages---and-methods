#include "declaration.h"

int main() {
    //test fraction
    fraction test(5.515211, 0.2);

    cout << endl;

    //Make rational number
    cout << "Rational number: " << test.makeRational() << endl << endl;

    //make array of fractions
    cout << "Array of fractions: [";
    for (int i = 0; i < test.getLength(); i++){
        if (i != test.getLength()-1) {
            cout << test.makeFraction()[i] << " ";
        } else {
            cout << test.makeFraction()[i];
        }
    }
    cout << "]" << endl << endl;

    //getLength
    cout << "Length of fractions: " << test.getLength() << endl << endl;

    //try to catch measurement error
    bool a = (abs((test.makeRational() - test.getX())/test.getX()))<test.getE();
    cout << "good measurement error: " << a << endl;
    test.setE(0.1);
    a = (abs((test.makeRational() - test.getX())/test.getX()))<test.getE();
    cout << "bad measurement error: " << a << endl << endl;

    //cut the fraction
    test.cutFraction(3);
    int len = test.getLength();
    cout << "Array of fractions after cut: [";
    for (int i = 0; i < len; i++){
        if (i != len-1) {
            cout << test.makeFraction()[i] << " ";
        } else {
            cout << test.makeFraction()[i];
        }
    }
    cout << "]" << endl << endl;

    return 0;
}
