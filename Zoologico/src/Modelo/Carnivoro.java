
package Modelo;


public class Carnivoro extends Animal{

    @Override
    public void setAlimento(int cantidadAlimentoVegetal,int cantidadAlimentoCarne) {
        AlimentoCarne=cantidadAlimentoCarne;
        AlimentoVegetal=0;
    }

    @Override
    public int getAlimentoCarne() {
        return AlimentoCarne;
    }

    @Override
    public int getAlimentoVegetal() {
        return AlimentoVegetal;
    }

    
    

    

    
    
}
