#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,x1,y1,r,d;
  std::cin>>x;
  std::cin>>y;
  x1=3;
  y1=4;
  x=x-x1;
  y=y-y1;
  d=pow(x,2)+pow(y,2);
  r=sqrt(d);
  std::cout<<r;
}