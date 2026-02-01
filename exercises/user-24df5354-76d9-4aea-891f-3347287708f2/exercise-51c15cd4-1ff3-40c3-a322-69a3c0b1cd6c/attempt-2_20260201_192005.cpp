#include <iostream>
#include <iomanip>
using namespace std;
int swap(double *so1, double *so2)
{
	double temp=*so1;
	*so1=*so2;
	*so2=temp;
	return 0;
}
int main(){
	double a,b;
	cout<<"INPUT: ";
	cin>>a>>b;
	swap(&a,&b);
	cout << "OUTPUT: " << fixed << setprecision(2) << a << " " << b;
	return 0;

}
	
	
	
	

