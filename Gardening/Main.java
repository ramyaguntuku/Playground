




#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  if((n>r && n<=r*2)||(n>r*(c-2) && n<=r*(c-1)))
  {
    cout<<"It is an orange tree";
  }
  else
  {
    cout<<"It is not an orange tree";
  }
}