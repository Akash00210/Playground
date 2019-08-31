#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  float d=((float)(b*b)-(float)(4*a*c));
  if(d>0)
  {
    float r1=(-((float)(b))+sqrt(d))/(2*a);
    float r2=(-((float)(b))-sqrt(d))/(2*a);
  printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else
    if(d==0)
    {
       float r1=(-((float)(b)))/(2*a);
       printf("root1 = %0.2f  root2 = %0.2f",r1,r1);
    }
  else 
  {
    float r1=(-((float)(b)))/(2*a);
    float i1=(sqrt(-d))/(2*a);
    printf("root1 = %0.2f + %0.2fi",r1,i1);
    printf("  root2 = %0.2f - %0.2fi",r1,i1);
  }}