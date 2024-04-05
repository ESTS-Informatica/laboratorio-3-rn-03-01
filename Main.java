
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    
    public void main(String args[]){
        ShippingCompany shippingCompany= new ShippingCompany("RELIABLE-MOVING");
        GroundTransportation groundTransportation= new GroundTransportation("Car");
        AirTransportation airTransportation= new AirTransportation("Airplane",7);
        AirTransportation airTransportation2= new AirTransportation("Boat",5);
        Lorry lorry= new Lorry(2,2,"ABC-123");
        Van van= new Van(2,"DFG-456");
        
        shippingCompany.add(groundTransportation);
        shippingCompany.add(airTransportation);
        shippingCompany.add(airTransportation2);
        shippingCompany.add(lorry);
        shippingCompany.add(van);
        
        for(Transport transport : shippingCompany){
            transport.toString();
        }
    }
    
    public void makeTransportation(String id, String origin, String destination, boolean price){
        
    }
    
}
