class Employee {
    float da, hra, ma, base;

    Employee(float base, float da, float hra, float ma) {
        this.base = base;
        this.da = da * base;
        this.hra = hra * base;
        this.ma = ma * base;
    }

    float regular_salary() {
        return base + da + hra + ma;
    }
}

class Scientist extends Employee {
    float bpa;
    float cnt;

    Scientist(float base, float da, float hra, float ma, float bpa, float cnt) {
        super(base, da, hra, ma);
        this.bpa = bpa;
        this.cnt = cnt;
    }

    float Scientist_Salary() {
        return regular_salary() + (bpa * cnt);
    }
}

class Developer extends Employee {
    float pat;
    float cnt;

    Developer(float base, float da, float hra, float ma, float pat, float cnt) {
        super(base, da, hra, ma);
        this.pat = pat;
        this.cnt = cnt;
    }

    float Developer_Salary() {
        return regular_salary() +( pat * cnt);
    }
}

public class Salary {
    public static void main(String[] args) {
        Scientist s = new Scientist(50000f, 0.02f, 0.03f, 0.02f, 1000f, 3f);
        System.out.println("Sci Salary : " + s.Scientist_Salary());

        Developer d = new Developer(50000f, 0.02f, 0.03f, 0.02f, 1000f, 3f);
        System.out.println("Dev Salary : " + d.Developer_Salary());
    }
}