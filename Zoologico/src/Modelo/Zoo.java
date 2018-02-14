
package Modelo;

import java.util.ArrayList;

public class Zoo {
    int alimentoDisponibleCarne,alimentoDisponibleVegetal,cont=0;
    Animal animal;
    
    //ArrayList<Integer[]> listaAnimal=new ArrayList<Integer[]>();
    ArrayList<ArrayList<Integer>> listaAnimal=new ArrayList<ArrayList<Integer>>();
    

    public void setAlimentoDisponibleCarne(int alimentoDisponibleCarne) {
        this.alimentoDisponibleCarne = alimentoDisponibleCarne;
    }

    public void setAlimentoDisponibleVegetal(int alimentoDisponibleVegetal) {
        this.alimentoDisponibleVegetal = alimentoDisponibleVegetal;
    }

    public int getAlimentoDisponibleCarne() {
        return alimentoDisponibleCarne;
    }

    public int getAlimentoDisponibleVegetal() {
        return alimentoDisponibleVegetal;
    }
    
    /*public void setTipoAnimal(int tipo){
        switch(tipo){
            case 1:
                animal=new Carnivoro();
                
                
            case 2: 
                animal=new Herbivoro();
                
                
            case 3:
                animal=new Omnivoro();
                ;
        }
                
    }*/
    /*public void setAlimentoDelAnimal(int alV,int alC){
        animal.setAlimento(alV, alC);  
    }*/
    public void agregarAnimal(Animal xyz){
        this.animal=xyz;
        int i;
        listaAnimal.add(new ArrayList<Integer>());
        //listaAnimal.get(0).add(animal.getAlimentoCarne());//carne
        
        listaAnimal.get(cont).add(animal.getAlimentoCarne());
        listaAnimal.get(cont).add(animal.getAlimentoVegetal());        
        cont++;        
        alimentoDisponibleCarne=alimentoDisponibleCarne-animal.getAlimentoCarne();         //revisar
        alimentoDisponibleVegetal= alimentoDisponibleVegetal-animal.getAlimentoVegetal();  //revisar
    }
    public boolean validar(Animal xyz){
        this.animal=xyz;
        boolean estado=false;
        if((animal.getAlimentoCarne()<=alimentoDisponibleCarne)&&(animal.getAlimentoVegetal()<=alimentoDisponibleVegetal)){
            estado=true;
        }
        return estado;
    }
   /* public void alimentar(){
        alimentoDisponibleCarne=alimentoDisponibleCarne-animal.getAlimentoCarne();
        alimentoDisponibleVegetal= alimentoDisponibleVegetal-animal.getAlimentoVegetal();
    }*/
   
}
