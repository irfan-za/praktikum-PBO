package tugas;

public abstract class BangunRuang {
    abstract int volume();
    abstract int luasPermukaan();
}

class Balok extends BangunRuang{
    int p=10;
    int l=5;
    int t=2;

    int volume(){
        return p*l*t;
    }
    int luasPermukaan(){
        return  2 * (p*l + l*t + p*t);
    }
}

class Kubus extends BangunRuang{
    int s=10;

    int volume(){
        return s*s*s;
    }
    int luasPermukaan(){
        return  6 * (s*s);
    }
}

class Bola extends BangunRuang{
    int r=7;

    int volume(){
        return 4/3*22/7*r*r*r;
    }
    int luasPermukaan(){
        return  4 * 22/7 *r*r;

    }
}


