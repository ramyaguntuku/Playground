#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,y,r;
  float i,t,d,total;
  std::cin>>p;
  std::cin>>r;
  std::cin>>y;
  i=(p*y*r)/100;
  t=p+i;
  d=i*0.02;
  total=t-d;
  std::cout<<i<<"\n";
  std::cout<<t<<"\n";
  std::cout<<d<<"\n";
  std::cout<<total;
}