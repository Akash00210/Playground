#include<stdio.h>
int main()
{
  //Type your code here
  int n,m;
  scanf("%d %d",&n,&m);
  if(n>m)
    printf("num1 is the greatest");
  if(m>n)
    printf("num2 is the greatest");
  if(n==m)
    printf("Both number are Equal");
  return 0;
}