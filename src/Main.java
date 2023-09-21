
public class Main {
    public static void main(String[] args) {
        BossShax bossshax = new BossShax();
        bossshax.setIdol(400);
        bossshax.setUron(250);
        bossshax.setTypeprotection("уклонение от ударов ");
        System.out.println(" жизинь Босса " + bossshax.getIdol());
        System.out.println(" урон нанесения " + bossshax.getUron());
        System.out.println(" тип защиты " + bossshax.getTypeprotection());
    }
}
