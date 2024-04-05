
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
   
   public String getName(){
       return name;
   }
   
   public void setName(String name){
       this.name=name;
   }
   
   public int getNumberOfContainers(){
       return numberOfContainers;
   }
   
   public void setNumberOfContainers(int numberOfContainers){
       this.numberOfContainers=numberOfContainers;
   }
   
   public String getTransportType(){
        return "Air Transport";
   }
    
   @Override
   public String toString(){
       
       final StringBuilder sb = new StringBuilder(); 
       sb.append(super.toString());
       sb.append(String.format("\n%15s: %s\n", "Transport Type", getTransportType()));  
       sb.append(String.format("%15s: %s\n", "Name", this.name));     
       sb.append(String.format("%15s: %d\n", "Number Of Containers", this.numberOfContainers));
       return sb.toString();
   }
   
   
}
