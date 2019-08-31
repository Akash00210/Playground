#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int c=1;
  printf("%d \n",c);
  for(int i=1;i<n;i++)
    printf("%d \n",c+=2);
	return 0;
}