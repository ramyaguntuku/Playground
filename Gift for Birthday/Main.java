
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c;
  cin>>c;
  if(c%4==0 && c%100!=0 ||c%400==0)
  {
    cout<<c<<" is a leap year";
  }
  else
  {
    cout<<c<<" is not a leap year";
  }
}

