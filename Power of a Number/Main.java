#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here  
  int x,n;
  int fact=1;
  scanf("%d%d",&x,&n);
  if(n<0)
    printf("Wrong input");
  else
  {
  for(int i=1;i<=n;i++)
  {
    fact=fact*x;
  }
  printf("%d",fact);
  }
    return 0;
}