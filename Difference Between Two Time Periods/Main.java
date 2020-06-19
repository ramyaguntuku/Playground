#include<iostream>
using namespace std;
struct time
{
  int sec;
  int min;
  int hr;
};
int main()
{
  //Type your code here.
  struct time t1,t2,diff;
  cin>>t1.hr>>t1.min>>t1.sec;
   cin>>t2.hr>>t2.min>>t2.sec;
  if(t1.sec<t2.sec)
  { 
    t1.sec=t1.sec+60;
  t1.min=t1.min-1;
  diff.sec=t1.sec-t2.sec;
  }
  else
    diff.sec=t1.sec-t2.sec;
  if(t1.min<t2.min)
  {
    t1.min=t1.min+60;
   t1.hr=t1.hr-1;
   diff.min=t1.min-t2.min;
  }
  else
  {
    diff.min=t1.min-t2.min;
  }
  diff.hr=t1.hr-t2.hr;
  cout<<diff.hr<<":"<<diff.min<<":"<<diff.sec;
  return 0;
}
