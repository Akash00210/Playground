#include<stdio.h>
int main()
{
  // Type your code here
  int n1,n2,n3,n4;
  scanf("%d%d%d%d",&n1,&n2,&n3,&n4);
  int a[]={n1,n2,n3,n4};
  int temp=0;
  for(int i=0;i<4;i++)
  {
    for(int j=i;j<4;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }      }}
    printf("%d",a[0]);
    return 0;
}