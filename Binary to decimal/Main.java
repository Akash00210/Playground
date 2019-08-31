#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long n;
  int num=0,r=0,i=0;
  scanf("%ld",&n);
  while(n>0)
  {
    r=n%10;
    num=num+(r*pow(2,i));
    n=n/10;
    i++;
  }
  printf("%d",num);
  return 0;
}