#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[10],i,s=0,s1=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  if(a[i]%2==0)
  {
    s=s+a[i];
  }
    else
      s1=s1+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<s<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<s1;
  
}