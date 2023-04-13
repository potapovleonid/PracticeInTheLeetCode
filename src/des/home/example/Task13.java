package des.home.example;

public class Task13 {
    public int romanToInt(String s) {
        char prevEl = 'O';
        int sum = 0;
        for(char symbol: s.toCharArray()){
            switch(symbol){
                case 'M':
                    sum += 1000;
                    if(prevEl == ('C')){
                        sum -= 100*2;
                    }
                    prevEl = symbol;
                    break;
                case 'D':
                    sum += 500;
                    if(prevEl == ('C')){
                        sum -= 100*2;
                    }
                    prevEl = symbol;
                    break;
                case 'C':
                    sum += 100;
                    if(prevEl == ('X')){
                        sum -= 10*2;
                    }
                    prevEl = symbol;
                    break;
                case 'L':
                    sum += 50;
                    if(prevEl == ('X')){
                        sum -= 10*2;
                    }
                    prevEl = symbol;
                    break;
                case 'X':
                    sum += 10;
                    if(prevEl == ('I')){
                        sum -= 1*2;
                    }
                    prevEl = symbol;
                    break;
                case 'V':
                    sum += 5;
                    if(prevEl == ('I')){
                        sum -= 1*2;
                    }
                    prevEl = symbol;
                    break;
                case 'I':
                    sum += 1;
                    prevEl = symbol;
                    break;
            }

        }
        return sum;
    }
}
