#include<iostream>
using namespace std;

int minimum(int a, int b, int c)
{
    if(a < b && a < c)
    return a;
    else if(b < a && b < c)
    return b;
    else
    return c;
}

int main()
{
    int b, w, bc, wc, z, test, i, m, cost1 = 0, cost2 = 0, cost3 = 0;
    cin>>test;

    for( i = 0 ; i < test ; i++)
    {
        cin>>b>>w>>bc>>wc>>z;
        cost1 = ((b + w) * bc) + (w * z);
        cost2 = ((b + w) * wc) + (b * z);
        cost3 = (b * bc) + (w * wc);

        m = minimum(cost1, cost2, cost3);

        cout<<m<<endl;

    }

    return 0;
}
