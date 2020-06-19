#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int a;
  float b,m;
  cin>>a>>b;
  m=13.3;
  if(a>13)
  {
    if(b==m)
    {
      cout<<"$5.00";
    }
    else
      cout<<"$8.00";
  }
  else
    if(b==m)
      cout<<"$2.00";
  else
    cout<<"$4.00";
    
}