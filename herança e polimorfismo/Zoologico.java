public class Zoologico {

    public Animal[] jaulas;
    

    //cachorro cavalo e preguica
    public Zoologico () {
        
        jaulas = new Animal[10];
        jaulas[0] = new Cachorro("Rex", 5);
        jaulas[1] = new Cavalo("Epona", 7);
        jaulas[2] = new Preguica("Sid", 10);
        jaulas[3] = new Cachorro("Tobias", 3);
        jaulas[4] = new Cavalo("Spirit", 8);
        jaulas[5] = new Preguica("Mauricio", 12);
        jaulas[6] = new Cachorro("Rex", 5);
        jaulas[7] = new Cavalo("Epona", 7);
        jaulas[8] = new Preguica("Sid", 10);
        jaulas[9] = new Cachorro("Tobias", 3);       

}

public void emitirSomDeTodosOsAnimais() {
    for (Animal animal : jaulas) {
        animal.emitirSom();
    }
}

public void correrComTodosOsAnimais() {
    for (Animal animal : jaulas) {
        animal.correr();
         }
    }


}   
