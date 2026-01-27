#include<stdio.h>

int main(){
	int n;
	float s=0;
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		s+=1.0/i;
	}
	printf("%.3f",s);
	return 0;
	  
	
}