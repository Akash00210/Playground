#include <stdio.h>
#include<math.h>
int main()
{
  int n,c=0;
  scanf("%d",&n);
  int last=n%10;
  //printf("%d \n",last);
  int temp=n;
  while(n>0)
  {
    c=c+1;
  n=n/10;
  }
  c=c-2;
  int x=pow(10,c);
 int first=((temp/x));
  //int sum=fisrt+last;
  printf("%d",(first%10));
  
  
  return 0;
}