#include<stdio.h>
#define PI 3.14
int main()
{
  float r,angle;
  scanf("%f%f",&r,&angle);
  float arc=((2*PI*r)*(angle/360));
  printf("%.2f",arc);
  return 0;
}