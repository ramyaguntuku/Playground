#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,r;
  cin>>a>>b>>c>>r;
  if(a%r==0)
    cout<<"Car 1 goes into road A";
  else if(b%r==0)
    cout<<"Car 1 goes into road B";
  else if(c%r==0)
    cout<<"Car 1 goes into road C";
  else
    cout<<"No path exist";
}