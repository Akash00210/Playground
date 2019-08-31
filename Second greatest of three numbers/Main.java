#include<stdio.h>
int main ()
{
  int n, b, c;
  scanf ("%d%d%d", &n, &b, &c);
  int a[10]={n,b,c};
  //int a[1]=b;
  //int a[2]=c;
  int temp=0;
  for(int i=0;i<3;i++)
  {
    for(int j=i;j<3;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }}}
    printf("%d",a[1]);
return 0;
}