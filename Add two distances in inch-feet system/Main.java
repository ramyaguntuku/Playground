#include<iostream>
using namespace std;
struct inft
{
  int f;
  float i;
}d1,d2,s;
int main()
{
  //Type your code here.
  cin>>d1.f>>d1.i>>d2.f>>d2.i;
  s.i=d1.i+d2.i;
  s.f=d1.f+d2.f;
  if(s.i>12.00)
  {
    s.i=s.i-12;
    s.f=s.f+1;
  }
  cout<<s.f<<"'-"<<s.i<<"\"";
}