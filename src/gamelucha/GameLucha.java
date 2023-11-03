package gamelucha;

public class GameLucha {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int dl1 = 0, dl2 = 0;

        Luchador l1 = new Luchador("Alejandro", 200, 100, 90, 60);
        Luchador l2 = new Luchador("Pepe", 200, 100, 90, 60);

        while (l1.getHp() > 0 && l2.getHp() > 0) {
            dl1 = (int) (Math.random() * (6 - 1 + 1)) + 1;//dado luchador 1  
            dl2 = (int) (Math.random() * (6 - 1 + 1)) + 1;//dadoluchador 2      

            System.out.println("\nTiro de dados para turno.....");
            System.out.println("Dado luchador 1: " + dl1);
            System.out.println("Dado luchador 2: " + dl2);
            System.out.println(" ");

            if (dl1 > dl2) {
                System.out.println("Gano luchador 1 y pega primero:");
                System.out.println("Ataque de: " + l1.getNombre());
                l1.atacarLuchador(l2);
            } else if (dl2 > dl1) {
                System.out.println("Gano luchador 2- ataca primero:");
                System.out.println("Ataque de: " + l2.getNombre());
                l2.atacarLuchador(l1);
            }
            

        }

        //Se imprimen en pantalla los valores finales:
        System.out.println("\n Resultado final ");
        System.out.println("Alejandro hp: " + l1.getHp());
        System.out.println("Pepe hp: " + l2.getHp());
        */
        System.out.println("----raza1");
        Raza1 r1 = new Raza1();
        r1.atacar();
        r1.curar();
        r1.ataqueFuego();
        
        
        System.out.println("----raza2");
        Raza2 r2 = new Raza2();
        r2.roboVida();
        r2.ataqueHielo();
        
        System.out.println("----raza3");
        Raza3 r3 = new Raza3();
        r3.dobleAtaque();
        r3.escapar();
    } 

}
