int baseballScore(string ops){
/*TODO*/
    stack<int> s;
    for(char i : ops){
        if(i >= '0' && i <= '9'){
            s.push(i - '0');
        }else if(i == 'C'){
            s.pop();
        }else if(i == 'D'){
            int tmp = s.top()*2;
            s.push(tmp);
        }else{
            int tmp1 = s.top();
            s.pop();
            int tmp2 = s.top();
            s.push(tmp1);
            s.push(tmp1+tmp2);
        }
    }
    int res = 0;
    while(!s.empty()){
        res += s.top();
        s.pop();
    }
    return res;
}