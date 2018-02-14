
package Modelo;

public class Omnivoro extends Animal{

   @Override
    public void setAlimento(int cantidadAlimentoVegetal,int cantidadAlimentoCarne) {
        AlimentoCarne=cantidadAlimentoCarne;
        AlimentoVegetal=cantidadAlimentoVegetal;
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
