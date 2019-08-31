#include<stdio.h>
int main()
{
  	//type your code here
  int a[20],n,max=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
 // scanf("%d\n%d",&num1,&num2);
  for(int i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  int temp=0;
 // printf("%d",max);
 
for(int i=0;i<n;i++)
{
  for(int j=i;j<n;j++)
  {
    if(a[i]<a[j])
    {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }}}
  printf("%d",a[0]);
}