#include<stdio.h>
#define SQR(x) x*x

int main()
{
	int a, b;

	a = 0;
	b = SQR(a);
	printf("Gia tri b: %d", b);

	return 1;
}