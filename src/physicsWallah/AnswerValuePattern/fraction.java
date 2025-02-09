package physicsWallah.AnswerValuePattern;

public class fraction {

    int num;
    int den;

    public fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }

    public void simplify(){
        int hcf = gcd(num,den);
        num = num / hcf;
        den = den / hcf;
    }

    public int gcd(int num, int den){
        int min = Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(num % i == 0 && den % i == 0)return i;
        }
        return min;
    }

    public static fraction add(fraction f1, fraction f2){
        int den = f1.den * f2.den;
        int num = (f1.num*f2.den) + (f2.num*f1.den);
        fraction f3 = new fraction(num ,den);
        return f3;
    }

    public static fraction mul(fraction f1, fraction f2){
        int den = f1.den * f2.den;
        int num = f1.num * f2.num;
        fraction f3 = new fraction(num ,den);
        return f3;
    }
    public static fraction sub(fraction f1, fraction f2){
        int den = f1.den * f2.den;
        int num = (f1.num*f2.den) - (f2.num*f1.den);
        fraction f3 = new fraction(num ,den);
        return f3;
    }

    public static void main(String[] args) {
        fraction f1 = new fraction(5,3);
        System.out.println(f1.num +"/" + f1.den);
        fraction f2 = new fraction(7,3);
        System.out.println(f2.num +"/" + f2.den);
        fraction f3 = add(f1,f2);
        System.out.println(f3.num +"/"+ f3.den);
        f3 = mul(f1,f2);
        System.out.println(f3.num +"/"+ f3.den);
        f3 = sub(f1,f2);
        System.out.println(f3.num +"/"+ f3.den);
    }
}
