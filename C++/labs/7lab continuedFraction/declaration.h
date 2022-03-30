#ifndef INC_7LAB_DECLARATION_H
#define INC_7LAB_DECLARATION_H
#endif
#include <iostream>
using namespace std;

class fraction{
private:
    double x;
    double e;
    int length;
public:
    double getX() const;
    double getE() const;
    void setE(double e);
    fraction(double x_new, double e_new);
    int getLength();
    double makeRational();
    int *makeFraction();
    void cutFraction(int n);
    virtual ~fraction();
};