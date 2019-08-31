#include<stdio.h>
int main()
{
  //type your code here
  int a[20];
  int n,odd=1,even=1,k=0,temp=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    if(i%2==1)
    {
   temp=odd;
       odd=odd*2;
    }
    else {
      temp=even;
      even=even*3;
    }}
    printf("%d",temp);
  return 0;
}