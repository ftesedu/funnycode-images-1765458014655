#include <iostream>
#include <algorithm> 
#include <vector>
#include <iomanip>
using namespace std;
int main(){
int n;
float tong=0;
cin >>n;
for (int i=1;i<=n;i++)
	{	tong+=1.0/i;
	}
cout<<fixed<<setprecision(3)<<tong;
return 0;


}
	
	
	
	

