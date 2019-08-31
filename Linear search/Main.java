#include<stdio.h>
int main()
{
  //Type your code here
  int n,flag=0;
  scanf("%d",&n);
  int a[20];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int x;
  scanf("%d",&x);
  for(int i=0;i<n;i++)
  {
    if(a[i]==x)
    {
      flag=i;
      break;
    }
    else continue;
  }
  if(flag==0)
    printf("%d isn't present in the array.",x);
  else
    printf("%d",flag+1);
  return 0;
}