import java.util.Scanner;

public class Main {
    // Variables d'instance
    public static Scanner scanner = new Scanner(System.in);
    public static AudioPlayer player = new AudioPlayer();


    // faire la somme de 2 entiers
    public void additionner(int x, int y){
        System.out.println(x + y);
    }
    // afficher le menu principal
    public static void afficherMenu(){
        System.out.println("+=====================================+"
                    + "\n              GUESS ME!             "
                    + "\n+=====================================+"
                    + "\n1. JOUER"
                    + "\n2. SON"
                    + "\n3. QUITTER"
                    + "\n+=====================================+");
    }
    // afficher les options de jeu
    public static void afficherDifficulte(){
        System.out.println("+=====================================+"
                    + "\nChoisissez votre difficulte: "
                    + "\n-----------------------------------------"
                    + "\n1. FACILE"
                    + "\n2. NORMAL"
                    + "\n3. DIFFICILE"
                    + "\n-----------------------------------------"
                    + "\n4. RETOURNER AU MENU PRINCIPAL"
                    + "\n+=====================================+");
    }

    // afficher la confirmation de difficulte
    public static void afficherConfirmationDiff(){
        System.out.println("+=====================================+"
                                    + "\nEtes vous surs de votre difficulte: "
                                    + "\n-----------------------------------------"
                                    + "\n1. Oui"
                                    + "\n2. Non"
                                    + "\n+=====================================+");
    }

    // afficher liste sons
    public static void afficherListeSons(){
        System.out.println("+=====================================+"
                + "\n1. Irish Sunset"
                + "\n2. Time Alone"
                + "\n3. Desactiver la musique"
                + "\n-----------------------------------------"
                + "\n4. RETOURNER AU MENU PRINCIPAL"
                + "\n+=====================================+"
        );
    }

    // choix menu principal
    public static void choixMenuPrincipal(int usrInput){
        do {
            afficherMenu();
            usrInput = scanner.nextInt();
            switch (usrInput){
                case 1:
                    System.out.println("Vous avez choisi l'option: \"JOUER\"");
                    afficherDifficulte();
                    break;
                case 2:
                    System.out.println("Vous avez choisi l'option: \"SONS\"");
                    usrInput = -1;
                    choixMusique(usrInput);
                    break;
                case 3:
                    System.out.println("FERMETURE...");
                    break;
                default:
                    System.out.println("Le choix est invalide! Veuillez reessayer");
            }
        }while (usrInput != 3);
        System.out.println("A toute pour plus de devinettes!");
        scanner.close();
    }

    // choix de la musique de jeu
    public static void choixMusique(int usrInput){
        do {
            afficherListeSons();
            usrInput = scanner.nextInt();
            switch (usrInput){
                case 1:
                    System.out.println("vous allez jouez le son : \"Irish Sunset\"");
                    desactiverMusic();
                    jouerIrishSunset();
                    break;
                case 2:
                    System.out.println("vous allez jouez le son : \"Time Alone\"");
                    desactiverMusic();
                    jouerTimeAlone();
                    break;
                case 3:
                    System.out.println("Vous avez desactive la musique de jeu.");
                    desactiverMusic();
                    break;
                case 4:
                    System.out.println("Vous allez retournez au menu principal...");
                    break;
                default:
                    System.out.println("Le choix est invalide! Veuillez reessayer");
            }
        }while (usrInput != 4);
    }

    // jouer le son Irish Sunset
    public static void jouerIrishSunset(){
        player.playMusic("C:\\ProjectsWithOumou\\GuessMe\\Music\\Irish_Sunset.wav");
    }
    // jouer le son Time Alone
    public static void jouerTimeAlone(){
        AudioPlayer player = new AudioPlayer();
        player.playMusic("C:\\ProjectsWithOumou\\GuessMe\\Music\\Time_Alone.wav");
    }
    // stoppe le son en cours
    public static void desactiverMusic(){
        player.stopMusic();
    }
    public static void main(String[] args) {
        int usrInput = -1;
        choixMenuPrincipal(usrInput);


//        // menu principal
//        afficherMenu();
//        do {
//
//            // afficher le menu
//            System.out.println("+=====================================+"
//                    + "\n              GUESS ME!             "
//                    + "\n+=====================================+"
//                    + "\n1. JOUER"
//                    + "\n2. SON"
//                    + "\n3. QUITTER"
//                    + "\n+=====================================+");
//
//            // solliciter l'utilisateur
//            usrInput = scanner.nextInt();
//            // afficher l'option choisie
//            if (usrInput == 1 || usrInput == 2 ){
//                System.out.println("Vous avez choisi l'option: " + usrInput + "!");
//            }
//
//            // choix 1
//            // choix difficulte
//            if (usrInput == 1){
//                // reinitialiser l'input a chaque tour de boucle
//                usrInput = 0;
//                do {
//                    System.out.println("+=====================================+"
//                    + "\nChoisissez votre difficulte: "
//                    + "\n-----------------------------------------"
//                    + "\n1. FACILE"
//                    + "\n2. NORMAL"
//                    + "\n3. DIFFICILE"
//                    + "\n-----------------------------------------"
//                    + "\n4. RETOURNER AU MENU PRINCIPAL"
//                    + "\n+=====================================+");
//
//                    // solliciter l'utilisateur
//                    usrInput = scanner.nextInt();
//                    // afficher la difficulte choisie
//                    if (usrInput == 1 || usrInput == 2 || usrInput == 3){
//                        System.out.println("Vous avez choisi la difficulte: " + usrInput + "!");
//                        do {
//                            System.out.println("+=====================================+"
//                                    + "\nEtes vous surs de votre difficulte: "
//                                    + "\n-----------------------------------------"
//                                    + "\n1. Oui"
//                                    + "\n2. Non");
//
//                                    // solliciter l'utilisateur
//                                    usrInput = scanner.nextInt();
//                                    if (usrInput == 1){
//                                        System.out.println("Votre partie va bientot commencer...");
//                                        // TODO: Definir les questions pour la prochaine fois
//
//                                        // Message apology
//                                        System.out.println("Oh!!! Desole! Nous n'avons pas encore de questions a vous proposer. " +
//                                                "Revenez la prochaine fois!🥺");
//                                        // fin programme
//                                        System.exit(0);
//                                    }
//                        }while (usrInput != 2);
//                        // reinitialiser l'input a chaque tour de boucle
//                        usrInput = 0;
//                    }
//                }while (usrInput != 3);
//                // reinitialiser l'input a chaque tour de boucle
//                usrInput = 0;
//            }
//
//        }while (usrInput != 3);
//        // fin programme
//        System.out.println("A toute pour plus de devinettes!");
    }
}