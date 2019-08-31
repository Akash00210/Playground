#include<stdio.h>
int main()
{
  //your code here
  float p;int t;
  float r;
  scanf("%f%d%f",&p,&t,&r);
  float s=(p*r*t)/100;
  printf("%.6f",s);
  return 0;
}