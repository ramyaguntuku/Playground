#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string name;
  int n=0;
  cin>>name;
  for(auto i=name.begin();i<name.end();i++)
    n++;
  cout<<"The number of letters in the name is "<<n;
}