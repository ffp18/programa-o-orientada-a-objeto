

public class Main {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Veterinario veterinario = new Veterinario();

        for (Animal animal : zoo.jaulas) {
            System.out.println("-------------------------");

        
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());

          
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                System.out.println("Corre: " + cachorro.getNome() + " correu como um cachorro!");

            } else if (animal instanceof Cavalo) {
                Cavalo cavalo = (Cavalo) animal;
                System.out.println("Corre: " + cavalo.getNome() + " galopou!");

            } else if (animal instanceof Preguica) {
                Preguica preguica = (Preguica) animal;
                System.out.println("rasteja: " + preguica.getNome() + " se arrastou preguiçosamente!");
            }

           
            System.out.println("Examinando...");
            veterinario.examinar(animal);

            System.out.println("-------------------------");
        }
    }
}