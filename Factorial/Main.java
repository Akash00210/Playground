#include<stdio.h>
int main()
{
	//your code here
  int n;
  unsigned long long fact=1;
  scanf("%d",&n);
  if(n==0)
    printf("1");
  else
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("%llu",fact);
}