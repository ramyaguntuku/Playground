#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,k;
  k=0;
  cin>>n;
  do
  {
    n=n/10;
    k++;
  }
  while(n>0);
  cout<<k;
  
}