
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c,h=0;
  cin>>w>>a>>c;
  h=(75*a)+(30*c);
  if(w>=h)
    cout<<"Boat is stable";
  else
    cout<<"Boat will sink";
    
}
