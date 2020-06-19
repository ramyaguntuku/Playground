#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here. 
  int tb,tr,rs,bb;
  float to,tof,crr,trr;
  cin>>tb>>tr>>rs>>bb;
  to=tb/6;
  tof=(bb/6)+((float)(bb%6)/10);
  crr=rs/tof;
  trr=tr/to;
  cout<<to<<"\n"<<tof<<"\n"<<fixed<<setprecision(1)<<crr<<"\n"<<trr;
  if(crr>=trr)
  {
    cout<<"\nEligible to Win";
  }
  else
  {
    cout<<"\nNot Eligible to Win";
  }
}