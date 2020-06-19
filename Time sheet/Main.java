#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thu,fri,sat;
  sun<=24;
  mon<=24;
  tue<=24;
  wed<=24;
  thu<=24;
  fri<=24;
  sat<=24;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  int t1,t2,t3,t4,t5,t6,t7;
  if(sun>8){
    int p=800+(sun-8)*15;
     t1=p+50*p/100;
  }
  else
    t1=100*sun+sun*50;
  if(sat>8){
   int p1=800+(sat-8)*15;
    t2=p1+25*p1/100;
  }
  else
    t2=sat*100+25*sat;
  if(mon>8){
  t3=100*mon+(mon-8)*15;
  }
  else
    t3=100*mon;
  if(tue>8){
    t4=100*tue+(tue-8)*15;
  }
  else
    t4=100*tue;
  if(wed>8){
    t5=100*wed+(wed-8)*15;
  }
  else
    t5=100*wed;
  if(thu>8){
     t6=100*thu+(thu-8)*15;
  }
  else
    t6=100*thu;
  if(fri>8){
      t7=100*fri+(fri-8)*15;
  }
  else
    t7=100*fri;
 
  int T=mon+tue+wed+thu+fri;
  int Amount=t1+t2+t3+t4+t5+t6+t7;
  if(T>40)
    cout<<Amount+(T-40)*25;
   
  else
    cout<<Amount;
  return 0;
}