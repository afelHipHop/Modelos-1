
package Modelo;

public abstract class Animal {

    int AlimentoVegetal = 0;
    int AlimentoCarne = 0;

    public abstract void setAlimento(int cantidadAlimentoVegetal,int cantidadAlimentoCarne);
    public abstract int getAlimentoCarne();
    public abstract int getAlimentoVegetal();
}
