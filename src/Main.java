public class Main {
    public static void main(String[] args) {
        Boss bigBoss = new Boss();
        bigBoss.setHealth(800);
        bigBoss.setDamage(50);
        bigBoss.setDefence("Physical");
        System.out.println("Boss => " + "health: " + bigBoss.getHealth() + " damage: "
                + bigBoss.getDamage() + " attack type: " + bigBoss.getDefence());

        System.out.println("-------------------------------");

        Hero[] heroesList = createHeroes();
         for (int i = 0; i < heroesList.length; i++) {
             System.out.println((i+1) + " health: " + heroesList[i].getHealth() + " damage: "
                     + heroesList[i].getDamage() + " superpower: " + heroesList[i].getSuperpower());
        }
    }

    private static Hero[] createHeroes() {
        Hero Physical = new Hero(350, 40, "Physical");
        Hero Magical = new Hero(320, 35);
        Hero Kinetic = new Hero(300, 30, "Kinetic");
        return new Hero[]{Physical, Magical, Kinetic};
    }
}