#include <bits/stdc++.h>
#define PI 3.14

using namespace std;

class Circle{
	protected:
		double radius;
	public:
		Circle(){
		}
		Circle(double radius){
			this->radius=radius;
		}
		double getArea(){
			return PI*radius*radius;
		}
		double getCircumference(){
			return 2*PI*radius;
		}
};

int main () {
	Circle c(7);
    cout << c.getArea() << endl;
    cout << c.getCircumference() << endl;
	return 0;
}
