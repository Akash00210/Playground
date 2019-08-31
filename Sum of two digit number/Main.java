#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int t=n%10;
  int s=n/10;
  int su=t+s;
  printf("%d",su);
  return 0;
}