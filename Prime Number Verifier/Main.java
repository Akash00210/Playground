// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int n,c=0;
  scanf("%d",&n);
  if(n==0)
    printf("neither");
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      c++;
  }
  if(c==2)
    printf("prime");
  else
    if(c>2)
    printf("composite");
    
    
    
   return 0;
}