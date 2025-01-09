public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador ("Anderson Silva", "Brasil", 35,
                1.80f, 76.9f, 6, 0, 15 );
        l[1] = new Lutador("Lyoto", "Japão", 45, 1.89f,
            93.4f, 0, 0, 16);
         l[2] = new Lutador("Matheus", "Países Baixos", 29,
            1.77f, 126.2f, 1, 0, 17);
        l[3] = new Lutador("Pedro", "França", 56,
                1.63f, 126.2f, 4, 3, 10);
        l[4] = new Lutador("Shogun", "Noruega", 47,
                1.84f, 89.3f, 1, 0, 4);
        l[5] = new Lutador("Marcos", "China", 19,
                1.58f, 59.2f, 1, 0, 14);

        l[4].status();
        l[4].ganharLuta();
        l[4].status();

    }
}