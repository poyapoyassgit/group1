package th.ac.kmitl.science.comsci.example.models;

public class Company {
    
    private String id;
    private String name;
    private String globalId;  
    private String taxId;
    private ElectronicAddress ElectronicAddress;
    //TODO Create variable type of address class
    
    public Company(String id, String name, String globalId, String taxId){
        setId (id);
        setName (name);
        setGlobalId (globalId);
        setTaxId (taxId);
    }

    public void setElectronicAddress(String urlID, String email){
        this.ElectronicAddress = new ElectronicAddress(urlID,email);
    }
    
    public ElectronicAddress getElectronicAddress(){
        return ElectronicAddress;
    }
	
    public String getTaxId() {
        return taxId;
    }
	
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
	
    public String getGlobalId() {
        return globalId;
    }
	
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }
	
    public String getName() {
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public String getId() {
        return id;
    }
	
    public void setId(String id) {
        this.id = id;
    }
}

