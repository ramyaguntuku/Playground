#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float x;
  x=0.5;
  cin>>n;
  cout<<x<<" ";
  for(i=1;i<n;i++)
  {
    x=x*3;
    cout<<x<<" ";
  }
}