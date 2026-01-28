#include <stdio.h>

int thuannghich(long long n){
	int nghich = 0;
	int temp = n;
	while ( temp > 0){
		temp != 10;
		nghich = nghich * 10 + temp;
		temp /= 10;
	}
	return nghich == n ;
}

int coso6(long long n){
	while (n > 0){
		if ( n % 10 == 6) return 1;
		n /= 10;
	}
	    return 0;
}

int tongbang8(long long n){
	int sum = 0;
	while (n > 0){
		sum += n % 10;
		n /= 10;
	}
	return sum % 10 ==8;
}
int main (){
	long long a, b;
	scanf("%lf %lf", &a , &b);
	for ( long long i = a; i <= b; i++){
		if (thuannghich(i) && coso6(i) && tongbang8(i))
		printf ("%lf", i );
	}
	return 0;
}
