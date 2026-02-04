#include <bits/stdc++.h>
#define PI 3.14

using namespace std;

class Date{
	protected:
		int day, month, year;
	public:
		Date(){
		}
		Date(int day, int month, int year){
			this->day=day;
			this->month=month;
			this->year=year;
		}
		void setDate(int day, int month, int year){
			this->day=day;
			this->month=month;
			this->year=year;
		}
		void setDay(int day){
			this->day=day;
		}
		void setMonth(int month){
			this->month=month;
		}
		void setYear(int year){
			this->year=year;
		}
		int getDay(){
			return day;
		}
		int getMonth(){
			return month;
		}
		int getYear(){
			return year;
		}
		void display(){
			cout << setw(2) << setfill('0') << getDay() << "/" << setw(2) << setfill('0') << getMonth() << "/" << getYear() <<endl;
		}
};

int main () {
	Date d(1, 1, 1997);
	d.display();
	d.setDate(12, 12, 2004);
	d.display();
	d.setMonth(3);
	d.display();	
	return 0;
	return 0;
}
