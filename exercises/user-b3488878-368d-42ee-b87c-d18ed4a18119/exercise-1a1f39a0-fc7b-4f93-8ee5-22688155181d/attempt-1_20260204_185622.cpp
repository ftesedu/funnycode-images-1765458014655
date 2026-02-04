#include <bits/stdc++.h>

using namespace std;

class Rectangle{
	protected:
		double length, width;
	public:
		Rectangle(){
		}
		Rectangle(double length, double width){
			this->length=length;
			this->width=width;
		}
		void getInformation(){
			cin >> length;
			cin >> width;
		}
		double getArea(){
			return length*width;
		}
		double getPerimeter(){
			return (length+width)*2;
		}
		void display(){
			cout << "Area: " << getArea() <<endl;
			cout << "Perimeter: " << getPerimeter() <<endl;
		}
};

int main () {
	Rectangle r;
	r.getInformation();
	r.display();
	return 0;
}
