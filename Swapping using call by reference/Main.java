#include<iostream>
using namespace std;
  int x,y;
int swap(int &a,int &b)
{
  x=a;
  y=b;
  cout<<"After swapping a= "<<y<<" and b="<<x<<"\n";
}
int main()
{
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
  swap(x,y);
}