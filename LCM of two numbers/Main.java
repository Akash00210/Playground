#include<stdio.h>
int main()
{
  //Type your code here
  int n,m,max=0;
  scanf("%d%d",&n,&m);
  max=(n>m)?n:m;
  while(1)
  {
    if(max%n==0 && max%m==0)
    {  
      printf("%d",max);
      break;
    }
    ++max;
  }
    
    
    
  return 0;
}