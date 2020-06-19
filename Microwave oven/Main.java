#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  float t,r;
  cin>>n>>t;
  if(n==2)
  {
    r=t+(t*0.5);
    cout<<fixed<<setprecision(2)<<r;
  }
  else if(n==3)
  {
    r=2*t;
    cout<<fixed<<setprecision(2)<<r;
  }
  else
    cout<<"Number of items is more";
    
  //Type your code here.
}