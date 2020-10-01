#include<iostream>
using namespace std;

int main()
{
	int s, t, a, b, m, n, i, x, y, c_apple = 0, c_orange = 0;
	cout<<"Enter the values : ";
	cin>>s>>t>>a>>b>>m>>n;
	int apple[m], orange[n];
	for(i=0;i<m;i++)
	{
		cin>>x;
		apple[i] = x;
	}
	for(i=0;i<n;i++)
	{
		cin>>y;
		orange[i] = y;
	}
	for(i=0;i<m;i++)
	apple[i] = apple[i] + a;
	for(i=0;i<n;i++)
	orange[i] = orange[i] + b;
	for(i=0;i<m;i++)
	if(apple[i]>=s && apple[i]<=t)
	c_apple++;
	for(i=0;i<n;i++)
	if(orange[i]>=s && orange[i]<=t)
	c_orange++;
	cout<<endl<<c_apple<<endl<<c_orange;
	return 0;
}
