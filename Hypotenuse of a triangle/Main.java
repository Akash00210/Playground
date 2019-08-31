#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float n,m;
  scanf("%f%f",&n,&m);
  float h=((n*n)+(m*m));
  printf("%.2f",sqrt(h));
  return 0;
}