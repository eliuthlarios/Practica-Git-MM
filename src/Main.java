public class Main {
    public static void main(String[] Args) {
        Mamals Mamifero = new Mamals("mamifer", 5);
        Dog Perrito = new Dog("buddy", 3, "chihuahua");
        Mamifero.Attack();
        Perrito.Attack();
//System.out.println("Mi nombre es: " + Perrito.Name); //Como el miembro es privado solo puedo accede
        System.out.println("Mi nombre es: " + Perrito.getName());
        Perrito.setName("Sussy");
        System.out.println("prueva Repositorio");
        System.out.println("prueva Nueva rama feature/one");
        System.out.println("Mi nombre es: " + Perrito.getName());
    }
}
