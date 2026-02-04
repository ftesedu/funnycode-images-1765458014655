#include <bits/stdc++.h>

using namespace std;

class Student{
	protected:
		string name;
		int age;
	public:
		Student(){
		}
		Student(string name, int age){
			this->name=name;
			this->age=age;
		}
		void getInformation(){
			getline(cin, name);
			
			cin >> age;
		}
		void display(){
			cout << name <<endl;
			cout << age <<endl;
		}
};

int main () {
	Student stu;
	stu.getInformation();
	stu.display();
	return 0;
}
