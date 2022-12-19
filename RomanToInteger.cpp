class Solution {
public:
    int romanToInt(string s) {
        int number=0;
        for(int i=0; i<s.length(); i++){
            if(i>0){
                if((s[i]=='V' && s[i-1]=='I')||(s[i]=='X' && s[i-1]=='I')){
                    number-=2;
                }
                if((s[i]=='L' && s[i-1]=='X')||(s[i]=='C' && s[i-1]=='X')){
                    number-=20;
                }
                if((s[i]=='D' && s[i-1]=='C')||(s[i]=='M' && s[i-1]=='C')){
                    number-=200;
                }
            }
            if(s[i]=='I'){
                number+=1;
            }
            else if(s[i]=='V'){
                number+=5;
            }
            else if(s[i]=='X'){
                number+=10;
            }
            else if(s[i]=='L'){
                number+=50;
            }
            else if(s[i]=='C'){
                number+=100;
            }
            else if(s[i]=='D'){
                number+=500;
            }
            else if(s[i]=='M'){
                number+=1000;
            }
        }
        return number;
    }
};
