#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[15],c=0;
  while(n>0)
  {
    a[c++]=n%2;
    n=n/2;
  }
  for(int i=c-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
    return 0;
}
