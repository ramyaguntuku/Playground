#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,o1,o2,c=0;
  cin>>d1>>c1>>d2>>c2;
  o1=d1+d2;
  o2=c1+c2;
  if(o2>=100)
  {
    o2=o2-100;
    o1=o1+1;
  }
  cout<<o1<<"\n"<<o2;
  
  
}