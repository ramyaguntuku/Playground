#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,i;
  cin>>n;
  for(i=1;i<n;i++)
  {
    sum=sum+(n-i);
  }
  cout<<sum;
}