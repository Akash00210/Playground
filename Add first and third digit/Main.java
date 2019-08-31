#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int t=n%10;
  int m=n/100;
  int sum=t+m;
  printf("%d",sum);
  return 0;
}