public class Animal {

     String nome;
     int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void examinar(Animal animal) {
        animal.emitirSom();
       
    }


    public String getNome() {
        return this.nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom() {
       System.out.println("Emitindo som de animal");
    }

    public void correr() {
        System.out.println("Correndo como um animal");
    }      
    
    public void subirEmArvores() {
        System.out.println("Subindo em árvores como um animal");
    }

}

class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(" Au au ");
    }

    @Override
    public void correr() {
        System.out.println(" nome: " + getNome() + " idade: " + getIdade() + " Correndo como um cachorro ");
    }

}

class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(" Relinchou ");
    }

    @Override
    public void correr() {
        System.out.println(" nome: " + getNome()  + " idade: " + getIdade() +  " galopou! ");
    }

}

class Preguica extends Animal {
    
        public Preguica(String nome, int idade) {
            super(nome, idade);
        }
    
        @Override
        public void emitirSom() {
            System.out.println(" Zzzzzz ");
        }
    
        @Override
        public void subirEmArvores() {
            System.out.println(" nome: " + getNome()  + " idade: " + getIdade() + " Subiu na árvore se arrastando ");
        }
}