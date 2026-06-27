// Parent Class
class Wonder {

    void display() {
        System.out.println("Seven Wonders of the World");
    }
}

// Child Class 1
class TajMahal extends Wonder {

    @Override
    void display() {
        System.out.println("Taj Mahal - Agra, India");
    }
}

// Child Class 2
class GreatWall extends Wonder {

    @Override
    void display() {
        System.out.println("Great Wall of China - China");
    }
}

// Child Class 3
class Petra extends Wonder {

    @Override
    void display() {
        System.out.println("Petra - Jordan");
    }
}

// Child Class 4
class Colosseum extends Wonder {

    @Override
    void display() {
        System.out.println("Colosseum - Rome, Italy");
    }
}

// Child Class 5
class ChichenItza extends Wonder {

    @Override
    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

// Child Class 6
class MachuPicchu extends Wonder {

    @Override
    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

// Child Class 7
class ChristRedeemer extends Wonder {

    @Override
    void display() {
        System.out.println("Christ the Redeemer - Rio de Janeiro, Brazil");
    }
}

// Main Class
public class seven {

    public static void main(String[] args) {

        Wonder w;

        w = new TajMahal();
        w.display();

        w = new GreatWall();
        w.display();

        w = new Petra();
        w.display();

        w = new Colosseum();
        w.display();

        w = new ChichenItza();
        w.display();

        w = new MachuPicchu();
        w.display();

        w = new ChristRedeemer();
        w.display();
    }
}
