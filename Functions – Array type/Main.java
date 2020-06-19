#include<iostream>
using namespace std;
int fun(int,int*);
int main()
{
  //Type your code here.
  int n,a[100],i,r;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
  cin>>a[i];
  }
  r=fun(n,a);
  if(r==1)
    cout<<"The array is Even";
  else if(r==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}
int fun(int n,int *a)
{ int c,d,e,i;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      c++;
    else 
      d++;
  }
 if(c==n)
   return 1;
 else if(d==n)
   return 2;
 else
   return 3;
}
