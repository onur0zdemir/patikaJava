public class Match {
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;

    Match(Boxer b1, Boxer b2, int minWeight, int maxWeight) {
        this.b1 = b1;
        this.b2 = b2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            System.out.println(this.b1.name + " Health: " + this.b1.health);
            System.out.println(this.b2.name + " Health: " + this.b2.health);
            while (this.b1.health > 0 && this.b2.health > 0) {
                System.out.println("=====New Round=====");
                int firstStart = (int) (Math.random() * 2);
                if (firstStart < 1) {
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()) {
                        break;
                    }
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.b1.name + " Health: " + this.b1.health);
                    System.out.println(this.b2.name + " Health: " + this.b2.health);
                } else {
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()) {
                        break;
                    }
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.b1.name + " Health: " + this.b1.health);
                    System.out.println(this.b2.name + " Health: " + this.b2.health);
                }
            }
        } else {
            System.out.println("Weight classes of boxers do not fit");
        }
    }

    boolean isCheck() {
        return (this.b1.weight >= minWeight && this.b1.weight <= maxWeight) && (this.b2.weight >= minWeight && this.b2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.b1.health == 0) {
            System.out.println(this.b2.name + " won!");
            return true;
        }
        if (this.b2.health == 0) {
            System.out.println(this.b1.name + " won!");
            return true;
        }
        return false;
    }
}
