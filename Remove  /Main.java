#include<iostream>
#include<string>
using namespace std;
void findAndReplaceAll( std::string& data, 
                        const std::string& match, 
                        const std::string& replace)
{
   // Get the first occurrence
   size_t pos = data.find(match);
 
   // Repeat till end is reached
   while( pos != std::string::npos)
    {
        data.replace(pos, match.size(), replace);
     
       // Get the next occurrence from the current position
        pos = data.find(match, pos+replace.size());
    }
}
int main()
{
  //Type your code here.
  string s;
  int i;
  string t("the ");
  getline(cin,s);
  findAndReplaceAll(s,t,"");
  cout<<s;
}
