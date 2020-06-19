#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i,t;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
cin>>a[i];
  }
  t=a[0];
  for(i=1;i<n;i++)
  {
    if(t>a[i])
    {
      t=t;
    }
    else
      t=a[i];
}
  cout<<t;
}