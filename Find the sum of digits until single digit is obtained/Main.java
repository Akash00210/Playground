#include<stdio.h>
int main()
{
  int n,r,r1,sum=0,sum1=0;
  scanf("%d",&n);
  while(n>0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  while(sum>0)
  { r1=sum%10;
   sum1+=r1;
   sum=sum/10;
  }
  printf("%d",sum1);
  return 0;
}