
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private static final double FEES =4.0;
    private String name;
    private int numberOfContainers;  
   
   public AirTransportation(String name, int numberOfContainers){
       this.name=name;
       this.numberOfContainers=numberOfContainers;
       this.setFees(FEES);
   }
   
   
}
