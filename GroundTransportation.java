
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private static final double FEES =3.0;
    private String licensePlate;
    
    public GroundTransportation(String licensePlate ){
        this.licensePlate=licensePlate;
        super.setFees(FEES);
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate=licensePlate;
    }
    
    public String getTransportType(){
        return "Ground Transport";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "License Plate", this.licensePlate));     
        return sb.toString();
    }

    
    
}
