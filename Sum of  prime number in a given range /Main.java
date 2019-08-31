#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n,c=0,j,i,sum=0;
  scanf("%d",&n);
  for(j=1;j<=n;j++)
  {{
  for(i=1;i<=n;i++)
   {
    if(j%i==0)
      c++;
  }
  if(c==2)
    sum=sum+j;
  }c=0;}
  printf("%d",sum);
   return 0;
}