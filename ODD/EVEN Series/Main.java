#include<stdio.h>
int main()
{
	//type your code here
	int n,odd=0,odd1=0,k=1;
  int a[120];
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {   a[k++]=odd;
    odd=odd+2;
    }
       else 
       {
         a[k++]=odd1/2;
         odd1=odd1+2;
       }
  } printf("%d",a[n]);
  return 0;  
}