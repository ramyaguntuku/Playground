#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,c,x;
  cin>>n;
  for(c=0;s<n;c++)
  {
    cin>>x;
    s=s+x;
  }
  cout<<"The number of turns is "<<c;
}