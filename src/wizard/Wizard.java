package wizard;


public class Wizard {
    String name;
    int health = 100;
    int magicPower;
    int luck;

    public Wizard(String var1, int var2) {
        if (var2 > 10) {
            this.magicPower = 1;
        } else {
            this.magicPower = var2;
        }

        this.name = var1;
    }

    public void generateLuck(){
        this.luck = (int)(1.0 + Math.random() * 7);
    }

    public void selfHeal() {
        generateLuck();
        System.out.println(this.name + " heals themself for " + (this.magicPower * this.luck) + " increasing their health to " + (this.health+(this.magicPower*this.luck)));
        this.health += this.magicPower * this.luck;
    }

    public int castAttack(Wizard var1) {
        generateLuck();
        if (var1.health - this.magicPower * this.luck <= 0) {
            System.out.println(this.name + " casts a wave of energy at " + var1.name + " dropping their health below 0.");
            System.out.println(this.name + " is victorious!");
            System.exit(0);
            return 0;
        } else {
            System.out.println(this.name + " casts a wave of energy at " + var1.name + " dealing " + this.magicPower * this.luck + " damage! " + var1.name + "'s health is now at " + (var1.health - this.magicPower * this.luck));
            return var1.health -= this.magicPower * this.luck;
        }
    }

    public String toString() {
        return "Wizard{name='" + this.name + "', health=" + this.health + ", magicPower=" + this.magicPower + ", luck=" + this.luck + "}";
    }


    public static void main(String[] var0) {
        Wizard var1 = new Wizard("Harry Potter", 7);
        Wizard var2 = new Wizard("Draco Malfoy", 8);
        var2.castAttack(var1);
        var2.castAttack(var1);
        System.out.println("Harry is knocked to the ground. He gets up and adjusts his glasses.");
        var1.selfHeal();
        var1.castAttack(var2);
        var1.castAttack(var2);
        var1.castAttack(var2);
        System.out.println("As Harry is about to cast his next attack, he notices a pain in his forehead. Amidst this momentary distraction...");
        var2.castAttack(var1);
        var2.castAttack(var1);
    }
}