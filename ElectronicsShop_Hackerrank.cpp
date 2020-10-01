#include<iostream>
using namespace std;

int main()
{
    int b, n, m, i, j, x, max = -1;
    cin>>b>>n>>m;
    
    int keyboard[n], drives[m];
    int total = m*n;
    int sum[total];

    for(i = 0 ; i < n ; i++)
    {
        cin>>x;
        keyboard[i] = x;
    }

    for(i = 0 ; i < m ; i++)
    {
        cin>>x;
        drives[i] = x;
    }

    for(i = 0 ; i < n ; i++)
    {
        for(j = 0 ; j < m ; j++)
        {
            sum[i] = keyboard[i] + drives[j];
        }
    }

    for(i = 0 ; i < total ; i++)
    {
        if(sum[i] > max && sum[i] <= b)
        max = sum[i];
    }

    cout<<max;

    return 0;
}
