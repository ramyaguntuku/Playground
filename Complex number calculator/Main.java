#include<iostream>
using namespace std;
struct choice
{
  int a,b;
}d1,d2,sum;
int main(){
  int c;
  cin>>c;
  cin>>d1.a>>d1.b>>d2.a>>d2.b;
  switch(c)
  {
    case 1:sum.a=d1.a+d2.a;
      sum.b=d1.b+d2.b;
      cout<<sum.a<<"+"<<sum.b<<"i\n";
      break;
    case 2:
      sum.a=d1.a-d2.a;
      sum.b=d1.b-d2.b;
      if(sum.b>0)
      cout<<sum.a<<"+"<<sum.b<<"i\n";
      else
        cout<<sum.a<<sum.b<<"i\n";
      break;
      case 3:
      sum.a=(d1.a*d2.a)-(d1.b*d2.b);
      sum.b=(d1.b*d2.a)+(d1.a*d2.b);
      if(sum.b>0)
      cout<<sum.a<<"+"<<sum.b<<"i\n";
      else
        cout<<sum.a<<sum.b<<"i\n";
      break;
    default:
      cout<<"Invalid choice";
  }
}
  