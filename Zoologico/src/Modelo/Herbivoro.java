
package Modelo;

public class Herbivoro extends Animal {

    @Override
    public void setAlimento(int cantidadAlimentoVegetal, int cantidadAlimentoCarne) {
        AlimentoVegetal=cantidadAlimentoVegetal;
        AlimentoCarne=0;
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
