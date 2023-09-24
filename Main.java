public static int input(String text) {
    System.out.print(text);

    int out;

    while (!sc.hasNextInt()) {
        System.out.print("Masukkan bilangan bulat yang valid: ");
        sc.next();
    }
    out = sc.nextInt();
    
    return out;
}
